package day14;

public class Arr_Prime_no_04 {

	// Indhu need correction, sorting Prime and Non-Prime numbers using array
	
	public static void main(String[] args) {
		int[] x= {10,1,20,23,45,65,78,92,100,2}; 
		
		System.out.println("Method 1: ");
		System.out.println("----------");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==0||x[i]==1)
			{
				System.out.println(x[i]+" is not a Prime number");
			}
			else if(x[i]%2==1)
			{
				System.out.println(x[i]+" is a Prime number");
			}
			else
				System.out.println(x[i]+" is not a Prime number");				
		}
		System.out.println();
		System.out.println("Method 2: ");
		System.out.println("----------");
		System.out.println("Prime Numbers: ");
		for(int a:x)
		{
			if (a%2==1)
					System.out.println(a);
		}
		System.out.println("Not a Prime Numbers: ");
		for(int a:x)
		{
			if (a==0||a==1||a%2==0)
					System.out.println(a);
		}
		
	}

}