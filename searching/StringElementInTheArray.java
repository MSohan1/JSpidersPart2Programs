package searching;

import java.util.Arrays;
import java.util.Scanner;

public class StringElementInTheArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		String arr[] = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.next();
		}
		System.out.println("Enter Character Element ");
		String key = scanner.next();
		Arrays.sort(arr);
		System.out.println("Sorted Array is : ");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		int mid = LinearSearch(arr, key);
		System.out.println("String Found at Index : "+mid);

	}
	public static int LinearSearch(String[] arr, String key) 
	{
		int start =0,end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			int result = key.compareTo(arr[mid]);
//			System.out.println(result);
			if(result==0)
				return mid;
			else if(result>0)
				start=mid+1;
			else
				end = mid-1;
		}
		return -1;
	}

}
