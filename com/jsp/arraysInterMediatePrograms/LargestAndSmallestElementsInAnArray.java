package com.jsp.arraysInterMediatePrograms;
import java.util.Scanner;

public class LargestAndSmallestElementsInAnArray {

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
			largestElement(arr,zeroCount);
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

		private static void largestElement(int[] arr, int zeroCount) {
			if(zeroCount==arr.length)
			{
				System.out.println("Contains all Zeros ");
			}
			else 
			{
				int maxValue = arr[0];
				for (int i = 0; i < arr.length; i++) 
				{
					if(maxValue<arr[i])
						maxValue = arr[i];
				}
				System.out.println("Max Value Elements present in the array is "+ maxValue);
			}

			
		}

	}

