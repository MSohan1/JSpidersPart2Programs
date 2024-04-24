package com.jsp.arrays;

public class Oddalindrom {

	public static void main(String[] args) {

		int arr[] = {515,77,123,151,717,12,419,424,36,232,35,51,558,57,99,91};
		System.out.println("Non Odd Element palindrom are: ");
		for(int i = 0 ;i<arr.length;i = i+2)
		{
			int temp = arr[i];
			int rev=0;
			while(temp!=0)
			{
				rev = (rev*10)+temp%10;
				temp/=10;
			}
			if(rev==arr[i])
			{
				System.out.println("at index "+i +" " +arr[i]+" is a palindrom Number");
			}
		}

	}

}
