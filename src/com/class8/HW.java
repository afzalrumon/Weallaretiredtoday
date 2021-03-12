package com.class8;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter 1 st num");
int s=scan.nextInt();
System.out.println("enter 2nd number");
		int e=scan.nextInt();
		int sumODD=0;
		int sUMeVEN=0;
		for(int i=s;i<=e;i++)
		{
			if(s>e) {for(int i1=s;i1>=e;i1--) {
				if( i%2 !=0) 
			
				{sumODD+=i;
			}
				
				else {
				sUMeVEN+=i;
			}
			}System.out.println(sumODD);
			System.out.println(sUMeVEN);}	else {
				
			
			if( i%2 !=0) {
				sumODD+=i;
			}else {
				sUMeVEN+=i;
			}}
			System.out.println(sumODD);
			System.out.println(sUMeVEN);
				
				
		
		
		
		
		
		
		
		
		
		
		
	}System.out.println(sumODD);
	System.out.println(sUMeVEN);

}}
