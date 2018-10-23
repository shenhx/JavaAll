package com.shenhx.javabasic.java8newfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeTest {

	public void demo1() {
		
		/*
		 * 输出内容：
现在的时间是：2018-10-23T21:47:31.033
当前时区的当前时间是：2018-10-23
month: OCTOBERday: 23seconds: 31
localDateTime2 =2019-10-10T21:47:31.033
localDate2=2018-12-25
时间=20:10
localTime3:20:15:20
		 * */
		
		LocalDateTime curTime = LocalDateTime.now();
		System.out.println("现在的时间是："+curTime);
		
		LocalDate localDate = curTime.toLocalDate();
		System.out.println("当前时区的当前时间是："+localDate);
		
		Month month = curTime.getMonth();
		int day = curTime.getDayOfMonth();
		int seconds = curTime.getSecond();
		
		System.out.println("month: " + month +"day: " + day +"seconds: " + seconds);
		
		LocalDateTime localDateTime2 = curTime.withDayOfMonth(10).withYear(2019);
		System.out.println("localDateTime2 =" + localDateTime2);
		
		LocalDate localDate2 = LocalDate.of(2018, Month.DECEMBER, 25);
		System.out.println("localDate2="+localDate2);
		
		LocalTime localTime2 = LocalTime.of(20, 10);
		System.out.println("时间="+localTime2);
		
		LocalTime localTime3 = LocalTime.parse("20:15:20");
		System.out.println("localTime3:"+localTime3);
		
	}
	
	public void demo2() {
		ZonedDateTime dateTime1 = ZonedDateTime.parse("2018-10-23T19:22:15+01:30[Asia/Shanghai]");
		System.out.println("date1="+dateTime1);
		
		ZoneId id = ZoneId.of("Asia/Shanghai");
		System.out.println("zoneId:"+id);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone:"+currentZone);
	}
	
}
