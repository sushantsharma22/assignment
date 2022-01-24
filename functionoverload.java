/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class FuncOverload
{
	public static void main(String[] args)
	{
		System.out.println(multiply(2,3));
		System.out.println(multiply(2,3,4));
		System.out.println(multiply(2,3,4,5));
		System.out.println(multiply(2,3,4,5,6));
	}

	public static int multiply(int n1, int n2)
	{
		return n1*n2;
	}

	public static int multiply(int n1, int n2, int n3)
	{
		return n1*n2*n3;
	}

	public static int multiply(int n1, int n2, int n3, int n4)
	{
		return n1*n2*n3*n4;	
	}

	public static int multiply(int n1, int n2, int n3, int n4, int n5)
	{
		return n1*n2*n3*n4*n5;
	}
}