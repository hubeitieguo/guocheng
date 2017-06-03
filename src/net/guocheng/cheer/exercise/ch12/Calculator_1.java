package net.guocheng.cheer.exercise.ch12;

public class Calculator_1 
{
	public int devide(int num1,int num2)
	{
		if(num2==0)
		{
			throw new
			IllegalArgumentException("除数不能为零");
		}
		return num1/num2;
	}
	public static void main(String[]args)
	{
		Calculator_1 a=new 	Calculator_1();
		float b=a.devide(5, 0);
		System.out.println(b);
	}
}
