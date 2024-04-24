package sorting;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int totalSum=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				int sum=0;
				for (int k = i; k < j+1; k++) {
					System.out.print(arr[k]+" ");
					sum += arr[k];
				}
				if(sum>totalSum)
					totalSum = sum;
				System.out.println();
			}
		}
		System.out.println("Maximum Sum of Combinations "+totalSum);
	}

}
