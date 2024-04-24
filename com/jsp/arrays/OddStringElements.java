package com.jsp.arrays;

public class OddStringElements {

	public static void main(String[] args) {
		
		
		String []names = {"Rani","Raja","Sravya","Sohan","Sreeja","Vinay","Chandhana","Krishna"};
		
		for (int i = 1; i < names.length; i= i+2)
		{
			System.out.println(i+"-->"+names[i]);
		}

	}

}
