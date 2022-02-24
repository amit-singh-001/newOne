import java.util.Scanner;

public class square implements soln
{
	
	Scanner sc= new Scanner(System.in);
	
	
	int a;
	int b;
	square(int a,int b)
	{
		this.a= a;
		this.b=b;
	}
	
	public void multiplication(int a ,int b)
	{
		System.out.println(a*b);
	}

	

	@Override
	public void addition(int a ,int b) 
	{
		
		
	}

	
}

class addition1 extends square implements soln
{

	addition1(int a, int b) 
	{
		super(a, b);
		
	}
	
	@Override
	public void addition(int a ,int b) 
	{
		System.out.println(a+b);
		
	}

	
}
