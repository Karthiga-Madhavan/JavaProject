	package day13;

import java.util.Arrays;

public class ArraytoString03{
	
	public static void main(String[] args) {
		int[] x= {10,1,20,23,45,65,78,92,100,2}; 
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);		
		System.out.println(Arrays.toString(x));
		
		System.out.println("Copy Function");
		// don't use as int[]y=x; it will use the same memory location. 
		// So, both variable values will get assigned with the same new value instead of a specific variable
		int[] y1=x;
		System.out.println(x);
		System.out.println(y1);
		int[] y=Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		x[0]=111;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(x);
		System.out.println(y);

		}

	}

