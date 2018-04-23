package com.education.tutor.batch.job;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	StringRedisTemplate redisTemplate;

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");

			List<LineData> results = jdbcTemplate.query("SELECT '1','2'", new RowMapper<LineData>() {
				@Override
				public LineData mapRow(ResultSet rs, int row) throws SQLException {
					return new LineData(rs.getString(1), rs.getString(2));
				}
			});

			for (LineData ld : results) {
				log.info("Found <" + ld + "> in the database.");
			}

		}
	}
}
