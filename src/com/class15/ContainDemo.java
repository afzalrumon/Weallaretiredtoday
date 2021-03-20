package com.class15;

public class ContainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var="This is demo of contain #";
		System.out.println(var.contains("#"));
		if(var.contains("#")) {
			System.out.println("# are not allowed");
			System.out.println(var.startsWith("This is demo"));
			System.out.println(var.endsWith("#"));
		}
		

	}

}
