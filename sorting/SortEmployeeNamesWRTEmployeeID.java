//[1,2,4,5,3]
//
//[sohan,bhanu,vamsi,vikas,manohar]
//[1,2,3,4,5]
//[soha,bhanu,manohar,vamsi,vikas]


package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortEmployeeNamesWRTEmployeeID {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int EmployeeId[] = new int[scanner.nextInt()];
		
		String EmployeeName[] = new String[EmployeeId.length];
		
		System.out.println("Enter Employee ID's");
		for (int i = 0; i < EmployeeId.length; i++) 
			EmployeeId[i]= scanner.nextInt();
		
		System.out.println("Enter Employee Names");
		for (int i = 0; i < EmployeeName.length; i++) 
			EmployeeName[i]= scanner.next();
		
		sort(EmployeeId, EmployeeName);
		System.out.println(Arrays.toString(EmployeeId));
		System.out.println(Arrays.toString(EmployeeName));

	}
	private static void sort(int []Employeeid,String EmployeeName[])
	{
		
		for (int i = 0; i < Employeeid.length-1; i++)
		{
			int index = i;
			for (int j = i+1; j < Employeeid.length; j++) 
			{
				if(Employeeid[index]> Employeeid[j])
				{
					index = j;
				}
			}
			if(index!=i)
			{
				swap(Employeeid, index, i);
				swap(EmployeeName,index,i);
			}
		}
	}
	public static void swap(int arr[],int index,int i)
	{
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}
	public static void swap(String arr[],int index,int i)
	{
		String temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}

}
