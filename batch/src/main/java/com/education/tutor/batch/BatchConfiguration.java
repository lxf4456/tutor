package com.education.tutor.batch;

import com.education.tutor.batch.job.JobCompletionNotificationListener;
import com.education.tutor.batch.job.LineData;
import com.education.tutor.batch.job.RedisCacheItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

public class BatchConfiguration {

	@Autowired
	JobBuilderFactory jobBuilderFactory;

	@Autowired
	StepBuilderFactory stepBuilderFactory;

	@Autowired
	DataSource dataSource;

	@Bean
	public FlatFileItemReader<LineData> reader() {
		FlatFileItemReader<LineData> reader = new FlatFileItemReader<LineData>();
		reader.setResource(new ClassPathResource("sample-data.csv"));
		reader.setLineMapper(new DefaultLineMapper<LineData>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames(new String[] { "firstName", "lastName" });
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<LineData>() {
					{
						setTargetType(LineData.class);
					}
				});
			}
		});
		return reader;
	}

	@Bean
	public RedisCacheItemProcessor processor() {
		return new RedisCacheItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<LineData> writer() {
		JdbcBatchItemWriter<LineData> writer = new JdbcBatchItemWriter<LineData>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<LineData>());
		writer.setSql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)");
		writer.setDataSource(dataSource);
		return writer;
	}

	@Bean
	public Job rebuildRedisCache(JobCompletionNotificationListener listener) {
		return jobBuilderFactory.get("rebuildRedisCache").incrementer(new RunIdIncrementer()).listener(listener)
				.flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<LineData, LineData>chunk(10).reader(reader()).processor(processor())
				.writer(writer()).build();
	}
}
