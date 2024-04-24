package sorting;

import java.util.Scanner;

public class LargestSummnationOf2Combinations {

	
	public static void main(String[] args)
	{
		System.out.println("Enter Size of the array ");
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		findLargest(arr);
		twoLargestElements(arr);
	}
	public static void  findLargest(int arr[])
	{
		int totalSum=0,element1=0,element2=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				int sum=arr[i]+arr[j];
				if(sum> totalSum)
				{
					totalSum = sum;
					element1 = arr[i];
					element2 = arr[j];
				}
			}
		}
		System.out.println("Maximum Sum of 2 Combinations are : "+totalSum+" ==> Combination Elements are : "+element1+", "+element2);
	
	}
	
	
	
//	Try to print first Largest and second Largest Elemnts
	public static void twoLargestElements(int arr[])
	{
		int firstLargest=0,secondLargest=0,count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>firstLargest)
			{
				firstLargest=arr[i];
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if((firstLargest!=secondLargest) && arr[i]>secondLargest  )
			{
				secondLargest=arr[i];
			}
		}
		System.out.println(firstLargest+" "+secondLargest);
		
	}
}
