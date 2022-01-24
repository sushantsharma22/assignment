/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class PrintArrayRec
{
	public static void main(String[] args)
	{
		int[] array={12,543,567,234,23};
		printArray(array,0);
		System.out.println();
	}

	public static void printArray(int[] a,int i)
	{
		if(i>a.length-1)
		{
			return;
		}
		else
		{
			System.out.print(a[i]+" ");
			printArray(a,i+1);
		}
	}
}
