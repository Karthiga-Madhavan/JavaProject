package day13;

import java.util.Scanner; 

public class Armstrong_number05 {
	
	public static void main(String[] args) {

	//Stud Bhanu Armstrong number
	/*		Scanner x=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=x.nextInt();
			x.close();
			int temp=n;
			int sum=0;
			while(temp>0) {
				int a=n;
				int pro=1;
				while(a>0) {
					int r=temp%10;
								
					pro = pro*r;
					a=a/10;
				}
				sum = sum+pro;
				temp=temp/10;
			}

			if(n==sum) {
				System.out.println(n+" is an Armstrong number");
			}
			else System.out.println(n+" is not an Armstrong number");
	*/
	
	
	//Avinash	
		int x1[]= {153, 370, 371, 507, 1634, 8208, 9476};

		for(int x:x1)
		{
			String y = String.valueOf(x);
			int count = y.length();			
			double z=0;
			for(int i=0;i<count;i++)
			{
				z=Math.pow(Integer.parseInt(y.charAt(i)+""), count)+z;
			}
			if(z==x)
			{
				System.out.println("ArmStrong Number "+x);
			}
		}
	} 
}
