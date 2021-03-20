package com.class14;

public class HW{
	
String sayhello(String country) {
	String sayhi="";
	switch (country) {
	case "Bangladesh":
		sayhi="Assalamualaikum";
		break;
	case "USA":
		sayhi="Hello";
		break;
	case "Brazil":
		sayhi="Spain";
		break;
	case "Turkey":
		sayhi="Nasilsiniz";
		break;
	}
	return sayhi;
}

boolean isprime(int a) {
	boolean isprime=true;
	
	if(a>1) {if(a%2!=0||a%a==0) {
		isprime=true;
	}
		
	}
	else if(a==2) {
		isprime=true;
	}
	else {
		isprime=false;
	}
	return isprime;
}
//second method!!!

boolean isprime;
boolean isprime1(int a) {
	
	if(a<1) {
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				isprime=true;
			}else {
				isprime=false;
			
		}
	}
	}
	return isprime;//not sure it does work or no
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
