package com.class6;
import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.
String language,country;
Scanner scan =new Scanner(System.in);
System.out.println("please enter your country name  ...");
		country=scan.nextLine();
		switch (country.toLowerCase()) {
		case "bangladesh":
			language="Bangla";
			break;
		case "usa":
			language="English";
			break;
		case "pakistan":
			language="urdu";
			break;
		case "India":
			language="hindi";
		break;
		case "Afghanistan":
		language="farsi";
		break;
		default:
			language="unknown";
			
		}System.out.println("the language of "+country+" is "+language);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
