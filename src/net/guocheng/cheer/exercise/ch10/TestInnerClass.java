package net.guocheng.cheer.exercise.ch10;
//局部变量实现接口
public class TestInnerClass 
{
	public static void main(String []args)
	{
		TestInnerClass a=new TestInnerClass();
		MyClass b=new MyClass();
		MyImplements c=new MyImplements();
		
		System.out.println(b.test02(20,15));
		b.test01();
		System.out.println(c.test02(14, 15));
		c.test01();
		class MyClass implements MyInterface_2
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
			class MyImplements implements MyInterface_2
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
					int d=MyInterface.MAX_SPEED;
					c=d-c;
					return c;
				}
				 
			}
		}
	}
}
interface MyInterface_2
{
//	接口中只有常量和抽象方法
	String MAX_GREAD="BOSS";
	int MAX_SPEED=120;
	
	public void test01();
	public int test02(int a,int b);	
}