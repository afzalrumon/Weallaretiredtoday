package com.class4;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed. If loan is less or equal to 200,000 then you would lend the money
		// \n otherwise you would reject the client.
		Scanner scan = new Scanner(System.in);

		System.out.println("put yourexpected amount...");

		int amount = scan.nextInt();
		if (amount <= 200000) {
			System.out.println("I will lend money");
		} else {
			System.out.println("I won't lend money");
		}
//O
		System.out.println("Enter your age...");
		int age = scan.nextInt();
		if (age>=18) {
			System.out.println("I will issue a license for you");

		} else {
			System.out.println("You should get a learner permit");

		}
//HW3zz
//System.out.println("enter your city name");
//String city=scan.nextLine();

//System.out.println("Enter your temperature");
//int tem=scan.nextInt();
//double tem1=(tem-30)/2;

//System.out.println("the temparature of "+city+" is "+tem1);

//HW 4
		System.out.println("Do you have  a credit card??");
		String a = scan.next();

		if (a.equalsIgnoreCase("No")) {
			System.out.println("would you like to get one");

		} else {
			System.out.println("what is the balance of your card");
			int balance = scan.nextInt();
			if (balance > 1000) {
				System.out.println("pay off immedietly");
			} else {
				System.out.println("Take your time");
			}
//hw4
			int year = scan.nextInt();
			int salary = scan.nextInt();
			if (year >= 5) {
				System.out.println("you are eligible");
				if (salary > 50000) {
					System.out.println("your bonus is 5000");
				} else {
					System.out.println("your bonus is 3000");
				}

			} else {
				System.out.println("Not eligible");
			}

		}

	}

}
