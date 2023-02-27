package day13;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[5]; //0-4
		x[0]=100;
		x[4]=500;
		x[2]=300;
		
		System.out.println("length of x is "+x.length);		
		
		System.out.println(x[0]);
		System.out.println(x[2]);
		System.out.println(x[4]);
		
		System.out.println("x values : ");
		System.out.println();
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println();
		System.out.println("For - Each Loop");
		for (int a:x)
		{
			System.out.println(a);
		}
		
		String[] str_name= {"abc","bcd","cde","def"};
		System.out.println();
		System.out.println("length of string name is "+str_name.length);
		System.out.println(str_name[0]);
		str_name[0]="ABC";
		System.out.println(str_name[0]);
	}

}
