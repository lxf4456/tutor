package com.education.appbk.web.controller;


import com.education.Application;
import com.education.tutor.api.classin.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ClassInControllerTest {
	
	
	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void registerTests() {
		RegisterReq req = new RegisterReq();
		req.setTelephone("13811587935");
		req.setPassword("123456");
		req.setNickname("liu_student2");


		RegisterRes res = testRestTemplate.postForObject("/classIn/registre", req, RegisterRes.class);
		System.out.println("student--------->"+res.getStudentId());
		//13811587934---->2278308
		//13811587935---->2278550
	}
	@Test
	public void editPasswortTests() {
		EditPasswortReq req = new EditPasswortReq();
		req.setTelephone("13811587934");
		req.setPassword("654321");
		req.setOldPass("123456");
		EditPasswortRes res = testRestTemplate.postForObject("/classIn/editPasswort", req, EditPasswortRes.class);
	}

	@Test
	public void editUserBasicTests() {
		EditUserBasicReq req = new EditUserBasicReq();
		req.setTelephone("13811587934");
		req.setNickname("ll");
		EditUserBasicRes res = testRestTemplate.postForObject("/classIn/editUserBasic", req, EditUserBasicRes.class);
	}



	@Test
	public void addCourseTest() {
		AddCourseReq req = new AddCourseReq();
		req.setCourseName("liu_course");
		AddCourseRes res = testRestTemplate.postForObject("/classIn/addCourse", req, AddCourseRes.class);
		System.out.println("course--------->"+res.getCourseId());
		//3506849

	}

	@Test
	public void editCourseTest() {
		EditCourseReq req = new EditCourseReq();
		req.setCourseName("liu_course2");
		req.setCourseId(3506849);
		EditCourseRes res = testRestTemplate.postForObject("/classIn/editCourse", req, EditCourseRes.class);


	}

	@Test
	public void addTeacherTest() {
		AddTeacherReq req = new AddTeacherReq();
		req.setTeacherAccount("13811343482");
		req.setTeacherName("liu");
		AddTeacherRes res = testRestTemplate.postForObject("/classIn/addTeacher", req, AddTeacherRes.class);
		System.out.println("teacher------->"+res.getTeachId());
		//180381
	}
	@Test
	public void addOneCourseClassTest() {
		AddOneCourseClassReq req = new AddOneCourseClassReq();

		req.setBeginTime(getDate("2018-10-01 10:00:00").getTime());
		req.setClassName("liu_class_test");
		req.setCourseId(3506849);
		req.setEndTime(getDate("2018-10-01 11:00:00").getTime());
		req.setSeatNum(2);
		req.setTeacherAccount("13811343482");
		req.setTeacherName("liu");

		AddOneCourseClassRes res = testRestTemplate.postForObject("/classIn/addOneCourseClass", req, AddOneCourseClassRes.class);
		System.out.println("class------->"+res.getClassId());
		//13714703

	}

	@Test
	public void editCourseClass() {
		EditCourseClassReq req = new EditCourseClassReq();

		req.setBeginTime(getDate("2018-10-01 13:00:00").getTime());
		req.setClassName("liu_test1");
		req.setCourseId(3506849);
		req.setEndTime(getDate("2018-10-01 14:00:00").getTime());
		req.setTeacherAccount("13811343482");
		req.setTeacherName("liu1");
		req.setClassId(13714703);

		EditCourseClassRes res = testRestTemplate.postForObject("/classIn/editCourseClass", req, EditCourseClassRes.class);


	}


	@Test
	public void addCourseStudent() {
		AddCourseStudentReq req = new AddCourseStudentReq();
		req.setCourseId(3506849);
		req.setIdentity(1);
		req.setStudentAccount("13811587934");
		req.setStudentName("liu_student");
		testRestTemplate.postForObject("/classIn/addCourseStudent", req, AddCourseStudentRes.class);
	}

	@Test
	public void changeTeacher() {
		ChangeTeacherReq req = new ChangeTeacherReq();
		req.setCourseId(1);
		req.setTeacherAccount("");
		testRestTemplate.postForObject("/classIn/changeTeacher", req, ChangeTeacherRes.class);
	}


	@Test
	public void editTeacher() {
		EditTeacherReq req = new EditTeacherReq();
		req.setSt_id(180381);
		req.setTeacherName("liu_edit");
		testRestTemplate.postForObject("/classIn/editTeacher", req, EditTeacherRes.class);
	}


	@Test
	public void delCourseClass() {
		DelCourseClassReq req = new DelCourseClassReq();
		req.setClassId(1);
		req.setCourseId(1);
		testRestTemplate.postForObject("/classIn/delCourseClass", req, DelCourseClassRes.class);
	}


	@Test
	public void delCourse() {
		DelCourseReq req = new DelCourseReq();
		req.setCourseId(1);
		testRestTemplate.postForObject("/classIn/delCourse", req, DelCourseRes.class);
	}


	@Test
	public void delCourseStudent() {
		DelCourseStudentReq req = new DelCourseStudentReq();
		req.setCourseId(1);
		req.setIdentity(1);
		req.setStudentAccount("liu_student");
		testRestTemplate.postForObject("/classIn/delCourseStudent", req, DelCourseStudentRes.class);
	}

	@Test
	public void getTempLoginKey() {
		GetTempLoginKeyReq req = new GetTempLoginKeyReq();
		req.setTelephone("13811343482");
		GetTempLoginKeyRes res = testRestTemplate.postForObject("/classIn/getTempLoginKey", req, GetTempLoginKeyRes.class);
		System.out.println("loing key--------->"+res.getKey());
	}

	public static Date getDate(String time) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return formatter.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	  
}
