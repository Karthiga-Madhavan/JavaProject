package day12;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/* fibonacci number series and in pattern form
		0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
		 */
		int x=0;
		int y=1;
		for(int i=1;i<=15;i++)
		{
			
			System.out.print(x+"\t");
			int z=x+y;
			x=y;
			y=z;
		}
		System.out.println();
		System.out.println();
		
	/*	0
		1 1 
		2 3 5 
		8 13 21 34 
		55 89 144 233 377 */
		
		int x1=0, y1=1;
		for(int i=1; i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x1+" ");
				int z1=x1+y1;
				x1=y1;
				y1=z1;
			}
			System.out.println();
		}
	}

}
