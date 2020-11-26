package com.cts.jp;

import java.util.Date;

public class DummyLeap {

	 public static void main(String[] args) {
//		 String str[] = new String[20-05-2000];
		 String str= "20-05-2012";
		 String stra=str.substring(6);
		 int d1= Integer.parseInt(stra);
//		    Date[] date; 
//		    date = new Date[20-05-2000];
		  if((d1 % 400 == 0) || ((d1 % 4 == 0) && (d1 % 100 != 0)))
		               System.out.println("Year " + d1 + " is a leap year");
		       else
		               System.out.println("Year " + d1 + " is not a leap year");
		               System.out.println();
		 }
}
