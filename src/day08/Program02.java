package day08;

public class Program02 {

	public static void main(String[] args) {
		
		int a=10000;
		int b=100;
		int c=1000;
		int d=500;
		
		if (a>=b && a>=c && a>=d) 
		{
			if(a==b && a==c && a==d)
			{
				System.out.println("a, b, c and d are equal");
			}
			else if(a==b && a>c && a>d) 
			{
				System.out.println("a and b are equal and greater than c and d");
			}
			else if(a==c && a>b && a>d)
			{
				System.out.println("a and c are equal and greater than b and d");
			}
			else if(a==d && a>b && a>c)
			{
				System.out.println("a and d are equal and greater than b and c");
			}
			else if (b>c && b>d)  
			{
				System.out.println("a is greater than b and b is greater than c and d");
			}
			else if (c>b && c>d)
			{
				System.out.println("a is greater than c and c is greater than b and d");
			}
			else if (d>b && d>c)
			{
				System.out.println("a is greater than d and d is greater than b and c");
			}
			else   
			{
				System.out.println("a is greater than b, c and d, b, c and d are equal");
			}
		}
		else if(b>=a && b>=c && b>=d)
		{
			if(b==c && b==d)
			{
				System.out.println("b, c & d are equal and greater than a");
			}
			else if(a>c && a>d)
			{
				System.out.println("b is greater than a and a is greater than c and d");
			}
			else if(c>a && c>d)
			{
				System.out.println("b is greater than c and c is greater than a and d");
			}
			else if(d>a && d>c)
			{
				System.out.println("b is greater than d and d is greater than a and c");
			}
			else
			{
				System.out.println("b is greater than a, c and d and a, c and d are equal");

			}
		}
		else if(c>=a && c>=b && c>=d)
		{
			if(c==a && c==d)
			{
				System.out.println("a, c & d are equal and greater than b");
			}
			else if(a>b && a>d)
			{
				System.out.println("c is greater than a and a is greater than b and d");
			}
			else if(b>a && b>d)
			{
				System.out.println("c is greater than b and b is greater than a and d");
			}
			else if(d>a && d>c)
			{
				System.out.println("c is greater than d and d is greater than a and c");
			}
			else
			{
				System.out.println("c is greater than a, b and d, a, b and d are equal");

			}
		}
		else
		{
			if(a>b && a>c)
			{
				System.out.println("d is greater than a and a is greater than b and c");
					
			}
			else if(b>a && b>c)
			{
				System.out.println("d is greater than b and b is greater than a and c");
					
			}
			else if(c>a && c>b)
			{
				System.out.println("d is greater than c and c is greater than a and b");
					
			}
			else
			{
				System.out.println("d is greater than a, b and c, a, b & c are equal");
			}
		}

	}
}
