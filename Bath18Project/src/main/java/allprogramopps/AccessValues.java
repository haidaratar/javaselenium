package allprogramopps;

public class AccessValues {

	int sid;
	String sname;
	char grade;
	
	
	void PrintValues()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
		
	}
	
	/*void show(int id, String name,char g) // using methods can assign values
	{
		sid=id;
		sname=name;
		grade=g;
		
		
	}*/
	
	AccessValues(int id, String name, char g) //using constructor can access values by method
	{
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	
	
	public static void main(String[] args) {
		
		/*AccessValues ac=new AccessValues();
		ac.sid=101;
		ac.sname="Haidar Atar";
		ac.grade='B';
		
		ac.PrintValues();*/
		
		AccessValues ac=new AccessValues(101, "Atar Haidar",'B'); //using constructor
		ac.PrintValues();
		
		
		
		
		
	}
}
