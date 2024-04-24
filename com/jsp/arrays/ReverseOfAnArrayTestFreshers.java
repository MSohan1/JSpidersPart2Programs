package com.jsp.arrays;

import java.util.Scanner;

public class ReverseOfAnArrayTestFreshers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int zero=0,pos=0,neg=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==0)
			{
				zero++;
			}
			else if(arr[i]>0)
			{
				pos++;
			}
			else
			{
				neg++;
			}
		}
		if(zero==arr.length)
		{
			System.out.println("Contains all zeros");
		}
		else if(pos==arr.length)
		{
			System.out.print("After reversing the array : [ ");
			reerse(arr);
			System.out.println("]");
		}
		else if(neg==arr.length)
		{
			System.out.print("After reversing the array : [ ");
			reerse(arr);
			System.out.println("]");
		}
		else
		{
			int a[] = new int[pos];
			int b[] = new int[neg];
			int k=0,j=0;
			System.out.print("After reversing the array : [ ");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>0)
				{
					a[j]=arr[i];
					j++;
				}
				if(arr[i]<0)
				{
					b[k]=arr[i];
					k++;
				}
				
			}
			reerse(a);
			reerse(b);
			System.out.println("]");
		}
	
	}

	public static  void reerse(int[] a)
	{
		for (int i = a.length-1; i >=0; i--) 
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}