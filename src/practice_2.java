import java.util.Scanner;
/*
public class practice_2 
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter numbers you want to swap n1 and n2");
		
		int n1 = n.nextInt();
		int n2 = n.nextInt();
		
		System.out.println("First number n1 is "+n1+"second number n2 is "+n2);
		
		int temp=0;
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("The swapped number n1 is "+n1+"The swapped number n2 is "+n2);
		
	}

}
*/

/*
public class practice_2
{
	public static void main(String[] args)
	{
		Scanner q = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check wheather it is even or not");
		
		int a = q.nextInt();
		
		if(a%2 == 0)
			System.out.println("The entered number is even");
		else
			System.out.println("The entered number is odd");
		
		System.gc();
	}
}
*/


/*
public class practice_2
{
	public static void main(String[] args)
	{
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the number you want to get ascii character");
		char n = b.next().charAt(0);
		 int c = n;
		 
		 System.out.println("The Ascii value of "+n+" is "+c);
		 
	}
}
*/

public class practice_2
{
	public static void main(String[] args)
	{
		double a=2.3, b = 4, c = 5.6;
		double root1,  root2;
		double deter = b * b -4*a*c;
		
		if(deter > 0)
		{
			root1 = (-b + Math.sqrt(deter) / (2*a));
			root2 = (-b - Math.sqrt(deter) / (2*a));
			
			System.out.format("root1 = %.2f and root2 = %.2f", root1,root2);
			
		}
		else if (deter == 0)
		{
			root1 = root2 = -b/(2*a);
			
			System.out.format("root1=root2= %.2f", root1);
		}
		else
		{
			double real = -b / (2*a);
			double imaginary = Math.sqrt(-deter)/(2*a);
			System.out.format("Root1 = %.2f + %.2fi",real,imaginary);
			System.out.format("\nRoot2 = %.2f - %.2fi",real,imaginary);
		}
	}
}
  