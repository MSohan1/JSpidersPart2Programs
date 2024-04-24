package com.jsp.arrays;

import java.util.Scanner;

public class SearchElementsBetweenTheRange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int [scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter Start and End values");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		//Logic 1 Count all Zeros 
		int zeroCount=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
				zeroCount++;
		}
		if(zeroCount==arr.length)
		{
			System.err.println("All are Zeros");
		}
		else
		{
			if(start>end)
			{
				System.out.println("Invalid");
			}
			else
			{
				int count=0;
				for (int i = 0; i < arr.length; i++)
				{
					if(arr[i]>=start && arr[i]<=end)
					{
						System.out.println(arr[i]);
						count++;
					}
					
				}
				if(count==0)
				{
					System.out.println("No elements Found!!");
				}
			}
		}

	}

}
