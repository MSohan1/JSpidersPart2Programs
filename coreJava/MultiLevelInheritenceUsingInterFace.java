package coreJava;

interface Sample4
{
	void test4();
}
interface Sample5 extends Sample4
{
	void test5();
}
interface Sample6 extends Sample5
{
	void test6();
}
class mainApp1 implements Sample6
{
	public void test4()
	{
//		implementation
	}
	public void test5()
	{
//		implementation		
	}
	public void test6()
	{
//		implementation
	}
}




public class MultiLevelInheritenceUsingInterFace {

	public static void main(String[] args) 
	{
		mainApp1 ma1 = new mainApp1();
		ma1.test4();
		ma1.test5();
		ma1.test6();

	}

}
