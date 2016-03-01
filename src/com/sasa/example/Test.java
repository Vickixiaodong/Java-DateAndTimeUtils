package com.sasa.example;

import com.sasa.utils.SASADateAndTime;
import com.sasa.utils.date.SASADateUtils;
import com.sasa.utils.time.SASATimeUtils;

public class Test {
	public static void main(String[] args) {
		System.out.println("测试输出当前年份(1993)：" + SASADateUtils.getCurrentYear());
		System.out.println("测试输出当前年份(93)：" + SASADateUtils.getSimpleCurrentYear());
		System.out.println("测试输出当前月份(06)：" + SASADateUtils.getCurrentMonth());
		System.out.println("测试输出当前月份简写(6)：" + SASADateUtils.getSimpleCurrentMonth());
		System.out.println("测试输出当前月份(六月/June)：" + SASADateUtils.getTipCurrentMonth());
		System.out.println("测试输出当前月份(六月/Jun)：" + SASADateUtils.getSimpleTipCurrentMonth());
		System.out.println("测试输出当月第几天(01~31)：" + SASADateUtils.getCurrentDayOfMonth());
		System.out.println("测试输出当月第几天简写(1~31)：" + SASADateUtils.getSimpleCurrentDayOfMonth());
		System.out.println("测试输出当年第几天(001~366)：" + SASADateUtils.getCurrentDayOfYear());
		System.out.println("测试输出当年第几天简写(1~366)：" + SASADateUtils.getSimpleCurrentDayOfYear());
		System.out.println("测试输出星期几(Monday)：" + SASADateUtils.getCurrentWeek());
		System.out.println("测试输出星期几简称(Mon)：" + SASADateUtils.getSimpleCurrentWeek());
		System.out.println("测试输出全部日期(星期一 2016年02月29日)：" + SASADateUtils.getCurrentDate());
		System.out.println("测试输出全部日期(星期一 2016年2月29日)：" + SASADateUtils.getSimpleCurrentDate());
		System.out.println("测试输出全部日期(2016-02-29)：" + SASADateUtils.getCurrentDate('-'));
		System.out.println("测试输出全部日期(02/29/16)：" + SASADateUtils.getCurrentDate('/'));
		System.out.println("-----------");
		System.out.println("测试输出当前小时（二十四进制如：23）：" + SASATimeUtils.getCurrentHour24());
		System.out.println("测试输出当前小时（二十四进制简写如：3）：" + SASATimeUtils.getSimpleCurrentHour24());
		System.out.println("测试输出当前小时（十二进制如：02）：" + SASATimeUtils.getCurrentHour12());
		System.out.println("测试输出当前小时（十二进制简写如：3）：" + SASATimeUtils.getSimpleCurrentHour12());
		System.out.println("测试输出当前分（03）：" + SASATimeUtils.getCurrentMinute());
		System.out.println("测试输出当前分简写（3）：" + SASATimeUtils.getSimpleCurrentMinute());
		System.out.println("测试输出当前秒（03）：" + SASATimeUtils.getCurrentSecond());
		System.out.println("测试输出当前秒简写（3）：" + SASATimeUtils.getSimpleCurrentSecond());
		System.out.println("测试输出当前毫秒（033）：" + SASATimeUtils.getCurrentMillisecond());
		System.out.println("测试输出当前毫秒简写（33）：" + SASATimeUtils.getSimpleCurrentMillisecond());
		System.out.println("测试输出当前微秒（012322333）：" + SASATimeUtils.getCurrentMicrosecond());
		System.out.println("测试输出当前微秒简写（3）：" + SASATimeUtils.getSimpleCurrentMicrosecond());
		System.out.println("时间戳(秒数)：" + SASATimeUtils.getTimestamp());
		System.out.println("时间戳(微秒数)：" + SASATimeUtils.getTimestampMicrosecond());
		System.out.println(SASATimeUtils.getTipOfTime());
		System.out.println("时间(02:21:24 下午)：" + SASATimeUtils.getCurrentTime12());
		System.out.println("时间(14:22:53)：" + SASATimeUtils.getCurrentTimeHHMMSS24());
		System.out.println("时间(14:22)：" + SASATimeUtils.getCurrentTimeHHMM24());
		System.out.println("-----------");
		System.out.println(SASADateAndTime.getTimeAndDate());
		// SASADateAndTime.startTimeAndDate(); // 动态显示时间
	}
}
