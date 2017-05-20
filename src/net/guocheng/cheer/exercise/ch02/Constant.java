package net.guocheng.cheer.exercise.ch02;
//常量也叫final变量,final修饰符不能修改其值
public class Constant 		//新建类constant
{
	final double PI=3.1415926D;		//声明double型常量PI并赋值
	final boolean BOOL=true;		//声明boolean型常量并赋值
	static int age=23;		//静态变量int型变量并赋值
	static double pi=3.14;		//静态变量double型变量pi并赋值
	public static void main(String[]args)		//program主方法
	{
		final int number;	//声明int型变量number
		number =1235;		//对常量赋值
		age=22;		//对变量赋值
//		number=1236;		//错误代码,因为number为常量,只能进行一次赋值
		System.out.println("常量pi的值为:"+pi);			//赋值
		System.out.println("赋值后number的值为;"+number);
		System.out.println("int型变量age的值为;"+age);
	}
}
