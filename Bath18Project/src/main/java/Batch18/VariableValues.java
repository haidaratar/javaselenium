package Batch18;

public class VariableValues {
	
	
	int a=10;
	int b=20;
	
	void show(int x, int y)
	{
		a=x;
		b=y;
	}
	void get()
	{
		System.out.println(a+b);
	}
	
	
	

	public static void main(String[] args) {
		
		VariableValues va=new VariableValues();
		va.show(100, 200);
		va.get();
		
		
		
		
		
		
	}
}
