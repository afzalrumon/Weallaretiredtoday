package com.class7;

public class WhileDoWhileForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
	int z=10;
	z=z+1;
	z+=1;
	z++;//adds 1 tp the variable
	
z--;//increment and decrement can only be in variables.

int a=20;
while (a<=100) {
	if(a%2==0) {
		System.out.print(a+" ");
	}a++;
}
	do {
		System.out.print(a);
		
	}while(a<=100);
	//for loop print number from  10 to 1....
	for(int b=10;b>=1;b--) {
		System.out.print(b+" ");
	}
	for(int b=5;b<=50;b+=5) {
		System.out.print(" "+b);
	}

//when we don't  know how many  time we need to repeat the block use while or do while
//when we know how many  time we need to repeat the block use for loop
	}

}
