package net.guocheng.cheer.exercise.ch12;

//import java.io.PrintStream;

public class Take 
{
	public static void main(String[]args)
	{
		try
		{
			String str="lili";
			System.out.println(str+"年龄是;");
			int age =Integer.parseInt("20L");
			System.out.println(age);
		}
		catch(Exception e)
		{
			e.toString();
			System.out.println("p");
		}
		System.out.println("program over");
	}
}
