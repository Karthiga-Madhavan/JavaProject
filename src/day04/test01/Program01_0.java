package day04.test01;

public class Program01_0 extends Program02{

	public static void main(String[] args) {
		
		// tested multi-level inheritance, multiple inheritance not possible
		addMethod(30, 20);
		//subMethod(50, 25); //It's Private Method-not visible
		mulMethod(4, 6);
		sqrtMethod(7);
		Program01 x= new Program01();
		x.addMethodNonStatic(30, 10);
		//x.subMethodNonStatic(50, 15); //It's Private Method-not visible
		x.mulMethodNonStatic(5, 6);
		x.sqrtMethodNonStatic(4);
		
	}
}
