package arrayMediumLevel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfAnArrayItself {

	public static void main(String[] args) {

		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int start=0,end=arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int arr[], int start, int end) 
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}





