package day11;

public class Program07 {

	public static void main(String[] args) {
		/*
		
		1	
		2	4	
		3	9	3	
		4	16	4	16	
		5	25	5	25	5
		
		*/

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)//j=1, j=2, j=3, j=4,j=5
			{
				if(j%2==1)
				{
					System.out.print(i+"\t");
				}
				else
				{
					System.out.print(i*i+"\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=5;i++)//i=5
		{
			boolean x=true;
			for(int j=1;j<=i;j++)//j=1, j=2, j=3, j=4,j=5
			{
				if(x)
				{
					System.out.print(i+"\t");//5
					x=false;
				}
				else
				{
					System.out.print(i*i+"\t");// 25
					x=true;
				}

			}
			System.out.println();
		}
	}
}
