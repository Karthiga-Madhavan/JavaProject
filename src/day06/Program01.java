package day06;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Int value of a: ");
		int a=x.nextInt();
		System.out.println("Enter the Int value of b: ");
		int b=x.nextInt();
		System.out.println("Enter the Int value of c: ");
		double c=x.nextDouble();
		x.close();
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		System.out.println(a%b);
		System.out.println(a%c);
	}

}
