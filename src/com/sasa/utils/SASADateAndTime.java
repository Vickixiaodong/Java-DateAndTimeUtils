package com.sasa.utils;

import java.util.Timer;
import java.util.TimerTask;

import com.sasa.utils.date.SASADateUtils;
import com.sasa.utils.time.SASATimeUtils;

public class SASADateAndTime {
	/*
	 * ���ص�ǰ���ں�ʱ��
	 * 22:20:57 ����һ 2016��2��29��
	 */
	public static String getTimeAndDate() {
		String time = null;
		String date = null;
		
		time = SASATimeUtils.getCurrentTimeHHMMSS24();
		date = SASADateUtils.getSimpleCurrentDate();
		
		return (time + " " + date);
	}
	
	/*
	 * ��̬������ں�ʱ��
	 */
	public static void startTimeAndDate() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(SASADateAndTime.getTimeAndDate());
			}
		}, 1000, 1000);
	}
	
	/*
	 * ����ʱ���涨���������ִ��
	 */
	//public static void
}
