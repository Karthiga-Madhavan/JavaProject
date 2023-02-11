package day06;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=20;
		double c=10;
		
		System.out.println("******");
		System.out.println((a>b) && (a>c));//t
		System.out.println((b>a) && (b>c));//f
		System.out.println((c>a) && (c>a));//f
		
		System.out.println("******");
		System.out.println((a>b) || (a>c));//t
		System.out.println((b>a) || (b>c));//t
		System.out.println((c>a) || (c>a));//f
		
		System.out.println("******");
		System.out.println(!(a>b));//f
		System.out.println(!(b>a));//t
		System.out.println(!(c>a));//t
	}

}
