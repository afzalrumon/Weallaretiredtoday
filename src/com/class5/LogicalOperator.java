package com.class5;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("please enter height");
int h=scan.nextInt();
if(h<=0) {
System.out.println("invalid number");}
if(h<=60) {
	System.out.println("you are short");
}else if(h>=60 && h<=72) {
	System.out.println("you are medium");
}else if(h>72) {
	System.out.println("you are tall");
}
System.out.println("----------------------------------------------------------------------------0");








System.out.println("Enter the day number");	
int day=scan.nextInt();
	if(day>=1 && day<=5){
		System.out.println("weekday");
	}else if(day>=6 && day<=7) {
	System.out.println("weekend");
}else{System.out.println("invalid");
}
		
		
		
		
		
	}

}
