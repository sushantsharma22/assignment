/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
//Aniket Singh  -  Question 2
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,len;
		System.out.print("Enter length of Fibonacci Series: ");
		len=sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=0;i<len-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}
}