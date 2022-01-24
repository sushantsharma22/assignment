/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Car
{
	abstract void speed();
}
class AbstractClass extends Car
{
	void speed()
	{
		System.out.println("Speed of the car is 100 kmph.");
	}

	public static void main(String[] args)
	{
		AbstractClass abs=new AbstractClass();
		abs.speed();
	}
}