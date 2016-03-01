package com.sasa.utils.date;

import java.util.Date;

/**
 * ��ʽ�����ڲ���
 * @author xiexiaodong
 *
 */
public class SASADateUtils {
	
	/*
	 * ���ص�ǰ����磺2016
	 */
	public static String getCurrentYear() {
		String currentYear = null;
		Date date = new Date();
		
		currentYear = String.format("%tY", date);
		
		return currentYear;
	}
	
	/*
	 * ���ص�ǰ����磺16
	 */
	public static String getSimpleCurrentYear() {
		String simpleCurrentYear = null;
		Date date = new Date();
		
		simpleCurrentYear = String.format("%ty", date);
		
		return simpleCurrentYear;
	}
	
	/*
	 * ���ص�ǰ���磺02(��ʾ2��)
	 */
	public static String getCurrentMonth() {
		String currentMonth = null;
		Date date = new Date();
		
		currentMonth = String.format("%tm", date);
		
		return currentMonth;
	}
	
	/*
	 * ���ص�ǰ�¼�д�磺2(��ʾ2��)
	 */
	public static String getSimpleCurrentMonth() {
		String simpleCurrentMonth = null;
		String currentMonth = getCurrentMonth();
		int currentMon = Integer.parseInt(currentMonth);
		
		simpleCurrentMonth = "" + currentMon;
		
		return simpleCurrentMonth;
	}
	
	/*
	 * ���ص�ǰ���磺���£���February��(��ʾ2��)
	 */
	public static String getTipCurrentMonth() {
		String tipCurrentMonth = null;
		Date date = new Date();
		
		tipCurrentMonth = String.format("%tB", date);
		
		return tipCurrentMonth;
	}
	
	/*
	 * ���ص�ǰ�¼�д�磺���£���Feb��(��ʾ2��)
	 */
	public static String getSimpleTipCurrentMonth() {
		String simpleTipCurrentMonth = null;
		Date date = new Date();
		
		simpleTipCurrentMonth = String.format("%tb", date);
		
		return simpleTipCurrentMonth;
	}
	
	/*
	 * ���ص�ǰ���µĵڼ����磺02(1~31)��ʾ���µ�2��
	 */
	public static String getCurrentDayOfMonth() {
		String currentDayOfMonth = null;
		Date date = new Date();
		
		currentDayOfMonth = String.format("%te", date);
		
		return currentDayOfMonth;
	}
	
	/*
	 * ���ص�ǰ���µĵڼ����д�磺2(1~31)��ʾ���µ�2��
	 */
	public static String getSimpleCurrentDayOfMonth() {
		String simpleCurrentDayOfMonth = null;
		String currentDayOfMonth = getCurrentDayOfMonth();
		int currentDOM = Integer.parseInt(currentDayOfMonth);
		
		simpleCurrentDayOfMonth = "" + currentDOM;
		
		return simpleCurrentDayOfMonth;
	}
	
	/*
	 * ���ص�ǰ����ĵڼ����磺089(001~366)��ʾ�����89��
	 */
	public static String getCurrentDayOfYear() {
		String currentDayOfYear = null;
		Date date = new Date();
		
		currentDayOfYear = String.format("%tj", date);
		
		return currentDayOfYear;
	}
	
	/*
	 * ���ص�ǰ����ĵڼ����д�磺89(1~366)��ʾ�����89��
	 */
	public static String getSimpleCurrentDayOfYear() {
		String simpleCurrentDayOfYear = null;
		String currentDayOfYear = getCurrentDayOfYear();
		int currentDOY = Integer.parseInt(currentDayOfYear);
		
		simpleCurrentDayOfYear = "" + currentDOY;
		
		return simpleCurrentDayOfYear;
	}
	
	/*
	 * ���ص�ǰ�����ڼ��磺����һ(Monday)
	 */
	public static String getCurrentWeek() {
		String currentWeek = null;
		Date date = new Date();
		
		currentWeek = String.format("%tA", date);
		
		return currentWeek;
	}
	
	/*
	 * ���ص�ǰ�����ڼ��磺����һ(Monday)
	 */
	public static String getSimpleCurrentWeek() {
		String simpleCurrentWeek = null;
		Date date = new Date();
		
		simpleCurrentWeek = String.format("%ta", date);
		
		return simpleCurrentWeek;
	}
	
	/*
	 * ����һ 2016��02��09��
	 */
	public static String getCurrentDate() {
		String currentDate = null;
		
		currentDate = getCurrentWeek() + " " + getCurrentYear() + "��" + getCurrentMonth() + "��" + getCurrentDayOfMonth() + "��";
		
		return currentDate;
	}
	
	/*
	 * ����һ 2016��2��9��
	 */
	public static String getSimpleCurrentDate() {
		String simpleCurrentDate = null;
		
		simpleCurrentDate = getCurrentWeek() + " " + getCurrentYear() + "��" + getSimpleCurrentMonth() + "��" + getSimpleCurrentDayOfMonth() + "��";
		
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
