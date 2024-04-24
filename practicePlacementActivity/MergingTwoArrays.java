package practicePlacementActivity;

import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr1[] = new int[scanner.nextInt()];
		int arr2[] = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = scanner.nextInt();
		
		for (int i = 0; i < arr1.length; i++)
			arr2[i] = scanner.nextInt();
	
		merge(arr1,arr2);
	
	
	}

	private static void merge(int[] arr1, int[] arr2) 
	{
		int negCount=0,zeroCount1=0,zeroCount2=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr1[i]<0)
				negCount++;
			
			if(arr1[i]==0)
				zeroCount1++;
		}
		for (int i = 0; i < arr2.length; i++) 
		{
			if(arr2[i]<0)
				negCount++;
			
			if(arr2[i]==0)
				zeroCount2++;
		}
		
		if(zeroCount1==arr1.length ||zeroCount2==arr1.length)
			System.out.println("Array Contains Zero Elements");
		else if(negCount>0)
		{
			int arr3[] = new int[negCount];
//			System.out.println(negCount);
			int j=0,k=0;
			for (int i = 0; i < arr3.length; i++) 
			{
				
				if(arr1[j]<0)
				{
//					System.out.print(arr1[j]+" " );
					arr3[i]=arr1[j];
				}
				else if(arr2[k]<0)
					arr3[i]=arr2[k];
				j++;
				k++;
			}
			for (int i = 0; i < arr3.length; i++) 
				System.out.print(arr3[i]+" ");
		}
		else
		{
			int arr3[] = new int[(arr1.length+arr2.length)];
			int j=0,k=0,l=0;
			while(j<arr1.length)
			{
				arr3[k]=arr1[j];
				j++;k++;
						
			}
			while(l<arr2.length)
			{
				arr3[k]=arr2[l];
				l++;k++;
						
			}
		}
		
		
		
		

	}

}
