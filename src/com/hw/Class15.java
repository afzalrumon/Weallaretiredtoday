package com.hw;

import java.util.Scanner;

public class Class15 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 
		 * 
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Mother first name");
	String mName=scan.next();
	System.out.println("Father first name");
	String fName=scan.next();
	boolean isBoy=scan.nextBoolean();
	if(isBoy) {
		System.out.println("Suggested name "+fName.substring(0,3)+mName.substring(2,4));
			
			
		
	}else {
		System.out.println("Suggested name "+mName.substring(0,2)+fName.substring(3,6));
	}
		
		
		

	}

}
