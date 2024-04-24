package com.jsp.arrays;

public class Spy {

	public static void main(String[] args) {
		int arr[] = {55,44,65,48,1124,123,79,45,12,546,1142,1241,1412,1421,213,655,152,789,321};

		System.out.println("Program to print non odd elements which are palindrom in an array");

		for(int i = 0 ;i<arr.length;i++)
		{
			int temp = arr[i];
			int prod=1;
			int sum=0;
			while(temp!=0)
			{
				int ld = temp%10;
				prod *=ld; 
				
				sum += temp%10;
				temp/=10;
				
			}
			if(prod==sum)
			{
				
				System.out.println(arr[i]+" is a spy number");
			}
		}
		
			
		
		
	}

}
