package com.cts.jp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDatesUsingList {

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		List<LocalDate> dates= new ArrayList<>();
		String str= null;
		
		for(int i=1; i<=3; i++) {
			System.out.println("date entered by User --" +i);
			str= sc.nextLine();
			LocalDate ld= LocalDate.parse(str);
			dates.add(ld);
			leapYear(ld);
		}
		
		Collections.sort(dates);
		for(LocalDate d: dates) {
			System.out.println(d);
		}
	}
	
	public static void leapYear(LocalDate date) {
		int d1= date.getYear();
		  if((d1 % 400 == 0) || ((d1 % 4 == 0) && (d1 % 100 != 0)))
		               System.out.println("Year " + d1 + " is a leap year");
		       else
		               System.out.println("Year " + d1 + " is not a leap year");
		               System.out.println();
	}
}
