package com.sasa.utils.time;

import java.util.Date;

/**
 * ʱ�乤����
 * @author xiexiaodong
 *
 */
public class SASATimeUtils {
	
	/*
	 * Сʱ��ʮ�Ľ��ƣ�09��ʾ����9��(0~23)
	 */
	public static String getCurrentHour24() {
		String currentHour24 = null;
		Date date = new Date();
		
		currentHour24 = String.format("%tH", date);
		
		return currentHour24;
	}
	
	/*
	 * Сʱ��ʮ�Ľ��Ƽ�д��9��ʾ����9��(0~23)
	 */
	public static String getSimpleCurrentHour24() {
		String simpleCurrentHour24 = null;
		Date date = new Date();
		
		simpleCurrentHour24 = String.format("%tk", date);
		
		return simpleCurrentHour24;
	}
	
	/*
	 * Сʱʮ�����ƣ�09��ʾ9��(1~12)
	 */
	public static String getCurrentHour12() {
		String currentHour12 = null;
		Date date = new Date();
		
		currentHour12 = String.format("%tI", date);
		
		return currentHour12;
	}
	
	/*
	 * Сʱʮ�����Ƽ�д��9��ʾ9��(1~12)
	 */
	public static String getSimpleCurrentHour12() {
		String simpleCurrentHour12 = null;
		Date date = new Date();
		
		simpleCurrentHour12 = String.format("%tl", date);
		
		return simpleCurrentHour12;
	}
	
	/*
	 * ���ӣ�04(00~59)
	 */
	public static String getCurrentMinute() {
		String currentMinute = null;
		Date date = new Date();
		
		currentMinute = String.format("%tM", date);
		
		return currentMinute;
	}
	
	/*
	 * ���Ӽ�д��4(0~59)
	 */
	public static String getSimpleCurrentMinute() {
		String simpleCurrentMinute = null;
		String currentMinute = getCurrentMinute();
		int currentMin = Integer.parseInt(currentMinute);
		
		simpleCurrentMinute = "" + currentMin;
		
		return simpleCurrentMinute;
	}
	
	/*
	 * �룺03(00~60)
	 */
	public static String getCurrentSecond() {
		String currentSecond = null;
		Date date = new Date();
		
		currentSecond = String.format("%tS", date);
		
		return currentSecond;
	}
	
	/*
	 * ���д��03(0~60)
	 */
	public static String getSimpleCurrentSecond() {
		String simpleCurrentSecond = null;
		String currentSecond = getCurrentSecond();
		int currentS = Integer.parseInt(currentSecond);
		
		simpleCurrentSecond = "" + currentS;
		
		return simpleCurrentSecond;
	}
	
	/*
	 * ���룺(000~999)
	 */
	public static String getCurrentMillisecond() {
		String currentMillisecond = null;
		Date date = new Date();
		
		currentMillisecond = String.format("%tL", date);
		
		return currentMillisecond;
	}
	
	/*
	 * �����д��(0~999)
	 */
	public static String getSimpleCurrentMillisecond() {
		String simpleCurrentMillisecond = null;
		String currentMillisecond = getCurrentMillisecond();
		int currentM = Integer.parseInt(currentMillisecond);
		
		simpleCurrentMillisecond = "" + currentM;
		
		return simpleCurrentMillisecond;
	}
	
	/*
	 * ΢�룺(000000000~999999999)
	 */
	public static String getCurrentMicrosecond() {
		String currentMicrosecond = null;
		Date date = new Date();
		
		currentMicrosecond = String.format("%tN", date);
		
		return currentMicrosecond;
	}
	
	/*
	 * ΢���д��(0~999999999)
	 */
	public static String getSimpleCurrentMicrosecond() {
		String simpleCurrentMicrosecond = null;
		String currentMicrosecond = getCurrentMicrosecond();
		int currentM = Integer.parseInt(currentMicrosecond);
		
		simpleCurrentMicrosecond = "" + currentM;
		
		return simpleCurrentMicrosecond;
	}
	
	/*
	 * ʱ�����1970.0.0 00:00:00 �����ڵ�����
	 */
	public static String getTimestamp() {
		String timestamp = null;
		Date date = new Date();
		
		timestamp = String.format("%ts", date);
		
		return timestamp;
	}
	
	/*
	 * ʱ�����1970.0.0 00:00:00 �����ڵĺ�����
	 */
	public static String getTimestampMicrosecond() {
		String timestampMicrosecond = null;
		Date date = new Date();
		
		timestampMicrosecond = String.format("%tQ", date);
		
		return timestampMicrosecond;
	}
	
	/*
	 * ��ʾ ����(am.)/����(pm.)
	 */
	public static String getTipOfTime() {
		String tipOfTime = null;
		Date date = new Date();
		
		tipOfTime = String.format("%tp", date);
		
		return tipOfTime;
	}
	
	/*
	 * ��ǰʱ�䣺02:22:12 ����
	 */
	public static String getCurrentTime12() {
		String currentTime12 = null;
		Date date = new Date();
		
		currentTime12 = String.format("%tr", date);
		
		return currentTime12;
	}
	
	/*
	 * ��ǰʱ�䣺14:33:22
	 */
	public static String getCurrentTimeHHMMSS24() {
		String currentTimeHHMMSS24 = null;
		Date date = new Date();
		
		currentTimeHHMMSS24 = String.format("%tT", date);
		
		return currentTimeHHMMSS24;
	}
	
	/*
	 * ��ǰʱ�䣺14:33
	 */
	public static String getCurrentTimeHHMM24() {
		String currentTimeHHMM24 = null;
		Date date = new Date();
		
		currentTimeHHMM24 = String.format("%tR", date);
		
		return currentTimeHHMM24;
	}
}
