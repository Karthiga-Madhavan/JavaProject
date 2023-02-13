package day07;

public class Program06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=100;
		int c=1000;
		
		if ((a>=b)&&(a>=c)) 
		{
			if(a==b)
			{
				System.out.println("a and b are equal");
			}
			else if(a==c) 
			{
			System.out.println("a and c are equal");
			}
			else
			System.out.println("a is greater");
		}
		else if (b>=c)  //multiple else if conditions delays execution time
		{
			if(b==c)
			{
				System.out.println("b and c are equal");
			}
			else
			System.out.println("b is greater");
		}
		else   // Simply use as else if it is the last condition
		{
			System.out.println("c is greater");
		}
		
	}

}
