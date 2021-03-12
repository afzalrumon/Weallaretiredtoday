package com.hw;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = {
				{ "Dominican Republic", "Canada", "Cuba", "Mexica"},
				{ "Brazil", "Argentina", "Colombia","Peru","Chile"},
				{ "Great Britain", "Italy", "Monaco","France","" },
				{ "Nigeria", "Ghana", "Kenya", "Tanzania" }
				};
		int count=0;//another way to count the sum
		int number=countries.length+countries[1].length+countries[2].length+countries[3].length;
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.println(countries[row][col] + " ");
			}
			System.out.println("-------------------");
		}
		System.out.println("============   Nested For Each Loop  =============");
		for (String[] names : countries) {
			for (String n : names) {
				System.out.print(n+" ");
			count++;}
			System.out.println();
		}System.out.println("Total numbers of the country "+number);
		System.out.println("Total numbers of the country "+count);
	}

}
