package com.class5;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int score=scan.nextInt();
String grade;
int quiz,mid,finall;
//System.out.println("Please enter your ");

if(score>=90) {
	grade="A";
	
}else if(score>=70 && score<90) {
	grade="B";
}else if(score>=50 && score<=70) {
	grade="c";
}else {
	if(score<50 && score>0) {
		grade="f";
	}else {
		grade="invalid";
	}
}
System.out.println("your grade is "+grade);
if(grade.equals("A") || grade.equals("B")) {
	System.out.println("I am happy");
}

		
		
		
		
		
	}

}
