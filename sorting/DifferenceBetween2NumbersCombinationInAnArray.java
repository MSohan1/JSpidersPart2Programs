package sorting;

import java.util.Scanner;



public class DifferenceBetween2NumbersCombinationInAnArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		findLargest(arr);
	}
	public static void  findLargest(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				sum=Math.abs(arr[i]-arr[j]);
				System.out.println("Difference of 2 Combinations of : "+arr[i]+" "+arr[j]+" : "+sum);
			}
		}
		System.out.println();
	
	}

}
