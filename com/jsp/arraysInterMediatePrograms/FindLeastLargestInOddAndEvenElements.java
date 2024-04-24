package com.jsp.arraysInterMediatePrograms;

import java.util.Scanner;

public class FindLeastLargestInOddAndEvenElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		int zeroCount=0;
		int even[]= new int[arr.length/2];
		int odd[]= new int[arr.length/2+arr.length%2];
		int j=0,k=0;
		System.out.println(even.length+"    "+odd.length);
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
				zeroCount++;
			if(arr[i]%2==0)
			{
				even[j]=arr[i];
				j++;
			}
			else
			{
				odd[k]=arr[i];
				k++;
			}
		}
		

		
		smallestElement(arr,zeroCount);
		
		}

	private static void smallestElement(int[] arr, int zeroCount) {
		if(zeroCount==arr.length)
		{
			System.out.println("Contains all Zeros ");
		}
		else 
		{
			int minValue = arr[0];
			for (int i = 0; i < arr.length; i++) 
			{
				if(minValue>arr[i])
					minValue = arr[i];
			}
			System.out.println("Max Value Elements present in the array is "+ minValue);
		}

		
	}

}
