import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		square s= new square(a,b);
		s.multiplication(a,b);
		
		
		addition1 c = new addition1(a,b);
		c.addition(a, b);
		
	}


}
