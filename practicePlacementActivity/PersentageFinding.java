package practicePlacementActivity;

import java.util.Scanner;

public class PersentageFinding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input =scanner.nextLine();
		
		
		
		double upper=0,lower=0,special=0,digit=0;
		
		
		
		
		for (int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i)>=65 && input.charAt(i)<=90)
				upper++;
			else if(input.charAt(i)>=97 && input.charAt(i)<=122)
				lower++;
			else if(input.charAt(i)>=48 && input.charAt(i)<=57)
				digit++;
			else
				special++;
		}
		
		System.out.println("Uppercase Percentage: "+(upper/input.length())*100+"%");
		System.out.println("Lower Percentage: "+(lower/input.length())*100+"%");
		System.out.println("Digit Percentage: "+(digit/input.length())*100+"%");
		System.out.println("Special Character Percentage: "+(special/input.length())*100+"%");

	}

}
