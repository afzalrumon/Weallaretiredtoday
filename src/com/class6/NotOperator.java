package com.class6;
import java.util.Scanner;
public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/////!=not equal
		Scanner  scan=new Scanner(System.in);
	double discount = 0;	
	System.out.println("Is sale going.Ans By typing true or false..");	
	boolean sale=scan.nextBoolean();
	if(!sale) {
		System.out.println("I am not going to shopping..");
	}else{System.out.println("Enter price");
	double price=scan.nextInt();
	
	 if(price<10) {
		discount=price*0.05;
	}else if(price>10 && price<100) {
	discount=price*0.1;	
	}else if(price>100 && price<500) {
		discount=price*0.2;
	}else if(price>500) {
		discount=price*0.3;
	}
		
	System.out.println("the original prica was "+price+".. and the final price is "+(price-discount)+" after "+discount+" $ discount");	
		
		
	}}

}
