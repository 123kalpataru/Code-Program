/*Write a Java program to calculate compound interest for 3 years? 
Formula = amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));*/
import java.util.Scanner;
class CompoundIntrest
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal Amount:");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate:");
		double rate = sc.nextInt();
		double totalIntrest = principal*(1+rate/100)*(1+rate/100)*(1+rate/100);
		System.out.println("Total Amount is:"+totalIntrest);
	}
}