package net.guocheng.cheer.exercise.ch02;//包
//变量范围
public class Variable //创建类
{
	int x=45;		//声明一个实例变量
	static int y=90;		//static声明一个静态变量(类变量)用类名.静态变量方式在其他类访问
	static int times=3;		//声明一个静态变量
	public static void main(String[]args)
	{
		Variable a=new Variable();		//创建一个Variable类对象    构造方法无参数
		int times= 4;		//声明一个局部变量
		System.out.println("times的值为:"+times);		//直接调用局部变量
		System.out.println("times的值为:"+Variable.times);		//直接使用类名.静态变量调用times值
		System.out.println("x的值为:"+a.x);		//调用一个实例变量时需实例化其类
	}
}
