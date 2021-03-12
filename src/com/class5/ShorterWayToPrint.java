package com.class5;

import java.util.Scanner;

public class ShorterWayToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String defination;
	System.out.println("enter height");
	
		int h=scan.nextInt();
		if(h<=0) {
defination ="short";}

		if(h<=60) {
			defination="medium";
		}else if(h>=60 && h<=72) {
			defination="medium";
			
		}else {defination="tall";
		
		} 
		System.out.println("you are "+defination);
			
		}
//.we have to calculate based on the sale!!!hey i got it
	
		
		
		
}
