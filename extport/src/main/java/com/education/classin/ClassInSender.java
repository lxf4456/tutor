package com.education.classin;

import com.qcloud.sms.SmsSenderUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClassInSender {
	String  SID = "2674186";
	String secret = "oMcVbLqO";
    String url = "http://www.eeo.cn/partner/api/course.api.php?action=";


	public ClassInBasicRes send(ClassInBasicReq vo) throws Exception {

		SmsSenderUtil util = new SmsSenderUtil();
		long curTime = Calendar.getInstance().getTimeInMillis()/1000;

		// 按照协议组织 post 请求包体
		JSONObject data = new JSONObject();
        data.put("SID", SID);
        data.put("safeKey", util.stringMD5(secret+curTime));
        data.put("timeStamp", curTime);

		for (Map.Entry<String, Object> entry : getKeyAndValue(vo).entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			data.put(entry.getKey(),entry.getValue());
		}

		String wholeUrl = url+vo.getAction();
        HttpURLConnection conn = util.getPostHttpConn(wholeUrl);

        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
        wr.write(data.toString());
        wr.flush();

        // 显示 POST 请求返回的内容
        StringBuilder sb = new StringBuilder();
        int httpRspCode = conn.getResponseCode();
		ClassInBasicRes res = new ClassInBasicRes();
        if (httpRspCode == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
			JSONObject json = new JSONObject(sb.toString());
			res.setErrno(json.getJSONObject("error_info").getInt("errno"));
			res.setError(json.getJSONObject("error_info").getString("error"));
			res.setData(json.getString("data"));
		} else {
			res.setErrno(httpRspCode);
			res.setError("http error " + httpRspCode + " " + conn.getResponseMessage());
        }
        
        return res;
	}




	public static Map<String, Object> getKeyAndValue(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 得到类对象
		Class userCla = (Class) obj.getClass();
		/* 得到类中的所有属性集合 */
		Field[] fs = userCla.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			f.setAccessible(true); // 设置些属性是可以访问的
			Object val = new Object();
			try {
				val = f.get(obj);
				// 得到此属性的值

				if(f.getName().equals("action")){
					continue;
				}
				map.put(f.getName(), val);// 设置键值
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			/*
			 * String type = f.getType().toString();//得到此属性的类型 if
			 * (type.endsWith("String")) {
			 * System.out.println(f.getType()+"\t是String"); f.set(obj,"12") ;
			 * //给属性设值 }else if(type.endsWith("int") ||
			 * type.endsWith("Integer")){
			 * System.out.println(f.getType()+"\t是int"); f.set(obj,12) ; //给属性设值
			 * }else{ System.out.println(f.getType()+"\t"); }
			 */

		}
		System.out.println("单个对象的所有键值==反射==" + map.toString());
		return map;
	}

}

