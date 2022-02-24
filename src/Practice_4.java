import java.util.Scanner;
public class Practice_4 
{
	public static void main(String [] args)
	{
		
		Scanner sc =new Scanner(System.in);
		int amount;
		int time;
		float rate;
		
		System.out.println("Enter the amount of money you want to calculate ");
		amount = sc.nextInt();
		System.out.println("Enter the time ");
		time = sc.nextInt();
		System.out.println("Enter the rate");
		rate =sc.nextFloat();
		
		double ci= amount*(Math.pow(1+rate/100, time));
		
		System.out.println("compound interest the amount is "+ci);
		
		
	}

}
