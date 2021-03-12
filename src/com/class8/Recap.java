package com.class8;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++) {
	for(int j=1;j<=5;j++) {
		System.out.println("hello");
	}
}
for(int h=0;h<=23;h++) {
	for(int m=0;m<60;m++) {
		if(m<=9) {
		System.out.println(h+":0"+m);
	}else{
		if (h<10 )
			System.out.println("0"+h+" "+m);
	}}
}System.out.println("--------------------------------------------------------------------------");
for (int h = 0; h <= 24; h++) {
	for (int m = 0; m < 60; m++) {
		if (h<10) {
			System.out.print("0"+ h + ":");
		} else {
			System.out.print(h + ":");
		}
				
		if (m<10) {
			System.out.println("0"+ m);
		} else {
			System.out.println(m);
		}
	}
}
	}

}
