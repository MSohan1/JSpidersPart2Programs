package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertioSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.nextInt();
		}

		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void InsertionSort(int arr[])
	{
		for (int i = 1; i < arr.length; i++) 
		{
			int previous = i-1;
			int element =arr[i];
			while(previous>=0 && element<arr[previous])
			{
				arr[previous+1] = arr[previous];
				previous--;
			}
			arr[previous+1] = element;
		}
	}

}
