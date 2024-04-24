//1Q)There is a worker in a village and he works daily basis, Each Day he works based on Number of hours in a week Except Sunday
//	=>And He Earns 100rs/hr in a day, Calculate The Complete week Salary and check his first half of the week salary and second half of the week salary
//	is equal or not 
//[5 6 7 8 9 4 1]

package daily_assignments;

import java.util.Scanner;

public class Assignment3_StoryQuestion1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		int zeroCount=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==0)
				zeroCount++;
		}
		if(zeroCount == arr.length)
			System.out.println("Worker did not got to work fore Whole week");
		else 
		{
			int firstHalf[] = new int[arr.length/2];
			int secondHalf[] = new int[arr.length/2+arr.length%2];
			int j=0,k=0;
			for (int i = 0; i < arr.length; i++)
			{
				if(i<firstHalf.length)
				{
					firstHalf[j] = arr[i];
					j++;
				}
				else
				{
					secondHalf[k] = arr[i];
					k++;
				}
			}
			int firstHalfSum =0,secongHalfSum =0;
			for (int i = 0; i < firstHalf.length; i++)
				firstHalfSum += firstHalf[i]*100;
			for (int i = 0; i < secondHalf.length; i++)
				secongHalfSum += secondHalf[i]*100;
			System.out.println("Total Earnings in a weak = "+(firstHalfSum+secongHalfSum));
			if(firstHalfSum == secongHalfSum)
				System.out.println("First Half sum and Second half sum are equal!!");
			else
				System.out.println("First Half sum and Second half sum are not equal!!");
		
		}
		}
		

}
