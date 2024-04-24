package sorting;

import java.util.Scanner;

public class SwappingFirstAndLastvalues {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		
		int LargestIndex = findLargest(arr);
		int smallestIndex = findSmallest(arr);

		swap(LargestIndex,smallestIndex,arr);
		
	}

	public static void swap(int largestIndex, int smallestIndex,int[] arr) {
		int temp = arr[smallestIndex];
		arr[smallestIndex] = arr[0];
		arr[0] = temp;
		temp = arr[largestIndex];
		arr[largestIndex] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static int findLargest(int[] arr)
	{
		int largestValue = arr[0];
		int index=0;
		for (int i = 0; i < arr.length; i++) 
			if(largestValue<arr[i])
			{
				largestValue = arr[i];
				index = i;
			}
		return index;
	}
	public static int findSmallest(int[] arr)
	{
		int smallestValue = arr[0];
		int index=0;
		for (int i = 0; i < arr.length; i++) 
			if(smallestValue>arr[i])
			{
				smallestValue = arr[i];
				index = i;
			}
		return index;
	}

}
