package com.jsp.arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,0,4,5,6,7,8,9};
		
		printReverse(arr);
		evenIndexElement(arr);
		oddIndexElements(arr);
		

	}

	public static void oddIndexElements(int[] arr) {
		System.out.println("Even Index Elements ");
		for (int i = 0; i < arr.length; i++) 
		{
			if(i%2==0)
			{
				System.out.println("Index : "+i+"->"+arr[i]+" ");
			}
		}
		System.out.println();
		
	}

	public static void evenIndexElement(int[] arr) {
		System.out.println("Odd Index Elements ");
		for (int i = 0; i < arr.length; i++) 
		{
			if(i%2!=0)
			{
				System.out.println("Index : "+i+"->"+arr[i]+" ");
			}
		}
		System.out.println();
		
	}

	public static void printReverse(int[] arr) {
		System.out.println("Reverse of the Array");
		for (int i = arr.length-1; i >0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
