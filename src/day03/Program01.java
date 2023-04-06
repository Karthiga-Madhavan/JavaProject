package day03;

public class Program01 {

	public static void main(String[] args) {
		// calling Methods
		cal(30,20);
		System.out.println("--------------");
		cal(50,50);
	}
	
	public static void cal(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	}
}
