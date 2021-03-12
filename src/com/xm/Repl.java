package com.xm;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Two string");
		String word1,word2;
		word1=scan.next();
		word2=scan.next();
		System.out.println("Please enter two number");
		int num1,num2;
		num1=scan.nextInt();
		num2=scan.nextInt();
		if(word1.equals(word2) && num1==num2)
		{
		System.out.println("AND");
		}else if(word1.equals(word2) || num1==num2){
		  System.out.println("OR");
		}else{
		  System.out.println("NONE");
		}

	}

}
