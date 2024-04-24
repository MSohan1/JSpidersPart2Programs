package com.jsp.arrays;

public class Assignment2 {

	public static void main(String[] args) {

		int arr[] = {10,30,35,44,39,32,33,87};
		System.out.println("Elements which are even");
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("------------------------------------------------------");
		int oddcount =0;
		System.out.println("The Count of Odd indexs are: ");
		for(int i = 1;i<arr.length;i=i+2)
		{
			
				oddcount++;
			
		}
		System.out.println(oddcount);
		System.out.println("------------------------------------------------------");
		System.out.println("Elements which are odd");
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("------------------------------------------------------");
		int evencount =0;
		System.out.println("The Count of Even indexs are: ");
		for(int i = 0;i<arr.length;i=i+2)
		{
			
				evencount++;
			
		}
		System.out.println(evencount);
		System.out.println("-----------------------------------------------------------");
		
		if(oddcount == evencount)
		{
			System.out.println("Odd Count and event count are equal");
		}
		else
		{
			System.out.println("Odd Count and event count are not equal");
		}
		
	}

}
