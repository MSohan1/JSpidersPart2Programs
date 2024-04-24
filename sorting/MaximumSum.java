package sorting;

import java.util.Scanner;

public class MaximumSum {

	public static void main(String[] args) 
	{
		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		findLargest(arr);
		findSmallest(arr);
	}
	public static void  findLargest(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			int hightestSum = 0;
			for (int j = i+1; j < arr.length; j++)
			{
				sum=Math.abs(arr[i]-arr[j]);
				if(sum>hightestSum)
				{
					hightestSum=sum;
				}
			}
			System.out.println(hightestSum);
		}
		System.out.println();
	
	}

	public static void  findSmallest(int arr[])
	{
		System.out.println("Smallest");
		int sum=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			int smallestSum = Integer.MAX_VALUE;
			for (int j = i+1; j < arr.length; j++)
			{
				sum=Math.abs(arr[i]-arr[j]);
				if(sum<smallestSum)
				{
					smallestSum=sum;
				}
			}
			System.out.println(smallestSum);
		}
		System.out.println();
	
	}

}
