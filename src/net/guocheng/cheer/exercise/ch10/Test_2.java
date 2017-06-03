package net.guocheng.cheer.exercise.ch10;
//成员变量实现接口
public class Test_2 
{
	public static void main(String[]args)
	{
		MyImplements a=new MyImplements();
		MyClass b=new MyClass();
		a.test01();
		System.out.println(a.test02(5, 3));
		b.test01();
		System.out.println(b.test02(24, 15));
	}
}

interface MyInterface_1
{
//	接口中只有常量和抽象方法
	String MAX_GREAD="BOSS";
	int MAX_SPEED=120;
	
	public void test01();
	public int test02(int a,int b);
	
}
class MyClass_1
{
	class MyClass implements MyInterface_1
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
}
class MyImplements_1
{
	class MyImplements implements MyInterface_1
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
}