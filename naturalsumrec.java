/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class NaturalSumRec
{
	public static int sum=0;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range=sc.nextInt();
		System.out.println("Sum of first "+range+" Natural Numbers = "+sum(range));
	}

	public static int sum(int range)
	{
		if(range<1)
		{
			return sum;
		}
		else
		{
			sum=sum+range;
			return sum(range-1);
		}
	}
}