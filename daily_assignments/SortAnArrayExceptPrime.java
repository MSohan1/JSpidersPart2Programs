//Q) Program to sort array except if it is prime

package daily_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayExceptPrime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
			arr[i]= scanner.nextInt();
		
		int count =countPrime(arr);
		int arr1[] = new int[arr.length - count];
		int k=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(findPrime(arr[i]))
			{
				continue;
			}
			else
			{
				arr1[k]= arr[i];
				k++;
			}
		}
		sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		

	}
	public static void sort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr.length-1; j++) 
			{
					if(arr[j-1]>arr[j])
					{
						int temp = arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
			}
		}
	}
	public static int countPrime(int arr[])
	{
		int countPrime=0;
		for (int i = 0; i < arr.length; i++) 
		{
			int num = arr[i];
			int count=0;
			for (int j = 1; j <= num; j++)
			{
				if(num%j==0)
					count++;
			}
			if(count==2)
			{
				countPrime++;
			}
		}
		return countPrime;
	}
	public static boolean findPrime(int num)
	{
		int count=0;
		for (int j = 1; j <= num; j++)
		{
			if(num%j==0)
				count++;
		}
		if(count==2)
		{
			return true;
		}
		
		return false;
	}

}
