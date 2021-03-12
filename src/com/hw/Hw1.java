package com.hw;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] number= {
		{7,8,9},
		{1,2,3},
		{101,108,202}
};
int sum=0;

for(int i=0;i<number.length;i++) {
	for (int j=0; j<number[i].length; j++) {
	sum+=number[i][j];}
	
	
	
	
}System.out.println("the sum of all numbers is "+sum);
	}

}
