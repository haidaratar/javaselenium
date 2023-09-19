package allprogramopps;



class Dauther
{
	String d="cycle";
	void m3()
	{
		System.out.println("Dauther has cycle...");
		
	}
}
interface Father
{
	String s="BMW";
	void m1();
	
}

interface Mother
{
	String s1="Audi";
	void m2();
	
}


public class MultipleInheritances extends Dauther implements Father, Mother {
	
	public void m1()
	{
		System.out.println("Father has bmw..... ");
	}
	public void m2()
	{
		System.out.println("Mother has audi.....");
	}
	

	public static void main(String[] args) {
		
		MultipleInheritances mh=new MultipleInheritances();
		mh.m1();
		mh.m2();
		mh.m3();
		
	}
}
