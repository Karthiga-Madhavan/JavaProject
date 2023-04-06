package day04.test02;

// 	import day04.test01.*; 		to import all classes
import day04.test01.Program01;     // import class from otherpackage

public class Program03 extends Program01{

	// Default Methods are accessible only with the same class package.
	public static void main(String[] args) {
		addMethod(30, 20);
		//subMethod(50, 25); //Private Method-not visible
		mulMethod(4, 6);
		//sqrtMethod(7); //Default Method-not visible
		Program03 x= new Program03(); //Current class object
		x.addMethodNonStatic(30, 10);
		//x.subMethodNonStatic(50, 15); //Private Method-not visible
		x.mulMethodNonStatic(5, 6);
		//x.sqrtMethodNonStatic(4); //Default Method-not visible
		}
}
