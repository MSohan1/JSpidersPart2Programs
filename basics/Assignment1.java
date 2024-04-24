
package basics;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		

			Scanner scanner = new Scanner(System.in);
//Taking all questions Methods in one class
			System.out.println("Press 1 to check Positive or negitive Number.");
			System.out.println("Press 2 to check character is Alphabet or Number or special_Char.");
			System.out.println("Press 3 to count palindrom numbers between range.");
			System.out.println("Press 4 to reverse a prime number b/w the range.");
			System.out.println("Press 5 to print sum of not palindrom numbers between range.\n");

			
			System.out.println("Select any One");
			int selectNum = scanner.nextInt();
			//using switch block calling all the methods
			while(selectNum!=0)
			{
				switch(selectNum)
				{
				
				
					case 1:
						
				//1Q) To check Positive or negitive Number.
						System.out.println("You Have selected option 1:");
						System.out.println("Enter a Number");
						int num = scanner.nextInt();
						checkPosNeg(num); //Static method Calling 
						break;
					case 2:
				
				//2Q) To check character is Alphabet or Number or special_Char.
						
						System.out.println("You Have selected option 2:");
						System.out.println("Enter a character");
						
						String ch = scanner.next();
						
						check_Alpha_Num(ch.charAt(0));//chatAt(0)==> means first character in a string
						break;
					case 3:
						
				//3Q)To count palindrom numbers between range.
						System.out.println("You Have selected option 3:");
						System.out.println("Enter Start Value to check palindrom Numbers");
						int startValue = scanner.nextInt();
						System.out.println("Enter a range(Last Digit)");
						int endValue = scanner.nextInt();
						
						int count =palindromRange(startValue,endValue);
						System.out.println("The Palindrom Numbers from "+ startValue+" to "+endValue+" is :"+count+"\n");
						
						break;
					case 4:
						
				//4Q)Reverse a prime number b/w the range.
						System.out.println("You Have selected option 4:");
						
						System.out.println("Enter Start Value to check prime Number");
						startValue = scanner.nextInt();
						
						System.out.println("Enter a range(Last Digit)");
						endValue = scanner.nextInt();
						
						reversePrime(startValue,endValue);
						break;
					case 5:
						
				//5Q)To print sum of not palindrom numbers between range.
						
						System.out.println("You Have selected option 5:");
						
						System.out.println("Enter Start Value to check palindrom Numbers");
						 startValue = scanner.nextInt();
						
						System.out.println("Enter a range(Last Digit)");
						 endValue = scanner.nextInt();
						sumOfNotPalindrom(startValue,endValue);
						break;
					default:
						System.out.println("Enter correct Number from(1-6)");
						break;
						
				}
				
				System.out.println("Press 1 to check Positive or negitive Number.");
				System.out.println("Press 2 to check character is Alphabet or Number or special_Char.");
				System.out.println("Press 3 to count palindrom numbers between range.");
				System.out.println("Press 4 to reverse a prime number b/w the range.");
				System.out.println("Press 5 to print sum of not palindrom numbers between range.\n");

				
				System.out.println("Select any One");
				selectNum = scanner.nextInt();

		}
			System.out.println("Thanks For Your Time Byee!!");
	}
	
	public static void checkPosNeg(int num) {
		//checking wether number is pos or neg or zero
		if(num>0)
		{
			System.out.println("The Number "+num+" is positive\n");
		}
		else if(num<0)
		{
			System.out.println("The Number "+num+" is negitive\n");
		}
		else
		{
			System.out.println("The Number "+num+" is Zero\n");
		}
		
	}

	public static void check_Alpha_Num(char ch) {
		//checking wether first character in a string  is alpha or num or special
		
		if((int)ch>=97 && (int)ch<=122 || (int)ch>=65 && (int)ch<=90)
		{
			System.out.println("The Number "+ch+" is alphabet\n");
		}
		else if((int)ch>=48 && (int)ch<=57)
		{
			System.out.println("The Number "+ch+" is number\n");
		}
		else
		{
			System.out.println("The Number "+ch+" is special\n");
		}
		
	}
	
	public static int palindromRange(int start,int end) {
		int count=0;
		for(int i=start;i<=end;i++)//this loop iterate from start to end value values continuesly 
			{//start value is storing at i variable
				int sum=0;
				int temp = i;
				while(temp!=0) //this loop is going to find reverse of a particular Number (variable i) 
				{
					int ld = temp%10;
					sum =(sum*10)+ld;
					temp = temp/10;
				}
				if(i==sum)//checking if reverse of a number is equal to original number
				{
					System.out.println(i +" is a palindrom");
					count++;
				}
				else
				{
	//				System.out.println(i+" is not a palindrom");
				}
		}
		return count;
		
	}
	

	public static void reversePrime(int startValue, int endValue) {
		
		for(int i=startValue;i<=endValue;i++)//this loop iterate from start to end value values continuesly
		{
			int count=0;
			for(int j=1;j<=i;j++)//this loop is to find the particular(variable i) number is prime or not
			{
				if(i%j==0)
				{
					count++;//if yes increase count
				}
			}
			if(count==2)//if count ==2 then it is a prime number 
			{//this block will reverse the particular prime number
			int sum=0;
			int temp = i;//storing i value int temp variable
			while(temp!=0)//reversing the number available in temp variable
			{
				int ld = temp%10;
				sum =(sum*10)+ld;//storing revers number in sum variable
				temp = temp/10;
			}
			System.out.println(i+" number is converted into : ==> "+sum);
			}
		}
	}

	
	public static void sumOfNotPalindrom(int startValue, int endValue) {
		for(int i=startValue;i<=endValue;i++)//this loop iterate from start to end value values continuesly
			{
			int sum=0;
			int temp = i;//storing i value in temp variable 
			while(temp!=0)//reversing a number loop
			{
				int ld = temp%10;
				sum =(sum*10)+ld;
				temp = temp/10;
			}
			if(i==sum)//checking palindrom condition
			{
				continue;
			}
			else//if the number i not a palindrom
			{
				temp = i;//storing i value in temp
				sum=0;
				while(temp!=0)//sum of digits available in  temp variable
				{
					int ld = temp%10;
					sum =sum+ld;
					temp = temp/10;
				}
				System.out.println("The Number "+i+" is not a Plaindrom. And it's sum is ==> "+sum);
				
			}
		}

		
	}

	
}
