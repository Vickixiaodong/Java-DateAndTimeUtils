package com.sasa.utils.time;

import java.util.Date;

/**
 * 时间工具类
 * @author xiexiaodong
 *
 */
public class SASATimeUtils {
	
	/*
	 * 小时二十四进制：09表示上午9点(0~23)
	 */
	public static String getCurrentHour24() {
		String currentHour24 = null;
		Date date = new Date();
		
		currentHour24 = String.format("%tH", date);
		
		return currentHour24;
	}
	
	/*
	 * 小时二十四进制简写：9表示上午9点(0~23)
	 */
	public static String getSimpleCurrentHour24() {
		String simpleCurrentHour24 = null;
		Date date = new Date();
		
		simpleCurrentHour24 = String.format("%tk", date);
		
		return simpleCurrentHour24;
	}
	
	/*
	 * 小时十二进制：09表示9点(1~12)
	 */
	public static String getCurrentHour12() {
		String currentHour12 = null;
		Date date = new Date();
		
		currentHour12 = String.format("%tI", date);
		
		return currentHour12;
	}
	
	/*
	 * 小时十二进制简写：9表示9点(1~12)
	 */
	public static String getSimpleCurrentHour12() {
		String simpleCurrentHour12 = null;
		Date date = new Date();
		
		simpleCurrentHour12 = String.format("%tl", date);
		
		return simpleCurrentHour12;
	}
	
	/*
	 * 分钟：04(00~59)
	 */
	public static String getCurrentMinute() {
		String currentMinute = null;
		Date date = new Date();
		
		currentMinute = String.format("%tM", date);
		
		return currentMinute;
	}
	
	/*
	 * 分钟简写：4(0~59)
	 */
	public static String getSimpleCurrentMinute() {
		String simpleCurrentMinute = null;
		String currentMinute = getCurrentMinute();
		int currentMin = Integer.parseInt(currentMinute);
		
		simpleCurrentMinute = "" + currentMin;
		
		return simpleCurrentMinute;
	}
	
	/*
	 * 秒：03(00~60)
	 */
	public static String getCurrentSecond() {
		String currentSecond = null;
		Date date = new Date();
		
		currentSecond = String.format("%tS", date);
		
		return currentSecond;
	}
	
	/*
	 * 秒简写：03(0~60)
	 */
	public static String getSimpleCurrentSecond() {
		String simpleCurrentSecond = null;
		String currentSecond = getCurrentSecond();
		int currentS = Integer.parseInt(currentSecond);
		
		simpleCurrentSecond = "" + currentS;
		
		return simpleCurrentSecond;
	}
	
	/*
	 * 毫秒：(000~999)
	 */
	public static String getCurrentMillisecond() {
		String currentMillisecond = null;
		Date date = new Date();
		
		currentMillisecond = String.format("%tL", date);
		
		return currentMillisecond;
	}
	
	/*
	 * 毫秒简写：(0~999)
	 */
	public static String getSimpleCurrentMillisecond() {
		String simpleCurrentMillisecond = null;
		String currentMillisecond = getCurrentMillisecond();
		int currentM = Integer.parseInt(currentMillisecond);
		
		simpleCurrentMillisecond = "" + currentM;
		
		return simpleCurrentMillisecond;
	}
	
	/*
	 * 微秒：(000000000~999999999)
	 */
	public static String getCurrentMicrosecond() {
		String currentMicrosecond = null;
		Date date = new Date();
		
		currentMicrosecond = String.format("%tN", date);
		
		return currentMicrosecond;
	}
	
	/*
	 * 微秒简写：(0~999999999)
	 */
	public static String getSimpleCurrentMicrosecond() {
		String simpleCurrentMicrosecond = null;
		String currentMicrosecond = getCurrentMicrosecond();
		int currentM = Integer.parseInt(currentMicrosecond);
		
		simpleCurrentMicrosecond = "" + currentM;
		
		return simpleCurrentMicrosecond;
	}
	
	/*
	 * 时间戳：1970.0.0 00:00:00 到现在的秒数
	 */
	public static String getTimestamp() {
		String timestamp = null;
		Date date = new Date();
		
		timestamp = String.format("%ts", date);
		
		return timestamp;
	}
	
	/*
	 * 时间戳：1970.0.0 00:00:00 到现在的毫秒数
	 */
	public static String getTimestampMicrosecond() {
		String timestampMicrosecond = null;
		Date date = new Date();
		
		timestampMicrosecond = String.format("%tQ", date);
		
		return timestampMicrosecond;
	}
	
	/*
	 * 提示 上午(am.)/下午(pm.)
	 */
	public static String getTipOfTime() {
		String tipOfTime = null;
		Date date = new Date();
		
		tipOfTime = String.format("%tp", date);
		
		return tipOfTime;
	}
	
	/*
	 * 当前时间：02:22:12 下午
	 */
	public static String getCurrentTime12() {
		String currentTime12 = null;
		Date date = new Date();
		
		currentTime12 = String.format("%tr", date);
		
		return currentTime12;
	}
	
	/*
	 * 当前时间：14:33:22
	 */
	public static String getCurrentTimeHHMMSS24() {
		String currentTimeHHMMSS24 = null;
		Date date = new Date();
		
		currentTimeHHMMSS24 = String.format("%tT", date);
		
		return currentTimeHHMMSS24;
	}
	
	/*
	 * 当前时间：14:33
	 */
	public static String getCurrentTimeHHMM24() {
		String currentTimeHHMM24 = null;
		Date date = new Date();
		
		currentTimeHHMM24 = String.format("%tR", date);
		
		return currentTimeHHMM24;
	}
}
