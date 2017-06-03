package net.guocheng.cheer.exercise.ch11;

public class Outer 
{
	private static int i=1;
	private int j=10;
	private int k=20; 
	
	public static void outer_f1(){
	}
	
	public void outer_f2(){
	}
	
	class Inner
	{
		int j=100;
		int inner_i=1;
		
		void inner_f1()
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(this.j);
			System.out.println(Outer.this.j);
			System.out.println(k);
			outer_f1();
			outer_f2();
		}
	}
	
	public void outer_f3()
	{
		Inner inner=new Inner();
		inner.inner_f1();
	}
	
	public static void main(String[]args)
	{
		Outer out=new Outer();
		Outer.Inner outin=out.new Inner();//实例化内部类
		outin.inner_f1();
	}
}
