package day03.test01;

public class Program02 extends Program01{

	public static void main(String[] args) {
		// Inheritance using extends Keyword
		Program02 obj1= new Program02(); 
		obj1.addMethod(10, 20);     //non-Static method
		subMethod(20, 10);			//static method
		mulMethod(20, 30);
	}

}
