package daily_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Accending1stHalfAndDecending2ndHalf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= scanner.nextInt();
		}
		int end = arr.length/2;
		Accending1stHalf(arr, 0, end);
		Decending2ndHalf(arr, arr.length/2, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void Accending1stHalf(int []arr,int start,int end)
	{
		for (int i = start; i < end; i++) 
		{
			for (int j = 1; j < (end-i); j++) 
			{
					if(arr[j-1]> arr[j])
					{
						int temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
			}
		}
	}
	public static void Decending2ndHalf(int []arr,int start,int end)
	{
		for (int i = start,j=end-1; i < j; i++,j--) 
		{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
		}
	}

}
