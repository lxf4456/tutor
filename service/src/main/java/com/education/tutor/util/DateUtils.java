package com.education.tutor.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class DateUtils {
	
	public static final String FORMATSTR = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 获取当前系统时间字符串形式<br/>
	 * 格式：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getNowTimeStr() {
		SimpleDateFormat fm = new SimpleDateFormat(FORMATSTR);
		return fm.format(Calendar.getInstance().getTime());
	}
	
	public static String getDateStr(Date date,String fromatStr) {
		if(fromatStr == null || fromatStr.trim().length()<1) {
			fromatStr = FORMATSTR;
		}
		SimpleDateFormat fm = new SimpleDateFormat(fromatStr);
		return fm.format(date);
	}
	
	public static Date getDate2Str(String str,String fromatStr) throws ParseException {
		if(fromatStr == null || fromatStr.trim().length()<1) {
			fromatStr = FORMATSTR;
		}
		SimpleDateFormat fm = new SimpleDateFormat(fromatStr);
		return fm.parse(str);
	}
	
	public static int getDaysBetween(Date d1 ,Date d2) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		d1=sdf.parse(sdf.format(d1));  
		d2=sdf.parse(sdf.format(d2));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(d1);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(d2);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));
	}
	
	/**
	 * 获取日期间隔天数
	 * @param date 
	 * @param deff 间隔天数 ，支持正负数
	 * @return
	 */
	public static Date getDateByDeff(Date date,int diff) {
		Calendar calendar=Calendar.getInstance();  
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+diff);
		return calendar.getTime();
		
	}
	
	
	public static Date getNowTime() {
		return Calendar.getInstance().getTime();
	}
	
	/** 
     * 将文字转为汉语拼音
     * @param chineselanguage 要转成拼音的中文
     */
    public static String toHanyuPinyin(String ChineseLanguage){
        char[] cl_chars = ChineseLanguage.trim().toCharArray();
        String hanyupinyin = "";
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 输出拼音全部小写
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);// 不带声调
        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_V) ;
        try {
            for (int i=0; i<cl_chars.length; i++){
                if (String.valueOf(cl_chars[i]).matches("[\u4e00-\u9fa5]+")){// 如果字符是中文,则将中文转为汉语拼音
                    hanyupinyin += PinyinHelper.toHanyuPinyinStringArray(cl_chars[i], defaultFormat)[0];
                } else {// 如果字符不是中文,则不转换
                    hanyupinyin += cl_chars[i];
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin;
    }
	
	public static void main(String[] args) throws ParseException {
		String s = "ab,bc";
		String [] a= s.split(",");
		for(String a1 : a) {
			System.out.println(a1);
		}
	
	}

}
