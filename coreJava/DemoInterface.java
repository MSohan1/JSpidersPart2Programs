package coreJava;
interface Sample1
{
	public void test1();
}
interface Sample2 extends Sample1
{
	public void test2();
}

 class Sample  implements Sample2
{

	
	public void test1()
	{
//		Implementation
	}
	public void test2()
	{
//		Implementation		
	}
	

}
public class DemoInterface
{
	public static void main(String[] args) {
		Sample s = new Sample();
		s.test1();
		s.test2();
		
	}
}

