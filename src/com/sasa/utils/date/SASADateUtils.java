package com.sasa.utils.date;

import java.util.Date;

/**
 * 格式化日期操作
 * @author xiexiaodong
 *
 */
public class SASADateUtils {
	
	/*
	 * 返回当前年份如：2016
	 */
	public static String getCurrentYear() {
		String currentYear = null;
		Date date = new Date();
		
		currentYear = String.format("%tY", date);
		
		return currentYear;
	}
	
	/*
	 * 返回当前年份如：16
	 */
	public static String getSimpleCurrentYear() {
		String simpleCurrentYear = null;
		Date date = new Date();
		
		simpleCurrentYear = String.format("%ty", date);
		
		return simpleCurrentYear;
	}
	
	/*
	 * 返回当前月如：02(表示2月)
	 */
	public static String getCurrentMonth() {
		String currentMonth = null;
		Date date = new Date();
		
		currentMonth = String.format("%tm", date);
		
		return currentMonth;
	}
	
	/*
	 * 返回当前月简写如：2(表示2月)
	 */
	public static String getSimpleCurrentMonth() {
		String simpleCurrentMonth = null;
		String currentMonth = getCurrentMonth();
		int currentMon = Integer.parseInt(currentMonth);
		
		simpleCurrentMonth = "" + currentMon;
		
		return simpleCurrentMonth;
	}
	
	/*
	 * 返回当前月如：二月（或February）(表示2月)
	 */
	public static String getTipCurrentMonth() {
		String tipCurrentMonth = null;
		Date date = new Date();
		
		tipCurrentMonth = String.format("%tB", date);
		
		return tipCurrentMonth;
	}
	
	/*
	 * 返回当前月简写如：二月（或Feb）(表示2月)
	 */
	public static String getSimpleTipCurrentMonth() {
		String simpleTipCurrentMonth = null;
		Date date = new Date();
		
		simpleTipCurrentMonth = String.format("%tb", date);
		
		return simpleTipCurrentMonth;
	}
	
	/*
	 * 返回当前当月的第几天如：02(1~31)表示当月第2天
	 */
	public static String getCurrentDayOfMonth() {
		String currentDayOfMonth = null;
		Date date = new Date();
		
		currentDayOfMonth = String.format("%te", date);
		
		return currentDayOfMonth;
	}
	
	/*
	 * 返回当前当月的第几天简写如：2(1~31)表示当月第2天
	 */
	public static String getSimpleCurrentDayOfMonth() {
		String simpleCurrentDayOfMonth = null;
		String currentDayOfMonth = getCurrentDayOfMonth();
		int currentDOM = Integer.parseInt(currentDayOfMonth);
		
		simpleCurrentDayOfMonth = "" + currentDOM;
		
		return simpleCurrentDayOfMonth;
	}
	
	/*
	 * 返回当前当年的第几天如：089(001~366)表示当年第89天
	 */
	public static String getCurrentDayOfYear() {
		String currentDayOfYear = null;
		Date date = new Date();
		
		currentDayOfYear = String.format("%tj", date);
		
		return currentDayOfYear;
	}
	
	/*
	 * 返回当前当年的第几天简写如：89(1~366)表示当年第89天
	 */
	public static String getSimpleCurrentDayOfYear() {
		String simpleCurrentDayOfYear = null;
		String currentDayOfYear = getCurrentDayOfYear();
		int currentDOY = Integer.parseInt(currentDayOfYear);
		
		simpleCurrentDayOfYear = "" + currentDOY;
		
		return simpleCurrentDayOfYear;
	}
	
	/*
	 * 返回当前是星期几如：星期一(Monday)
	 */
	public static String getCurrentWeek() {
		String currentWeek = null;
		Date date = new Date();
		
		currentWeek = String.format("%tA", date);
		
		return currentWeek;
	}
	
	/*
	 * 返回当前是星期几如：星期一(Monday)
	 */
	public static String getSimpleCurrentWeek() {
		String simpleCurrentWeek = null;
		Date date = new Date();
		
		simpleCurrentWeek = String.format("%ta", date);
		
		return simpleCurrentWeek;
	}
	
	/*
	 * 星期一 2016年02月09日
	 */
	public static String getCurrentDate() {
		String currentDate = null;
		
		currentDate = getCurrentWeek() + " " + getCurrentYear() + "年" + getCurrentMonth() + "月" + getCurrentDayOfMonth() + "日";
		
		return currentDate;
	}
	
	/*
	 * 星期一 2016年2月9日
	 */
	public static String getSimpleCurrentDate() {
		String simpleCurrentDate = null;
		
		simpleCurrentDate = getCurrentWeek() + " " + getCurrentYear() + "年" + getSimpleCurrentMonth() + "月" + getSimpleCurrentDayOfMonth() + "日";
		
		return simpleCurrentDate;
	}
	
	/*
	 * '-':2016-02-29
	 * '/':02/29/16
	 */
	public static String getCurrentDate(char c) {
		String currentDate = null;
		Date date = new Date();
		
		switch (c) {
		case '-':
			currentDate = String.format("%tF", date);
			break;
		case '/':
			currentDate = String.format("%tD", date);
			break;
		default:
			break;
		}
		
		return currentDate;
	}
}
