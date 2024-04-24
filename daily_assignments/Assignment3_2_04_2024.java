package daily_assignments;

public class Assignment3_2_04_2024 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,8,9,6,54};
		int sum=0;
		int prod=1;
		for (int i = 0; i < arr.length; i++)
		{
			sum +=arr[i];
			prod *=arr[i];
		}
		System.out.println("The Sum of elements present in an array is: "+sum);
		System.out.println("The product of elements present in an array is: "+prod);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Checking if the character is vowel or not ");
		char alphabets[] = {'a','d','f','e','g','3','j','m','q','i','s','c','w','t'};
		int vowelCount=0,nonVowelCount=0;
		for (int i = 0; i < alphabets.length; i++) 
		{
			if(alphabets[i]=='a'||alphabets[i]=='e'||alphabets[i]=='i'||alphabets[i]=='o'||alphabets[i]=='u')
			{
				System.out.println(alphabets[i]+" is a vowel letter!");
				vowelCount++;
			}
			else if(alphabets[i]=='A'||alphabets[i]=='E'||alphabets[i]=='I'||alphabets[i]=='O'||alphabets[i]=='U')
			{
				System.out.println(alphabets[i]+" is a vowel letter!");
				vowelCount++;
			}
			else
			{
//				System.out.println(alphabets[i]+" is a not avowel letter!");
				nonVowelCount++;
			}
		}
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("String array in to word in reverse");
		String name = "Sohan";

		char ch[] =  name.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) 
		{
			System.out.println(ch[i]);
		}
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Vowel Count is equal to non Vowel Count \n	");
		if(vowelCount == nonVowelCount)
		{
			System.out.println("Equal");
		}
		else {
			System.out.println("Count is not Equal");
		}
		
	}

}
