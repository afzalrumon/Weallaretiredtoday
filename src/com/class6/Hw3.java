package com.class6;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		/*
		 *  
		 *  HomeWork: Using scanner class create calculator. Allow user to enter 
		 *  2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Enter first number...");
double num1=scan.nextDouble();
System.out.println("Enter second number...");
		double num2=scan.nextDouble();
		System.out.println("Enter operator you want to perform..(+,_,*,/)");
		String operator=scan.next();
		double equation = 0;
		if(operator.equals("+")) {
			equation=num1+num2;
			
		}else if(operator.equals("-")) {
			equation=num1-num2;
		}else if(operator.equals("*")) {
			equation=num1*num2;
		}else if(operator.equals("/")) {
			equation=num1/num2;
		}else {
			System.out.println("invalid");
		}System.out.println("The result of "+num1+" and "+num2+" is "+equation);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
