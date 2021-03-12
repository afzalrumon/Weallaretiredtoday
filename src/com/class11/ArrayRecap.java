package com.class11;
import java.util.Scanner;
public class ArrayRecap {

	public static void main(String[] args) {
		/* 
		 * 
		 * 
		 */
Scanner scan=new Scanner(System.in);
System.out.println("How many String element would you like to store ??");
int size=scan.nextInt();
double sum=0;
double[] array=new double [size];
for(double a:array) {
a=scan.nextDouble();
	sum+=a;
	System.out.println(sum);
	
}
System.out.println("---------------------------------------regulR FOR---------------------------------");
		
	for(int i=0;i<size;i++) {
		array[i]=scan.nextDouble();
		sum+=array[i];
		System.out.println(sum);
	}	
		
		
		
		
		
		
		
		
	}

}
