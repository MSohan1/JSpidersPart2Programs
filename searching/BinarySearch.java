package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.nextInt();
		}
		System.out.println("Enter Key ");
		int key = scanner.nextInt();
		BinarySearch(arr,key,0,(arr.length));
//		System.out.println("Element Found in : "+res);
		
	}

	public static void BinarySearch(int[] arr, int key, int start, int end) {
		int mid = (start+end)/2;
//		System.out.println(mid);
		if(key==arr[mid])
			System.out.println("Element Found at : "+mid);
		else if(key>arr[mid])
			BinarySearch(arr, key, mid+1, end);
		else
			BinarySearch(arr, key, start, mid-1);
	}

}
