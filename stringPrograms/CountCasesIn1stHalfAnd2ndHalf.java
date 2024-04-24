package stringPrograms;

import java.util.Scanner;

public class CountCasesIn1stHalfAnd2ndHalf {

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		int digits=0,special=0;
		
		for (int i = 0; i < data.length()/2; i++) 
		{
			char ch = data.charAt(i);
			System.out.print(ch+" ");
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				
			}
			else if(ch>='0'&&ch<='9')
			{
				digits++;
//				System.out.println(digits);
			}
			else
			{
				special++;
//				System.out.println(special);
			}
		}
		System.out.println("Digits count in first half is : "+digits);
		System.out.println("Special count in first half is : "+digits);
		System.out.println();
		digits=0;special=0;
		for (int i = data.length()/2; i < data.length(); i++) 
		{
			char ch = data.charAt(i);
			System.out.print(ch+" ");
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				
			}
			else if(ch>='0'&&ch<='9')
			{
				digits++;
//				System.out.println(digits);
			}
			else
			{
				special++;
//				System.out.println(special);
			}			
		}
		System.out.println("Digits count in second half is : "+digits);
		System.out.println("Special count in second half is : "+digits);

	}

}
