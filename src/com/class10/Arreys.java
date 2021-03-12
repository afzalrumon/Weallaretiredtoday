package com.class10;

public class Arreys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		num = 20;
		System.out.println(num);
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 12;
		array[2] = 15;
		array[3] = 9;
		array[4] = 13;
		System.out.println(array[2] + array[4]+"-----------enhanceed for loop--------------------");
		int sum = 0;
		for(int n:array) {
			 sum +=n;
			
			
		}System.out.println(sum+"sum");

		double[] number = new double[2];
		number[0] = 10.99;
		number[1] = 19.01;
		System.out.println(number[0]);
		number[0] = 11.99;
		System.out.println(number[0]);
		String[] names = new String[3];
		names[0] = "jahanzzeb";
		names[1] = "Ozoda;";
		names[2] = "alec";
		System.out.println(names[1]);
		System.out.println(names[0]);
		int size = names.length;
		System.out.println(size);
		char[] grade;
		grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);
		System.out.println(
				"--------------------------------------Shorter way--------------------------------------------------");

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
System.out.println(grade[5]);
System.out.println("number of elements "+grades.length);
//how to print the element
for(int i=0;i<grades.length;i++) {
	System.out.println(grades[i]); 
	}
System.out.println("------------Enhanced for loop------------------");
//Advanced for loop/for each ,enhanced for loop
for(char gr:grades) {
	System.out.println(gr);
}






















	}
}
