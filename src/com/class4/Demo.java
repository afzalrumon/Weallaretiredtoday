package com.class4;

import java.util.Scanner;//shortcut to import ctrl+shift+o

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
	String str="hello";
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any text");
	
	String text=scan.nextLine();//capture entire text with entire space..
	
	System.out.println("text that i entered "+text);
	System.out.println("name");
String name=scan.next();// capture one word
System.out.println(" your name "+name);

int age=scan.nextInt();
System.out.println("my name is "+name+" my age is "+age);


	}

}
