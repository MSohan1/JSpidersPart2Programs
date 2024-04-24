package com.jsp.arrays;

import java.util.Scanner;

public class SummnationOf2ndHalf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		int sum =0;
		int start=arr.length-1,end = arr.length/2;
		for (int i = arr.length-1; i >= arr.length/2; i--)
		{
			sum +=arr[i];
		}
		System.out.println(sum);
		//other Logic
		for (int i = arr.length/2; i < arr.length; i++)
		{
			sum +=arr[i];
		}
		System.out.println(sum);
		

	}

}
