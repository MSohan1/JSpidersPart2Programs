package com.jsp.arrays;

import java.util.Scanner;

public class AnotherWayOfDeclaringAnArray {

	public static void main(String[] args) {
		
//		int arr[] = new int[4];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Elements in an array");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]= scanner.nextInt();
//		}
//		System.out.println("Elements in an array");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+ names.length+" names");
		for (int i = 0; i < names.length; i++)
		{
			names[i] = sc.next();
		}
		System.out.println("String in reverse order");
		for (int i = names.length-1; i >= 0; i--)
		{
			System.out.println(names[i]);
		}
	}
	
	

}
