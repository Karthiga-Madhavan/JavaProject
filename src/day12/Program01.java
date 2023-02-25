package day12;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*				
		  				1
						2 3
						4 5 6
						7 8 9 10
						11 12 13 14 15
		
		 */
				int x=1;
				for(int i=1; i<=5;i++) 
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(x+" ");
						x=x+1;
					}
					System.out.println();
				}
			}

		}

