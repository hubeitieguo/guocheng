package net.guocheng.cheer.exercise.ch02;
//你好,java
public class HelloJava 
{
	static String s1="hell";	//静态变量s1,全局变量
	public static void main (String[]args)	//static可以修饰类的成员方法,类的成员变量,也可以优化程序
	{
		String s2="java";	//局部变量s2
		System.out.println(s1);//输出
		System.out.println(s2);
	}
}
