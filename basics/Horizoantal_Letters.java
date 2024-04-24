package basics;

public class Horizoantal_Letters {

	public static void main(String[] args) {
		char ch[] = {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println("Array Address is: "+ch);
		
		System.out.println("Array Length is: "+ch.length);
		
		System.out.println("Character array in Horzantal Format: ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}

	}

}
