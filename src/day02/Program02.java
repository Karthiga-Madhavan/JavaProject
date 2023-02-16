package day02;

public class Program02 {
	
	public static int fun() //method with return type
	{
		int x=10; // 32 bits
		System.out.println(x*x);
		return x*x;
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=fun(); // int or long or double more than 32 bits
		System.out.println(a+a);
		// return 1; main() cannot return any value and must be void
	}
	
}
