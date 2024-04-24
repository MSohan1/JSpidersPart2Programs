//-5 -2 1 5 => 4
//Enter the Elements of B array : 
//0 9
//[-5, -2, 1, 5]
//[0, 9]
//[-5, -2, 0, 1, 5, 9]

package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merging2ArraysSorted {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of A array : ");
		Scanner scanner = new Scanner(System.in);
		int aSize = scanner.nextInt();
		int arrA[] = new int[aSize];
		System.out.println("Enter the Size of B array : ");
		int bSize = scanner.nextInt();
		int arrB[] = new int[bSize];
		
		System.out.println("Enter the Elements of A array : ");
		for (int i = 0; i < arrA.length; i++)
		{
			arrA[i] = scanner.nextInt();
		}	
		System.out.println("Enter the Elements of B array : ");
		for (int i = 0; i < arrB.length; i++)
			arrB[i] = scanner.nextInt();
		int mergeArray[] = new int[(arrA.length+arrB.length)];
		
		
		
		
		SelectionSort(arrA);
		SelectionSort(arrB);
		merge1And2(arrA,arrB,mergeArray);
		
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		System.out.println(Arrays.toString(mergeArray));
		
		
		
	}
	private static void merge1And2(int[] arrA, int[] arrB,int [] mergeArray) {

		
		int i=0,j=0,k=0;
		
		while((i<arrA.length && j<arrB.length))
		{
			if(arrA[i]>=arrB[j])
			{
				mergeArray[k] = arrB[j];
				j++;
			}
			else
			{
				mergeArray[k] = arrA[i];
				i++;
			}
			k++;
		}
		
		
		while(i<arrA.length)
		{
			mergeArray[k] = arrA[i];
			i++;
			k++;
		}
		while(j<arrB.length)
		{
			mergeArray[k] = arrB[j];
			j++;
			k++;
		}
		
		
	}
	private static void SelectionSort(int arr[])
	{
	
		for (int i = 0; i < arr.length-1; i++) 
		{
			int index= i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[index]>arr[j])
					index = j;
			}
			if(index!=i)
			{
				swap(arr,index,i);
			}
		}
	}
	private static void swap(int[] arr, int index, int i) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
		
	}

}
