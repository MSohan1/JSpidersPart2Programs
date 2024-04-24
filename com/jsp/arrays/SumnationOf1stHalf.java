package com.jsp.arrays;

import java.util.Scanner;

public class SumnationOf1stHalf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		int sum =0;
		for (int i = 0; i < arr.length/2; i++)
		{
			sum +=arr[i];
		}
		System.out.println(sum);
		
	}

}
