package com.sasa.utils;

import java.util.Timer;
import java.util.TimerTask;

import com.sasa.utils.date.SASADateUtils;
import com.sasa.utils.time.SASATimeUtils;

public class SASADateAndTime {
	/*
	 * 返回当前日期和时间
	 * 22:20:57 星期一 2016年2月29日
	 */
	public static String getTimeAndDate() {
		String time = null;
		String date = null;
		
		time = SASATimeUtils.getCurrentTimeHHMMSS24();
		date = SASADateUtils.getSimpleCurrentDate();
		
		return (time + " " + date);
	}
	
	/*
	 * 动态输出日期和时间
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
	 * 倒计时，规定秒数后继续执行
	 */
	//public static void
}
