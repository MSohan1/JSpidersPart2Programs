package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestNumber {


	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.nextInt();
		}
		InsertionSort(arr);
		System.out.println("Enter The index : ");
		int smallestIndex = scanner.nextInt();
		
		
		System.out.println();
		if(smallestIndex<arr.length)
		{
			System.out.println("Nth smallest value is : "+arr[smallestIndex]);
		}
		else
			System.out.println("Accessing more the the array Elements ");
		
	}
	public static void swap(int arr[],int index,int i)
	{
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}
	
	public static void InsertionSort(int arr[])
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			int index = i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[index]> arr[j])
				{
					index = j;
				}
			}
			if(index!=i)
			{
				swap(arr, index, i);
			}
		}
		
//		System.out.println(Arrays.toString(arr));
	}
	
}
