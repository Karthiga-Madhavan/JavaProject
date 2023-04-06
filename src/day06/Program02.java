package day06;

public class Program02 {

	public static void main(String[] args) {
		// Boolean Expressions
		// < > <= >= == !=  --->true/false
		int a=30;
		int b=20;
		double c=20;
		
		System.out.println("*******");
		System.out.println(a>b);//T
		System.out.println(b>a);//f
		System.out.println(a<b);//f
		System.out.println(b<a);//t
				
		System.out.println("*******");
		System.out.println(a>=b);//t
		System.out.println(b>=a);//f
		System.out.println(a<=b);//f
		System.out.println(b<=c);//t
		
		System.out.println("*******");
		System.out.println(a==b);//f
		System.out.println(b!=a);//t
		System.out.println(b==c);//t
		System.out.println(b!=c);//f
		
		
	}

}
