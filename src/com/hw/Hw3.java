package com.hw;

public class Hw3 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers in 
		 * 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
		 */
int [][] numbers= {
		{2,3,4,5,6},
		{122,13,14,15,25},
		{}
		
};
for ( int r=0; r<numbers.length; r++) {
	
	for (int c=0; c<numbers[r].length; c++) {
		
		if ( numbers[r] [c]%2==0 ) {
			System.out.print(numbers [r][c]+" ");
			
		}
		
	}
	System.out.println();
}
		
		
		
		
		
	}

}
