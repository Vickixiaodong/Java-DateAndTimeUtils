package com.sasa.example;

import com.sasa.utils.SASADateAndTime;
import com.sasa.utils.date.SASADateUtils;
import com.sasa.utils.time.SASATimeUtils;

public class Test {
	public static void main(String[] args) {
		System.out.println("���������ǰ���(1993)��" + SASADateUtils.getCurrentYear());
		System.out.println("���������ǰ���(93)��" + SASADateUtils.getSimpleCurrentYear());
		System.out.println("���������ǰ�·�(06)��" + SASADateUtils.getCurrentMonth());
		System.out.println("���������ǰ�·ݼ�д(6)��" + SASADateUtils.getSimpleCurrentMonth());
		System.out.println("���������ǰ�·�(����/June)��" + SASADateUtils.getTipCurrentMonth());
		System.out.println("���������ǰ�·�(����/Jun)��" + SASADateUtils.getSimpleTipCurrentMonth());
		System.out.println("����������µڼ���(01~31)��" + SASADateUtils.getCurrentDayOfMonth());
		System.out.println("����������µڼ����д(1~31)��" + SASADateUtils.getSimpleCurrentDayOfMonth());
		System.out.println("�����������ڼ���(001~366)��" + SASADateUtils.getCurrentDayOfYear());
		System.out.println("�����������ڼ����д(1~366)��" + SASADateUtils.getSimpleCurrentDayOfYear());
		System.out.println("����������ڼ�(Monday)��" + SASADateUtils.getCurrentWeek());
		System.out.println("����������ڼ����(Mon)��" + SASADateUtils.getSimpleCurrentWeek());
		System.out.println("�������ȫ������(����һ 2016��02��29��)��" + SASADateUtils.getCurrentDate());
		System.out.println("�������ȫ������(����һ 2016��2��29��)��" + SASADateUtils.getSimpleCurrentDate());
		System.out.println("�������ȫ������(2016-02-29)��" + SASADateUtils.getCurrentDate('-'));
		System.out.println("�������ȫ������(02/29/16)��" + SASADateUtils.getCurrentDate('/'));
		System.out.println("-----------");
		System.out.println("���������ǰСʱ����ʮ�Ľ����磺23����" + SASATimeUtils.getCurrentHour24());
		System.out.println("���������ǰСʱ����ʮ�Ľ��Ƽ�д�磺3����" + SASATimeUtils.getSimpleCurrentHour24());
		System.out.println("���������ǰСʱ��ʮ�������磺02����" + SASATimeUtils.getCurrentHour12());
		System.out.println("���������ǰСʱ��ʮ�����Ƽ�д�磺3����" + SASATimeUtils.getSimpleCurrentHour12());
		System.out.println("���������ǰ�֣�03����" + SASATimeUtils.getCurrentMinute());
		System.out.println("���������ǰ�ּ�д��3����" + SASATimeUtils.getSimpleCurrentMinute());
		System.out.println("���������ǰ�루03����" + SASATimeUtils.getCurrentSecond());
		System.out.println("���������ǰ���д��3����" + SASATimeUtils.getSimpleCurrentSecond());
		System.out.println("���������ǰ���루033����" + SASATimeUtils.getCurrentMillisecond());
		System.out.println("���������ǰ�����д��33����" + SASATimeUtils.getSimpleCurrentMillisecond());
		System.out.println("���������ǰ΢�루012322333����" + SASATimeUtils.getCurrentMicrosecond());
		System.out.println("���������ǰ΢���д��3����" + SASATimeUtils.getSimpleCurrentMicrosecond());
		System.out.println("ʱ���(����)��" + SASATimeUtils.getTimestamp());
		System.out.println("ʱ���(΢����)��" + SASATimeUtils.getTimestampMicrosecond());
		System.out.println(SASATimeUtils.getTipOfTime());
		System.out.println("ʱ��(02:21:24 ����)��" + SASATimeUtils.getCurrentTime12());
		System.out.println("ʱ��(14:22:53)��" + SASATimeUtils.getCurrentTimeHHMMSS24());
		System.out.println("ʱ��(14:22)��" + SASATimeUtils.getCurrentTimeHHMM24());
		System.out.println("-----------");
		System.out.println(SASADateAndTime.getTimeAndDate());
		// SASADateAndTime.startTimeAndDate(); // ��̬��ʾʱ��
	}
}
