package Batch18;

class Parent
{
	int a=50;
	void get()
	{
		System.out.println(a);
		System.out.println("This is parent class ");
		
	}
}

class Son extends Parent
{
	int b=20;
	void show()
	{
		System.out.println(b);
		System.out.println("This is                                                                                     ");
	}
}

class Dauther extends Parent
{
	int c=10;
	void PrintValues()
	{
		System.out.println("This is child class ");
	}
}


public class InheritancesExample {
	
	public static void main(String[] args) {
	
		Son son=new Son();
		son.a=10;
		son.b=20;
		son.get();
		son.show();
		
		
		
		}

}
