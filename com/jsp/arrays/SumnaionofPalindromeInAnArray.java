package com.jsp.arrays;

import java.util.Scanner;

public class SumnaionofPalindromeInAnArray
{

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]= scanner.nextInt();
		}
		int zeroCount=0,negCount=0,singleElement=0;
		for (int i = 0; i < arr.length; i++)
		{
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
			System.out.println("Array contains all Single Elements");
		}
		else
		{
			for (int i = 0; i < arr.length; i++)
			{
				
				checkPalindrome(arr[i]);
			}
			
		}
			
	}
private static void checkPalindrome(int n) {
	
			int temp = n;
			int prod=0;
			while(temp!=0)
			{
				int ld = temp%10;
				prod =prod*10+ld;
				temp /=10;
			
			}
//			System.out.println(prod);
			if(prod==n)
				sumOfPalindrom(prod);
		
	}
public static void sumOfPalindrom(int prod) {
	int temp = prod;
	int sum=0;
	while(temp!=0)
	{
		int ld = temp%10;
		sum +=ld;
		temp /=10;
	}
	System.out.print(sum+" ");
	
}


}

