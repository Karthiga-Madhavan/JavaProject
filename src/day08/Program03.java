package day08;

public class Program03 {

	public static void main(String[] args) {
		
		//Bhanu prakash Task for reference, Comparison between four numbers using nested if-else
		int a=90;
		int b=10;
		int c=100;
        int d=200;
		if(a>=b && a>=c && a>=d)
		{
			if(a==b && a==c && a==d)
			{
				System.out.println("a,b,c & d are equal");
			}
			else if(a==b && a==c && a>d)
			{
				System.out.println("a,b,c are equal and greater than d");
			}
			else if(a==c && a==d && a>b)
			{
				System.out.println("a,c,d are equal and greater than b");
			}
			else if(a==b && a==d && a>b)
			{
				System.out.println("a,b,d are equal and greater than c");
			}
			else if(b==c && b==d) 
			{
				System.out.println("a is greater than b,c,d which are equal");
			}
			else if(a==b && a>c && a>d)
			{
				if(c>d) 
				{
					System.out.println("a &b are equal and greater than c and c is greater than d");
				}
				else 
				{
					System.out.println("a &b are equal and greater than d and d is greater than c");
				}
			}
			else if(a==c && a>b && a>d)
			{
				if(b>d) 
				{
					System.out.println("a &c are equal and greater than b and b is greater than d");
				}
				else
				{
					System.out.println("a &c are equal and greater than d and d is greater than b");
				}
			}
			else if(a==d && a>b && a>c)
			{
				if(b>c) 
				{
					System.out.println("a & d are equal and greater than b and b is greater than c");
				}
				else 
				{
					System.out.println("a & d are equal and greater than c and c is greater than b");
				}
			}
			else if(b>=c && b>=d)
			{
				if(b==c && b>d)
				{
					System.out.println("a is greater than b&c, which are equal and greater than d");
				}
				else if(b==d && b>c)
				{
					System.out.println("a is greater than b&d, which are equal and greater than c");
				}
				else if(c==d)
				{
					System.out.println("a is greater than b and b is greater than c&d which are equal");
				}
				else if(c>d)
				{
					System.out.println("a is greater than b and b is greater than c and c is greater than d");
				}
				else {
					System.out.println("a is greater than b and b is greater than d and d is greater than c");
				}
			}
			else if(c>=b && c>=d) 
			{
				if(c==d)
				{
					System.out.println("a is greater than c&d, which are equal and greater than b");
				}
				else if(b==d) 
				{
					System.out.println("a is greater than c and c is greater than b&d which are equal");
				}
				else if(b>d)
				{
					System.out.println("a is greater than c and c is greater than b and b is greater than d");
				}
				else 
				{
					System.out.println("a is greater than c and c is greater than d and d is greater than c");
				}
			} 
			else {
				if(b==c) 
				{
					System.out.println("a is greater than d and d is greater than b&c which are equal");
				}
				else if(b>c)
				{
					System.out.println("a is greater than d and d is greater than b and b is greater than c");
				}
				else 
				{
					System.out.println("a is greater than d and d is greater than c and c is greater than b");
				}
			}

		}
		else if(b>=a && b>=c && b>=d)
		{
			if(b==c && b==d)
			{
				System.out.println("b,c,d are equal and greater than a");
			}
			else if(a==c && a==d) 
			{
				System.out.println("b is greater than a,c,d which are equal");
			}
			else if(b==c && b>a && b>d)
			{
				if(a>d) 
				{
					System.out.println("b &c are equal and greater than a and a is greater than d");
				}
				else
				{
					System.out.println("b &c are equal and greater than d and d is greater than a");
				}
			}
			else if(b==d && b>a && b>c)
			{
				if(a>c) 
				{
					System.out.println("b &d are equal and greater than a and a is greater than c");
				}
				else
				{
					System.out.println("b &d are equal and greater than c and c is greater than a");
				}
			} 
			else if(a>=c && a>=d)
			{
				if(a==c && a>d)
				{
					System.out.println("b is greater than a&c, which are equal and greater than d");
				}
				else if(a==d && a>c)
				{
					System.out.println("b is greater than a&d, which are equal and greater than c");
				}
				else if(c==d)
				{
					System.out.println("b is greater than a and a is greater than c&d which are equal");
				}
				else if(c>d)
				{
					System.out.println("b is greater than a and a is greater than c and c is greater than d");
				}
				else {
					System.out.println("b is greater than a and a is greater than d and d is greater than c");
				}
			}
			else if(c>=a && c>=d) 
			{
				if(c==d)
				{
					System.out.println("b is greater than c&d, which are equal and greater than a");
				}
				else if(a==d) 
				{
					System.out.println("b is greater than c and c is greater than a&d which are equal");
				}
				else if(a>d)
				{
					System.out.println("b is greater than c and c is greater than a and a is greater than d");
				}
				else 
				{
					System.out.println("b is greater than c and c is greater than d and d is greater than a");
				}
			} 
			else {
				if(a==c) 
				{
					System.out.println("b is greater than d and d is greater than a&c which are equal");
				}
				else if(a>c)
				{
					System.out.println("b is greater than d and d is greater than a and a is greater than c");
				}
				else 
				{
					System.out.println("b is greater than d and d is greater than c and c is greater than a");
				}
			}
		}
		else if(c>=a && c>=b && c>=d)
		{
			if(a==b && a==d) 
			{
				System.out.println("c is greater than a,b,d which are equal");
			}
			else if(c==d && c>a && c>b)
			{
				if(a>b) 
				{
					System.out.println("c &d are equal and greater than a and a is greater than b");
				}
				else
				{
					System.out.println("c &d are equal and greater than b and b is greater than a");
				}
			}
			else if(a>=b && a>=d)
			{
				if(a==b && a>d)
				{
					System.out.println("c is greater than a&b, which are equal and greater than d");
				}
				else if(a==d && a>b)
				{
					System.out.println("c is greater than a&d, which are equal and greater than b");
				}
				else if(b==d)
				{
					System.out.println("c is greater than a and a is greater than b&d which are equal");
				}
				else if(b>d)
				{
					System.out.println("c is greater than a and a is greater than b and b is greater than d");
				}
				else {
					System.out.println("c is greater than a and a is greater than d and d is greater than b");
				}
			}
			else if(b>=a && b>=d) 
			{
				if(b==d)
				{
					System.out.println("c is greater than b&d, which are equal and greater than a");
				}
				else if(a==d) 
				{
					System.out.println("c is greater than b and b is greater than a&d which are equal");
				}
				else if(a>d)
				{
					System.out.println("c is greater than b and b is greater than a and a is greater than d");
				}
				else 
				{
					System.out.println("c is greater than b and b is greater than d and d is greater than a");
				}
			} 
			else {
				if(a==b) 
				{
					System.out.println("c is greater than d and d is greater than a&b which are equal");
				}
				else if(a>b)
				{
					System.out.println("c is greater than d and d is greater than a and a is greater than b");
				}
				else 
				{
					System.out.println("c is greater than d and d is greater than b and b is greater than a");
				}
			}
			
		}
		else{
		    if(a>=b && a>=c)
			{
				if(a==b && a>c)
				{
					System.out.println("d is greater than a&b, which are equal and greater than c");
				}
				else if(a==c && a>b)
				{
					System.out.println("d is greater than a&c, which are equal and greater than b");
				}
				else if(b==c)
				{
					System.out.println("d is greater than a and a is greater than b&c which are equal");
				}
				else if(b>c)
				{
					System.out.println("d is greater than a and a is greater than b and b is greater than c");
				}
				else {
					System.out.println("d is greater than a and a is greater than c and c is greater than b");
				}
			}
			else if(b>=a && b>=c) 
			{
				if(b==c)
				{
					System.out.println("d is greater than b&c, which are equal and greater than a");
				}
				else if(a==c) 
				{
					System.out.println("d is greater than b and b is greater than a&c which are equal");
				}
				else if(a>c)
				{
					System.out.println("d is greater than b and b is greater than a and a is greater than c");
				}
				else 
				{
					System.out.println("d is greater than b and b is greater than c and c is greater than a");
				}
			} 
			else {
				if(a==b) 
				{
					System.out.println("d is greater than c and c is greater than a&b which are equal");
				}
				else if(a>b)
				{
					System.out.println("d is greater than c and c is greater than a and a is greater than b");
				}
				else 
				{
					System.out.println("d is greater than c and c is greater than b and b is greater than a");
				}
			}
		}
	}
	
}
