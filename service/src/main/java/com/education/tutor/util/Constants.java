package com.education.tutor.util;

import com.education.tutor.config.KeyDef;
import org.springframework.http.HttpHeaders;

public class Constants {

//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xMzcxODM2MzAyNSIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUwNDI0ODE1MiwiaWF0IjoxNTAxNjU2MTUyOTY2fQ.kohcX_Ul9DGmuM7U5VfkOVDH80IBKLBGAZwG8DSmnAU";
	
	
//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xODIxMDkyMDczOSIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUwODkwNDA1OCwiaWF0IjoxNTA2MzEyMDU4MDIwfQ.sM_dIxwDI6hsQ0kwPby5mc_j4i5gPO5ffd9QYxtp3rU";
	//191 --jingjie
//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xODgxMTE3MjEwMyIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUxNTYzODM2NSwiaWF0IjoxNTEzMDQ2MzY1NjY5fQ.VuEhZR9l9N4St9tV_0v_aachMRoEjeYvkH552ci00Wo";
//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xODYxMDQ3NjQ2MiIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUwNjU4ODY2NSwiaWF0IjoxNTAzOTk2NjY1MTU2fQ.W8wKKqACDpZ6QN8cFU80W0RPAAR8FQmTdTe2-8C3-Ho";
	//225 id
//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xMzY2MDMyNjAzNyIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUwNjY3NjI0NywiaWF0IjoxNTA0MDg0MjQ3NDUxfQ.fXH8l0WBbjmNsTLTpyj5t4i3NORM0RsyYpyxMd2mMrA";
	//1711
//	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xMzcwMTM4MTcxMSIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUxNzcwODA0NCwiaWF0IjoxNTE1MTE2MDQ0NjA2fQ.ijDO_I4h61K-p0pTtY0aLdx3G1pUSIyJKqwGDPac7bw";
	//test 205
	public final static String TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Ni0xNTkxMDc5MzM5MSIsImF1ZGllbmNlIjoidW5rbm93biIsImV4cCI6MTUxODY4MjQyMywiaWF0IjoxNTE2MDkwNDIzMjU3fQ.oZwiQUrNA2p6O_5vNXeFd288RfOTUgltNlYRX6EL7Ps";
	
	public final static String LANG = "zh";
	
	/**
	 * 获取包含用户令牌信息的http数据
	 * @return
	 */
	public static HttpHeaders getHttpHeaders(){
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add(KeyDef.tokenHeader, TOKEN);//令牌信息设置
		requestHeaders.add("terminalType", "3");
		return requestHeaders;
	}

}
