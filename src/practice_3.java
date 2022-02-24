import java.util.Scanner;

public class practice_3 
{
	public static String[] findArrayOddorEven(int[] num) 
	{
		String[] result = new String[4];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				result[i] = "Even";
			}
			else
			{
				result [i] = "odd";
			}
		}
		return result;
	}
	public static String findOdd(int num) 
	{
		String result;
		
		if(num%2==0)
		{
			result = "Even";
		}
		else
		{
			result = "odd";
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int [] num = new int[4];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of arrays");
		for(int i = 0;i<num.length;i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println(num.length);
		System.out.println("Array element");
		
		for(int i = 0;i<num.length;i++)
		{
			String result = findOdd(num[i]);
			System.out.println(num[i]+" is "+result);
		}
		System.out.println("Array element");
		
		for(int i =0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
		}
		
		System.out.println(" ");
		
		String[] result = findArrayOddorEven(num);
		for(int i = 0;i<num.length;i++)
		{
			System.out.println(result[i]+" ");
		}
		System.gc();
	}

}
