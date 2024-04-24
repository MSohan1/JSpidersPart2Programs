package com.jsp.arrays;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		int arr[] = {15,7,13,11,17,12,19,24,36,32,35,51,58,57,99,91};
		for(int i = 0 ;i<arr.length;i++)
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
			if(count==2)
			{
				System.out.println(arr[i]+" is a prime Number");
			}
		}
	}

}
