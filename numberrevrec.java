/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class NumberReverseRec
{
	public static long res;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=sc.nextLong();
		System.out.println(reverse(n));
	}

	public static long reverse(long n)
	{
		long t=n;
		if(n<10)
		{
			return (res*10)+n;
		}
		else
		{
			long r=t%10;
			res=(res*10)+r;
			t=t/10;
			return reverse(t);
		}
	}
}
