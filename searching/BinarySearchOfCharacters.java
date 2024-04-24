package searching;

import java.util.Scanner;

public class BinarySearchOfCharacters {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		char arr[] = new char[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.next().charAt(0);
		}
		System.out.println("Enter Character Element ");
		char key = scanner.next().charAt(0);
		BinarySearch(arr, key, 0, arr.length-1);
		
			
	}

	public static void BinarySearch(char []arr, int key, int start, int end) 
	{
		int mid = (start+end)/2;

		if((int)key==(int) arr[mid])
			System.out.println("Element Found at : "+mid);
		else if((int)key>(int)arr[mid])
			BinarySearch(arr, key, mid+1, end);
		else
			BinarySearch(arr, key, start, mid-1);
	}

}


