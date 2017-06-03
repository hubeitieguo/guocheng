package net.guocheng.cheer.exercise.ch14;
//外部类实现接口
import net.guocheng.cheer.exercise.ch10.MyClass;
import net.guocheng.cheer.exercise.ch10.MyImplements;
import net.guocheng.cheer.exercise.ch10.MyInterface;

public class Test_01 
{
		public static void main(String[]args)
	{
		MyInterface a=new MyImplements();
		MyInterface b=new MyClass();
		a.test01();
		System.out.println(a.test02(5, 3));
		b.test01();
		System.out.println(b.test02(24, 15));
	}
}

