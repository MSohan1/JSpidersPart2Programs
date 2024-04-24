package stringPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		String copy="";
		
		for (int i = data.length()-1; i >= 0; i--) 
		{
			copy+= data.charAt(i); 
		}
		System.out.println(copy);

	}

}
