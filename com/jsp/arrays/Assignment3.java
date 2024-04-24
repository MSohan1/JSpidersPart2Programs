//Q1)Program to print the count of non prime elements present in a array
//Q2)Program to print non odd elements which are palindrom in an array
//Q3)Program to count of spy numbers present in a array
//


package com.jsp.arrays;

public class Assignment3 {

	public static void main(String[] args) {

		int arr[] = {55,44,65,48,79,45,12,546,655,152,789,1};
		System.out.println("Program to print the count of non prime elements present in a array");
		for(int i=0;i<arr.length;i++)
		{
			int count=2;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
					break;
				}
			}
			if(count!=0)
			{
				System.out.println(arr[i]+" is not a prime numbers");
			}
		}
		
		

	}

}
