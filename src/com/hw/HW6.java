package com.hw;
import java.util.Scanner;
public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   

		
		
		
		
		
		
		
		
	}

}