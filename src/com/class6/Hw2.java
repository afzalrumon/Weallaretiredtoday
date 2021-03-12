package com.class6;
import java.util.Scanner;
public class Hw2 {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good,
		 *  C-Average, D-Bad, any other
		 *  grade --> Not Acceptable. At the end your progr
		 * am should print which grade was entered by a user with explanation.
		 * 
		 * 
		 * 
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your grade.....");
	String grade=scan.next();
	String comment;
	
	switch(grade.toLowerCase()) {
	case "a":
		comment="Excellent";
		break;
	case "b":
		comment="Good";
		break;
	case "c":
		comment="Average";
		break;
	case "d":
		comment="bad";
		break;
	default:            
		comment="Not acceptable";
	}System.out.println("Your entered grade "+grade+" is "+comment);
	
	float f = 75.0f;
	double d = 75.0;
	int i = 75;

	if( f == d ) {
	   if( f == i ) {
	      System.out.println("f, d and i are equal");
	    } else {
	      System.out.println("f, d are equal but i is not equal");
	    }

	} else {
	    System.out.println("f and d are not equal");
	}
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
