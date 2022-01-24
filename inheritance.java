/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class TestInheritance
{
	public int principle = 10000;
	public int rate = 10;
	public int time = 2;
}

class Inheritance extends TestInheritance
{
	public static void main(String[] args)
	{
		TestInheritance ti=new TestInheritance();
		System.out.println("Simple Interest = "+((ti.principle*ti.rate*ti.time)/100.0));	
	}
}