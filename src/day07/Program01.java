package day07;

public class Program01 {

	public static void main(String[] args) {
		// if condition
		int a=10;
		int b=20;
		System.out.println("Start Program!!!");
		if (a>b) //if added ;, it will be considered as a stmt and doesn't checks for condition
		{
			System.out.println("Good Day!!!");
			System.out.println("Good Morning!!!");
		}
		if (a<b)
		
			System.out.println("Good Day!!!"); //only one stmt, no braces req
		
	
		System.out.println("End Program!!!");
	}

}
