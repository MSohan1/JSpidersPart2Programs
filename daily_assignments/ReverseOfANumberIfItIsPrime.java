//Write Once Again


package daily_assignments;

import java.util.Scanner;

public class ReverseOfANumberIfItIsPrime {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();

		}
		Prime(arr);
	}
	public static void Prime(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			int n = arr[i];
			boolean count=false;
			while(n!=0)
			{
				int ld = n%10;
				switch(ld) 
				{
					case 2,3,5,7: count = true;
					break;
					default : count= false;
				}
				n =n/10;
			}
			if(count)
			{
				revNumber(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void revNumber(int n) {
		int prod=0;
			while(n!=0)
			{
				int ld = n%10;
				prod = prod*10+ld;
				n =n/10;
			}
			System.out.print(prod+" ");
		
	}

}
