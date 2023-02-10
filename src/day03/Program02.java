package day03;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program02 obj1= new Program02();
		addMethod(20,30);
		obj1.subMethod(10, 5);
		obj1.mulMethod(10, 10);
		
		addMethod(50,20);
		obj1.subMethod(110, 15);
		obj1.mulMethod(10, 6);
	
	}
	
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
}
