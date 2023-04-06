package day04.test01;

public class Program01 {

	//Access Specifiers of Methods 
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}	
	private static void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}	
	protected static void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}	
	static void sqrtMethod(int a)
	{
		System.out.println(a*a);
	}
	 	
	public void addMethodNonStatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private void subMethodNonStatic(int a,int b)
	{
		System.out.println(a-b);
	}	
	protected void mulMethodNonStatic(int a,int b)
	{
		System.out.println(a*b);
	}	
	void sqrtMethodNonStatic(int a)
	{
		System.out.println(a*a);
	}	
	public static void main(String[] args) {
		addMethod(30, 20);
		subMethod(50, 25);
		mulMethod(4, 6);
		sqrtMethod(7);
		Program01 x= new Program01();
		x.addMethodNonStatic(30, 10);
		x.subMethodNonStatic(50, 15);
		x.mulMethodNonStatic(5, 6);
		x.sqrtMethodNonStatic(4);
	}

}