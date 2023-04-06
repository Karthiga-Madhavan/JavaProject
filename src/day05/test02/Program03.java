package day05.test02;

public class Program03 extends Program02{

	public static void main(String[] args) {
		//Multi-level Inheritance
		// Static Methods can be accessed by direct calling method and Non-Static methods can be accessed only by creating objects
		display1();
		display2();
		Program03 x=new Program03();
		x.display1NS();
		x.display2NS();
	}

}
