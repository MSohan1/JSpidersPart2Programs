//2Q)N number of students are sitting in a class, Each Student Have his own result(%) Find the class Topper and find the least score Student in a class 
//	and print there percentage with there Names


package daily_assignments;

import java.util.Scanner;

public class Assignment3_Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Students");int size = scanner.nextInt();
		int percentages[] = new int[size];
		String names[] = new String[size];
		for (int i = 0; i < percentages.length; i++) 
		{
			names[i] =scanner.next();
			percentages[i] = scanner.nextInt();
		}
		String topperName = names[0];
		int topperResult = percentages[0];
		String leastName = names[0];
		int leastResult = percentages[0];
		for (int i = 0; i < percentages.length; i++) 
		{
			if(topperResult<percentages[i])
			{
				topperResult =percentages[i];
				topperName = names[i];
			}
			else if(leastResult>percentages[i])
			{
				leastResult = percentages[i];
				leastName = names[i];
			}
			
		}
		System.out.println("Topper of the Class: "+topperName+" and his percentage is: "+topperResult);
		System.out.println("Least scored person of the Class: "+leastName+" and his percentage is: "+leastResult);

	}

}
