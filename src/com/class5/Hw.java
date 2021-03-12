package com.class5;
import java.util.Scanner;
public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter your month of birth ");

String month=scan.next();
String season=null;

if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")  || month.equalsIgnoreCase("February")) {
	
		season="Winter";
	
}else if(month.equalsIgnoreCase("march") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
	season="Spring";
	
}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
	season="Autumn";
}else if(month.equalsIgnoreCase("September")  ||month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
	season="Summer";
	
}else {
	System.out.println("Invalid ");
}
System.out.println("the season you were born is " + season);







	}
	}


