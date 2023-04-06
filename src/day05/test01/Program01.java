package day05.test01;

public class Program01 {

	public static void main(String[] args) {
		// Method overloading, by changing datatypes or by adding parameters 
		add(30,20);
		add(1.5, 2.5);
		add(20,30,10);
	}
	public static void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	public static void add(double a, double b) 
	{
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) 
	{
		System.out.println(a+b+c);
	}

}
