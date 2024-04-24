package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.nextInt();
		}
		System.out.println("Enter Key ");
		int key = scanner.nextInt();
		int res = linearSearch(arr,key);
		System.out.println("Element Found in : "+res);

	}

	public static int linearSearch(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}

}
