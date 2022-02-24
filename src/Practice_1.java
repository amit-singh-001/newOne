import java.util.Scanner;

public class Practice_1 
{
	public static void main( String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number you want to divide");
		 int n1= sc.nextInt();
		 
		System.out.println("Enter the number from which you want to divide");
		int n2= sc.nextInt();
		
		int div;
		div=n1/n2;
		
		System.out.println("The result is::- "+div);
		
		int rem;
		rem=n1%n2;
		System.out.println("The remainder is::- "+rem);
		
	}

}
