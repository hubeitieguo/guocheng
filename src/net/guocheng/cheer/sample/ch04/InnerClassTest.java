package net.guocheng.cheer.sample.ch04;

public class InnerClassTest 
{
	private int value;
	private void process()
	{
		System.out.println("call");
	}
	class InnerClass
	{
		public InnerClass()
		{
			value=100;
			process();
		}
	}
	public static void main(String[]args)
	{
		InnerClassTest.InnerClass  a=
				new InnerClassTest().new InnerClass();//直接调用内部类
	}
}
