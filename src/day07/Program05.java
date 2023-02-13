package day07;

public class Program05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=10;
		int c=50;
	
		System.out.println("Start Program...!");

		if ((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if ((b>a)&&(b>c))  //multiple else if conditions delays execution time
		{
			System.out.println("b is greater");
		}
		else if ((c>a)&&(c>a))  // Simply use as else if it is the last condition
		{
			System.out.println("c is greater");
		}
		
		System.out.println("End Program...!");
	}

}
