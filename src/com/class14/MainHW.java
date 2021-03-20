package com.class14;

public class MainHW {

	public static void main(String[] args) {/*Create a method 
	that will say Hello in different language based on 
	the country 
		 * that will passed when method is executed.
		2:18
		Write a method to return whether given number is
		 prime or not?
		2:18
		Create  class Student that will have a method getGrade.
		 
		Your method should accept the score of a student and
		 return a grade:
		score > 90 - A
		score >80 - B
		score >70 - C
		score > 50 - D
		anything else - F
		 
		 */
		HW sayhi=new HW();
		System.out.println(sayhi.sayhello("Turkey"));
		
		System.out.println(sayhi.isprime(-1));
		System.out.println(sayhi.isprime1(2));
		
		

	}

}
