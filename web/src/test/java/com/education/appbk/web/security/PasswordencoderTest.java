package com.education.appbk.web.security;

import org.junit.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordencoderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("below is the original password '123456' 10 hashed value");
		String password = "regi!@#890";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println(hashedPassword);

		List<Long> temp = new ArrayList<Long>();
		System.out.println("empty stream joining");
		String result = temp.stream().map(l -> "" + l).collect(Collectors.joining(","));
		System.out.println(result.length());
	}

}
