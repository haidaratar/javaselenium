package Batch18;

class Bank
{
	double rateofinterset()
	{
		return 0;
		
	}
}

class SBI extends Bank

{
	double rateofinterset()
	{
		return 10.50;
	}
}

class ICICI extends Bank
{
	double rateofinterset()
	{
		return 9.50;
		
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		
		SBI sbi =new SBI();
		System.out.println(sbi.rateofinterset());
		
		
		
	}

}
