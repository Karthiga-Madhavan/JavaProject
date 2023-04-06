package day06;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		// Passing values using java Scanner class
		// + - * /(Q)  %(R) Numbers

		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Int value of a: ");
		int a=x.nextInt();
		System.out.println("Enter the Int value of b: ");
		int b=x.nextInt();
		System.out.println("Enter the Int value of c: ");
		double c=x.nextDouble();
		x.close();
		// int () int--->int
		//int () double/float---> double/float
		
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
