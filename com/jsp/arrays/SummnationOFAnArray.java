//Q)To create a method to print summnation of each element in an array
//TestCases:
//	->Print only the elements which summnation has more then one digit
//	->If array Contains Negitive and Positive element print array as both positive and negitive elements 
//	->with all zeros print summnation cannot be find

//[55,654,6554,123,1]

package com.jsp.arrays;

import java.util.Scanner;

public class SummnationOFAnArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();

		}
		int zeroCount=0,singleDigitCount=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
			{
				zeroCount++;
			}
			if(arr[i]>0&& arr[i]<10)
			{
				singleDigitCount++;
			}
		}
		if(zeroCount==arr.length)
		{
			System.out.println("Cannot Find Sum");
		}
		else if(singleDigitCount==arr.length)
		{
			System.out.println("Cannot Find Sum for single element");
		}
		else
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j]<0)
				{
					System.out.print(arr[j]+" ");
				}
				else
				{
					summnation(arr[j]);
				}

			}
		}

	}

	private static void summnation(int n) {
		int sum=0;
		while(n!=0)
		{
			sum += n%10;
			n /=10;
		}
		System.out.print(sum+" ");
		
	}

}
