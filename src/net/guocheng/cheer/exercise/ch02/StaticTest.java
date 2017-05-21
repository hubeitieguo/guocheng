package net.guocheng.cheer.exercise.ch02;
//
public class StaticTest 
{
	static class Static1
	{
		int x;
		static int y=15;
		static float f(int a)		//静态方法
		{
			System.out.println(a);
			return a;		//返回值
		}
		float g(int b,int c)		//实例方法
		{
			System.out.println(c+b);
			return c+b;		//返回值
		}
	}
	static class Static2
	{
		public static void main(String[]args)//主方法
		{
			Static1 a1=new Static1();			//实例化类对象
			System.out.println(Static1.y);		//调用静态类中的静态变量
//			System.out.println(Static1.x);		//非法
//			System.out.println(Static1.g(12,15));	//非法
			System.out.println("实例化类对象;调用方法g"+a1.g(10, 23));	//访问类对象中一般方法g
			System.out.println("静态对象;"+Static1.f(12));		//调用静态方法
			System.out.println("实例化类对象调用方法f"+a1.f(10));		//访问类对象中一般方法f
		}
	}
}
