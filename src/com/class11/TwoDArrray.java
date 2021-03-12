package com.class11;

public class TwoDArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[][] num=new int[3][4];	
String[][] name= {
		{"Mr","Mrs","Ms","Miss"},
		{"smith","jordan","jackson","obama"}
};
		
	System.out.println(name[0][1]+" "+name[1][0]);//+name[0][3]+name[2][2]+name[3][1]);	
	System.out.println(name[0][0]+" "+name[1][3]);	
	System.out.println(name[0][2]+" "+name[1][2]);
	
	System.out.println(name[0][3]+" "+name[1][1]);
	System.out.println("------------------------------------"); 
	
	String[][] name1= {
			{"Rumon","Afzal","caner","Azizullah"},
			{"A","B","C","D","E"}
	
	
	};
	System.out.println(name1[0][0]+" has grade "+name1[1][0]);
	
	
	
	
	
	
	}

}
