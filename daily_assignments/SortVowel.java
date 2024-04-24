//Program to sort vowel Characters in an array


//[a,e,v,y,i,h,d,r,s,s]
//[a,e,i,v,y,h,d,r,s,s]
package daily_assignments;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SortVowel {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		char []arrCh = new char [scanner.nextInt()];
		for (int i = 0; i < arrCh.length; i++) 
		{
			arrCh[i] = scanner.next().charAt(0);
		}
		
//		sort(arrCh);
		char[] Character =countVowels(arrCh);
//		System.out.println(Arrays.toString(Character));
		char[] nonCharacter = nonVowels(arrCh);
//		System.out.println(Arrays.toString(nonCharacter));
		for (int i = 0; i < Character.length; i++)
			arrCh[i] = Character[i];
		for (int i = Character.length; i < nonCharacter.length; i++)
			arrCh[i] = nonCharacter[i];
		
		System.out.println(Arrays.toString(arrCh));
		
	}
	public static char[] countVowels(char[] arrCh)
	{
		int count=0;
		for (int i = 0; i < arrCh.length; i++) 
		{
				if(arrCh[i]=='a' ||arrCh[i]=='e' ||arrCh[i]=='i' ||arrCh[i]=='o' ||arrCh[i]=='u' ||arrCh[i]=='A' ||arrCh[i]=='E' ||arrCh[i]=='I' ||arrCh[i]=='O' ||arrCh[i]=='U' )
				{
					count++;
				}
		}
		char Character[] =new char [count];
		int k=0;
		for (int i = 0; i < arrCh.length; i++) 
		{
			if(arrCh[i]=='a' ||arrCh[i]=='e' ||arrCh[i]=='i' ||arrCh[i]=='o' ||arrCh[i]=='u' ||arrCh[i]=='A' ||arrCh[i]=='E' ||arrCh[i]=='I' ||arrCh[i]=='O' ||arrCh[i]=='U' )
			{
				Character[k] = arrCh[i];
				k++;
			}
		}
//		System.out.println(Arrays.toString(Character));
		return Character;
	}
	
	public static char[] nonVowels(char[] arrCh) 
	{
		int count=0;
		for (int i = 0; i < arrCh.length; i++) 
		{
				if(arrCh[i]=='a' ||arrCh[i]=='e' ||arrCh[i]=='i' ||arrCh[i]=='o' ||arrCh[i]=='u' ||arrCh[i]=='A' ||arrCh[i]=='E' ||arrCh[i]=='I' ||arrCh[i]=='O' ||arrCh[i]=='U' )
				{
					count++;
				}
		}
		char nonCharacter[] = new char[arrCh.length-count];
		int k=0;
		for (int i = 0; i < arrCh.length; i++)
		{
			if(arrCh[i]=='a' ||arrCh[i]=='e' ||arrCh[i]=='i' ||arrCh[i]=='o' ||arrCh[i]=='u' ||arrCh[i]=='A' ||arrCh[i]=='E' ||arrCh[i]=='I' ||arrCh[i]=='O' ||arrCh[i]=='U' )
			{
				continue;
			}
			else
			{
				nonCharacter[k]=arrCh[i];
				k++;
			}
		}
		return nonCharacter;
	
		
	}
	

}
