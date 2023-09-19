package allprogramopps;

public class Classandobject {

	
	int eid;
	String ename;
	int dept;
	double sal;
	
	
	void getdata()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(dept);
		System.out.println(sal);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Classandobject co=new Classandobject();
		co.eid=101;
		co.ename="Haidar Atar";
		co.dept=10;
		co.sal=50000.52;
		
		co.getdata();
				
		
	}
}
