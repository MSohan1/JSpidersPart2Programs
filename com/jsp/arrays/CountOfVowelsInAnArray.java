package com.jsp.arrays;

import java.util.Scanner;

public class CountOfVowelsInAnArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int size = scanner.nextInt(); 
		char ch[] = new char[size];
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i] = scanner.next().charAt(0);
		}
		System.out.println("Count of Vowels in the array is: "+countVowels(ch));
		
		
				

	}

	private static int countVowels(char[] ch) {
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				count++;
		}
		return count;
		
	}

}
