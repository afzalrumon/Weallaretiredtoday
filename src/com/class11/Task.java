package com.class11;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. Then retrieve all 
		 * values from that array using 2 different loops



		 * Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops
		 * 
		 * 
		 */

	String[][] cars={
		{"american","German","Korean","Italian"},
		{"ford","BMW","Korean","Kia","jaguar"},
	};
	for(int c=0;c<cars.length;c++) {
		;
		for(int b=0;b<cars[c].length;b++) {
			System.out.print(cars[c][b]+" ");
		}System.out.println();
		
	}
	for(String[] a:cars) {
		for(String b:a) {
			System.out.print(b+" ");
		}System.out.println("-----");
	}
	System.out.println("------------------------task2------------------------------");
	
	String[][] groceries= {
			{"coulflower","peas","Potatoes","Brocoli"},
			{"milk","Eggs","cheese","Milkshake"},
			{""},
			{},
			
			
			
			
	};
	
	
	
	
	
	
	}

}
