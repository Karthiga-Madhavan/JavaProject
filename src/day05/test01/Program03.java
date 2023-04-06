package day05.test01;

public class Program03 extends Program02 {

	public static void main(String[] args) {
		// Method Overriding, with same datatype and parameter of parent class but the method must be non-static and public
		Program03 x=new Program03();
		x.add(10,20);
		
		Program02 x1=new Program02();
		x1.add(10,20);
	}
	
	@Override
	public void add(int a, int b) {
		
		System.out.println((a*a)+(b*b));
		
	}
}
