package com.cts.jp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class SortDates {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws ParseException {
		Date date[];  
		String stringDates[]; 
		int i;
		Scanner sc= new Scanner(System.in);
		
		date= new Date[3];
		stringDates= new String[3];
		
		for(i=0; i<3; i++) {
			System.out.println("Date entered by User -- "+ (i+1));
			stringDates[i] = sc.next();
			leapYear(stringDates[i]);
		}
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		
		for(i=0;i<3;i++) {
			date[i]=sdf.parse(stringDates[i]);
		}
		
		Arrays.sort(date);
		for(Date d: date) {
			System.out.println(sdf.format(d));
		}
		
	}
	
	public static void leapYear(String str) {
		String stra=str.substring(6);
		 int d1= Integer.parseInt(stra);
		  if((d1 % 400 == 0) || ((d1 % 4 == 0) && (d1 % 100 != 0)))
		               System.out.println("Year " + d1 + " is a leap year");
		       else
		               System.out.println("Year " + d1 + " is not a leap year");
		               System.out.println();
	}
}
