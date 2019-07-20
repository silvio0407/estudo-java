package br.com.java.estudo.local.date;

import java.time.LocalDateTime;

public class LocalDat {

	public static void main(String[] args) {
		
		//LocalDate localDate = LocalDate.now();
		
		
		//System.out.println(localDate.toString());                //2013-05-15
		//System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
		//System.out.println(localDate.getDayOfMonth());           //15
		//System.out.println(localDate.getDayOfYear());            //135
		//System.out.println(localDate.isLeapYear());              //false
		//System.out.println(localDate.plusDays(12).toString());   //2013-05-27
		
		//LocalTime localTime = LocalTime.of(12, 20);
		//System.out.println(localTime.toString());    //12:20
		//System.out.println(localTime.getHour());     //12
		//System.out.println(localTime.getMinute());   //20
		//System.out.println(localTime.getSecond());   //0
		//System.out.println(localTime.MIDNIGHT);      //00:00
		//System.out.println(localTime.NOON);          //12:00
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
		System.out.println(localDateTime.getDayOfMonth()); //15
		System.out.println(localDateTime.getHour());       //10
		System.out.println(localDateTime.getNano());       //911000000
	}

}
