package com.jsp.arrays;

import java.util.Scanner;

public class SummnationOfArrayDifferentTestCases {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scanner.nextInt();
		}
		int zeroCount=0,negCount=0,singleElement=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
			{
				negCount++;
			}
			else if(arr[i]==0)
			{
				zeroCount++;
			}
			if(arr[i]<=9)
			{
				singleElement++;
			}
		}
		if(negCount==arr.length)
		{
			System.out.println("Array contains all negitive Numbers");
		}
		else if(zeroCount==arr.length)
		{
			System.out.println("Array contains all Zeros");
		}
		else if(singleElement==arr.length)
		{
			System.out.println("All are Single Elements ");
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i]<-9)
				{
					int temp = arr[i];
					int sum=0;
					while(temp!=0)
					{
						int ld = temp%10;
						sum += ld;
						temp /=10; 
					}
					System.out.print(arr[i]+" ");
				}
				else
					System.out.print(arr[i]+" ");
			}
		}
		else
		{
			for (int i = 0; i < arr.length; i++) 
			{
				
				if(arr[i]>0 || arr[i]<0)//pos sum
				{
					int temp = arr[i];
					int sum=0;
					while(temp!=0)
					{
						int ld = temp%10;
						sum += ld;
						temp /=10; 
					}
					System.out.print(sum+" ");
				}
			}
		}
	}

}
