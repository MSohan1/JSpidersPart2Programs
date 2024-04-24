package coreJava;

interface Sample7
{
	void test7();
}
interface Sample8 extends Sample7
{
	void test8();
}
interface Sample9 extends Sample7
{
	void test9();
}
class Sample8_implementation implements Sample8
{
	public void test7()
	{
//		implementation
	}
	public void test8()
	{
//		implementation		
	}

}
class Sample9_implementation implements Sample9
{
	public void test7()
	{
//		implementation
	}
	public void test9()
	{
//		implementation		
	}

}



public class HirarchichalLevelInheretenceUsingInterface {

	public static void main(String[] args) {
		Sample8_implementation s8 = new Sample8_implementation();
		Sample9_implementation s9 = new Sample9_implementation();
		s8.test7();
		s8.test8();
		s9.test7();
		s9.test9();

	}

}
