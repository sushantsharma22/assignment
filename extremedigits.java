/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class ExtremeDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=sc.nextLong();
		String s=String.valueOf(n);
		int l=s.length();
		System.out.println("First Digit = "+Character.getNumericValue(s.charAt(0)));
		System.out.println("Last Digit = "+Character.getNumericValue(s.charAt(l-1)));
	}
}