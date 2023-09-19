package allprogramopps;


class Parent
{
	int c=30;
	void m3()
	{
		System.out.println(c);
	}
}
interface A
{	
	int x=10;
	void m1();
	
}

interface B
{
	int y=20;
	void m2();
	
}



public class FinalExample extends Parent implements A, B {
	
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		FinalExample fe=new FinalExample();
		fe.m1();
		fe.m2();
		fe.m3();
		
	}
}

	
	