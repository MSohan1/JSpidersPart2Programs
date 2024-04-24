package com.jsp.arrays;

import java.util.Iterator;

public class ArrayEvenIndex {

	public static void main(String[] args) {

		double drr[] = {1.2,1.5,1.7,1.5,1.4};
		
		for (int i = 0; i < drr.length; i= i+2) {	//(Directly Incrementing i value by 2 and storing in i)
			System.out.println(i+"-->"+drr[i]);
		}

	}

}
