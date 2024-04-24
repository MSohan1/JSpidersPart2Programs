package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortZerosToLast {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int values[] = new int[scanner.nextInt()];
		
		int ShiftZero[] = new int[values.length];
		
		for(int i = 0; i < values.length; i++) 
			values[i]= scanner.nextInt();
		
		
		byUsing2Arrays(values, ShiftZero);
		byUsing1Array(values);
		
		
		System.out.println(Arrays.toString(ShiftZero));
		System.out.println(Arrays.toString(values));
	}
	private static void byUsing2Arrays(int values[],int ShiftZero[])
	{
		int k =0;
		for(int i = 0; i < values.length; i++) 
		{
			if(values[i]!=0)
			{
				ShiftZero[k] = values[i];
				k++;
			}
		}
	}
	private static void byUsing1Array(int values[])
	{
		int pos=0;
		for(int i = 0; i < values.length; i++) 
		{
			if(values[i]!=0)
			{
				values[pos] = values[i];
				pos++;
			}
		}
		while(pos<values.length)
		{
			values[pos] = 0;
			pos++;
		}
	}
	
}
