package com.class15;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter the username");
String userName=scan.next();
System.out.println("Please entwer the password");

String password=scan.next();

if(userName.isEmpty()||password.isEmpty()) {
	System.out.println("Username and password cannot be empty");
}
else if(password.length()>8) {
	System.out.println("Cannot be more than 8 character.");
	
}
else if(password.equals(userName)) {
	System.out.println("Password and username cant be equal");
}else if(!password.equals("Raymon")) {
	System.out.println("Password doesnt match");
}
else {
	System.out.println("You are welcome");
}


















	}

}
