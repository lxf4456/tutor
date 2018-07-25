package com.education.classin;

import com.qcloud.sms.SmsSenderUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClassInSender {
	String  SID = "2674186";
	String secret = "oMcVbLqO";
    String cliassIn_url = "http://www.eeo.cn/partner/api/course.api.php?action=";
	private final Log logger = LogFactory.getLog(this.getClass());


	public ClassInBasicRes send(ClassInBasicReq vo) {
		SmsSenderUtil util = new SmsSenderUtil();
		ClassInBasicRes res = new ClassInBasicRes();
		long curTime = System.currentTimeMillis()/1000L;
		try {
			//发送POST请求
			URL url = new URL(cliassIn_url+vo.getAction());

			StringBuffer parm = new StringBuffer();
			parm.append("SID=").append(SID).append("&");
			parm.append("safeKey=").append(getMD5Str(secret+curTime)).append("&");
			parm.append("timeStamp=").append(curTime).append("&");

			for (Map.Entry<String, Object> entry : getKeyAndValue(vo).entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				parm.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
			}
			logger.debug("url------------->"+cliassIn_url+vo.getAction());
			logger.debug("parm------------->"+parm.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Cache-Control", "no-cache");
			conn.setUseCaches(false);
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", "" + (parm.toString().length()-1));
			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(parm.toString().substring(0,parm.toString().length()-1));
			out.flush();
			out.close();
			//获取响应状态
			StringBuilder sb = new StringBuilder();
			int httpRspCode = conn.getResponseCode();
			if (httpRspCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				br.close();
				JSONObject json = new JSONObject(sb.toString());
				logger.debug("------------->"+sb.toString());
				res.setErrno(json.getJSONObject("error_info").getInt("errno"));
				res.setError(json.getJSONObject("error_info").getString("error"));
				if(json.has("data")){
					res.setData(json.getString("data"));
				}

			} else {
				res.setErrno(httpRspCode);
				res.setError("http error " + httpRspCode + " " + conn.getResponseMessage());
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
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
		}
		return map;
	}


	private String getMD5Str(String str) {
		String result = "";
		try {

			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update((str).getBytes("UTF-8"));
			byte b[] = md5.digest();

			int i;
			StringBuffer buf = new StringBuffer("");

			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buf.append("0");
				}
				buf.append(Integer.toHexString(i));
			}

			result = buf.toString();
		}catch (Exception e){
			e.printStackTrace();
		}
		return  result;
	}

}

