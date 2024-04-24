package searching;

import java.util.Arrays;
import java.util.Scanner;

public class LeastSmallestElementInAnArray {

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
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		int index=-1;
		
		for (int i = 0; i < arr.length; i++)
			if(arr[i]==key)
				index = i;
		if(index!=-1)
			System.out.println("Least Smallest Element is "+arr[index+1]);
		else
			System.out.println("Element not found");

	}

}
