package com.jsp.arrays;

import java.util.Scanner;

public class CountOfPrimeNumbersInEachElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			int n = arr[i];
			System.out.print("Element "+arr[i]+" Contains ==>");
			int count=0;
			while(n!=0)
			{
				int ld = n%10;
				
				
				if(isprime(ld))
				{
					System.out.print(ld+" ");
					count++;
				}
				n=n/10;
				
			}
			System.out.print("==>Count = "+count);
			System.out.println();
		}
		

	}

	public static boolean isprime(int ld) {
		int count=0;
		for(int i=1;i<=ld;i++)
		{
			if(ld%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}

}
