package day5.dateTimeCurrency;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocaldateTIme {
	public static void main(String[]args) {
		System.out.println(LocalDate.now());
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		Boolean isLeapYear = LocalDate.now().isLeapYear();
		System.out.println(isLeapYear);
		
		int dayOfMonth =22;
		int monthData= 12;
		int year = 2020;
		Boolean checkLeapY = LocalDate.of(year ,monthData, dayOfMonth).isLeapYear();
		System.out.println(checkLeapY);
		
		LocalDate dateTime = LocalDate.of(2021, 10, 15);
		System.out.println(dateTime);
		LocalDateTime datewithTime = dateTime.atTime(1,50,9);
		System.out.println(datewithTime);
		System.out.println(LocalDateTime.now());
		
//		time in milliseconds after java 1.8
		System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println(Instant.now().toEpochMilli());
//		before 1.8
		System.out.println(System.currentTimeMillis());
		
//		get current date
		LocalDate currentDate = LocalDate.now();
		
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Current date in string    "+strDate);
		
		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
		
		LocalDate date1= LocalDate.now();
		System.out.println("Date ==="+date1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text = date1.format(formatter);
		System.out.println("text=-=-=-="+text);
		LocalDate parseDate = LocalDate.parse(text, formatter);
		System.out.println("parsedDATE -=-=-=-=-"+ parseDate);
		
		
		String dateString= "2020-08-01";
		LocalDate d1 = LocalDate.parse(dateString);
		System.out.println(d1);
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getMonthValue());
		System.out.println(d1.getMonth());
		
		LocalDateTime dtt = LocalDateTime.now();
		System.out.println(dtt);
		System.out.println();
		
		Date date2 = new Date(9999999999999L);
		System.out.println("Our third date is : " + date2);
//		if(date1.isAfter(date2)) {
//			
//		}
	}
}
