package day04.test02;

import day04.test01.Program01;

public class Program04 {

	public static void main(String[] args) {
		Program01 x= new Program01();
		x.addMethodNonStatic(30, 10);
		//x.mulMethodNonStatic(5, 6); //Protected Method-not visible
	}

}