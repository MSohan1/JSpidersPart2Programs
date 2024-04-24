package sorting;

import java.util.Scanner;

public class SmallestSumnationInAnArray {

	public static void main(String[] args) {
		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int totalSum=arr[0]+arr[1];
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				int sum=0;
				for (int k = i; k < j+1; k++) {
					System.out.print(arr[k]+" ");
					sum += arr[k];
				}
				if(sum<totalSum)
					totalSum = sum;
				System.out.println();
			}
		}
		System.out.println("Minimum Sum of Combinations "+totalSum);
		System.out.println(("--------------------------------------"));
		System.out.println("Minimum Sum of Combinations "+findLowestSumnation(arr));
	}
	
	public static int findLowestSumnation(int[] arr)
	{
		int totalSum=arr[0]+arr[1];
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				int sum=0;
				for (int k = i; k < j+1; k++) {
					System.out.print(arr[k]+" ");
					sum += arr[k];
				}
				if(sum<totalSum)
					totalSum = sum;
				System.out.println();
			}
		}
		return totalSum;
	}

}
