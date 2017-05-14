package net.guocheng.cheer.sample.ch05;

public class ExeptionBaseTest3 
{
	public static void main (String[]args)
	{
		try
		{
			String str="lili";
			System.out.println(str+"age:");
			int age=Integer.parseInt("20l");
			System.out.println(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("program over");
	}
}
