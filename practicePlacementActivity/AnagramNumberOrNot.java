/*
 * Test Case 1:
 * input 1 : -5342
 * input 2 : 5342
 * output : is Anagram
 * 
 * 
 * Test Case 2:
 * input 1 : 5672
 * input 2 : 5342
 * output : Not Anagram
 */

package practicePlacementActivity;

import java.util.Scanner;

public class AnagramNumberOrNot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if(isAnagram(num1,num2))
			System.out.println("Is Anagram");
		else
			System.out.println("Not Anagram");

	}
	private static boolean isAnagram(int num1,int num2) 
	{
		int temp = Math.abs(num1);
		int sum1=0,sum2=0;
		while(temp!=0)
		{
			sum1 += temp%10;
			temp=temp/10;
		}
		
		temp =Math.abs(num2);
		while(temp!=0)
		{
			sum2 += temp%10;
			temp=temp/10;
		}
		if(sum1==sum2)
			return true;
		
		return false;
		
	}

}
