package allprogramopps;

public class TakingParameter {

	int a;
	int b;
	
	/*void add() //no parameter no return values
	{
		System.out.println(a+b);
	}*/
	
	/*
	int add()
	{
		return(a+b);
		
	}*/
	
	void add(int x, int y)
	{
		a=x;
		b=y;
		
	}
	void get()
	{
		System.out.println(a+b);	
	}
	
	
	

	public static void main(String[] args) {
		
		/*TakingParameter tc= new TakingParameter(); //no parameter no return values
		tc.a=10;
		tc.b=20;
		tc.add();*/
		
		/*TakingParameter tc =new TakingParameter();  //no parameter but return values
		tc.a=20;
		tc.b=50;
		System.out.println(tc.add());*/
		
		
		TakingParameter tc=new TakingParameter();
		tc.add(10,20);
		tc.get();
		
		
	
	
	
		
		
		
		
		
		
		
				
		
		
		
	}
}
