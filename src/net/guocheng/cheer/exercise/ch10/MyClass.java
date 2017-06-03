package net.guocheng.cheer.exercise.ch10;

public class MyClass implements MyInterface
{

	@Override
	public void test01() 
	{
		System.out.println(MyInterface.MAX_GREAD);
		
	}

	@Override
	public int test02(int a, int b) 
	{
		int c=a+b;
		return c;
	}
	 
}

