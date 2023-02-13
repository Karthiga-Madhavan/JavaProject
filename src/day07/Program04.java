package day07;

public class Program04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=10;
	
		System.out.println("Start Program...!");

		if(a>b)
		{
			System.out.println("a is greater");
		}
		else if (a<b) //multiple else if conditions delays execution time
		{
			System.out.println("b is greater");
		}
		else if (a==b) // Simply use as else if it is the last condition
		{
			System.out.println("both are equal");
		}
		
		System.out.println("End Program...!");
	}
		
}
