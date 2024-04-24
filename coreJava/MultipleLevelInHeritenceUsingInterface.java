package coreJava;

interface Interface1{
	void mehtod1();
}
interface Interface2{
	void mehtod2();
}
interface Interface3 extends Interface1,Interface2
{
	void mehtod3();
}
class Execution implements Interface3
{

	public void mehtod1() {
		//implementation
		
	}
	public void mehtod2() {
		//implementation
		
	}
	public void mehtod3() {
		//implementation
		
	}

}
public class MultipleLevelInHeritenceUsingInterface {

	public static void main(String[] args) {

		Execution e1 = new Execution();
		e1.mehtod1();
		e1.mehtod2();
		e1.mehtod3();
		
	}

}
