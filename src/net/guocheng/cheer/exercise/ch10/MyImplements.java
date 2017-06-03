package net.guocheng.cheer.exercise.ch10;
public class MyImplements implements MyInterface
{

	@Override
	public void test01() 
	{
		System.out.println(MyInterface.MAX_GREAD);
		System.out.println("interface implements");
		
	}

	@Override
	public int test02(int a, int b) 
	{
		int c=a+b;
		c=c-b-b;
		return c;
	}
	 
}
