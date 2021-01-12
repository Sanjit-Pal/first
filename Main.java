package com.sanjit;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sanjit Paul";
		String str = String.format("Hi, I am %s", name);
		System.out.println(str);
		
		//LocalTime localTime = new LocalTime();
		LocalTime localTime = LocalTime.now();
		System.out.println("Current time : " + localTime);
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current date : " + localDate);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current date time : " + localDateTime);
		
		Instant now = Instant.now();
		System.out.println("Now instsnt : " + now);
		
		System.out.println("New line added");
		
	}

}
