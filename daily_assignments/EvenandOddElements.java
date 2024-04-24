package daily_assignments;

import java.util.Scanner;

public class EvenandOddElements {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			
				arr[i] = scanner.nextInt();
		}
		System.out.println("Enter Stating and ending Range");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		System.out.println("Even Elements");
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			
			if(i>=start && i<=end)
			{
				if(arr[i]%2==0)
				{
					System.out.print(arr[i]+" ");
					count++;
				}
			}
			else
			{
				System.out.println("Even Elements are not present in the range ");
			}
		}
		System.out.println();
		System.out.println("Odd Elements");
		for (int i = 0; i < arr.length; i++)
		{
			
			if(i>=start && i<=end)
				if(arr[i]%2==0)
				{
					System.out.print(arr[i]+" ");
				}
			else
				System.out.println("Odd Elements are not present in the range ");
		}
	

	}

}
