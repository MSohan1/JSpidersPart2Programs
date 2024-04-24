package com.jsp.arraysInterMediatePrograms;

import java.util.Scanner;

public class LargestElementInFirstaAndSecondHalf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		int zeroCount=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
				zeroCount++;
		}
		int start = 0;int mid=(arr.length/2)-1;
		System.out.println("First Half Largest Element is: ");
		largestElement(arr,zeroCount,start,mid);
		System.out.println("Second Half Largest Element is: ");
		largestElement(arr,zeroCount,mid+1,arr.length-1);

	}
	private static void largestElement(int[] arr, int zeroCount,int start ,int end) {
		if(zeroCount==arr.length)
		{
			System.out.println("Contains all Zeros ");
		}
		else 
		{
			int maxValue = arr[start];
			for (int i = start; i <= end; i++) 
			{
				if(maxValue<arr[i])
					maxValue = arr[i];
			}
			System.out.println("Max Value Elements present in the array is "+ maxValue);
		}

		
	}

}
