package net.guocheng.cheer.exercise.ch08;

public class Boolean_1 
{
	public static  void main(String[]args)
	{
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("true");
		Boolean b3=new Boolean("flase");
		Boolean b4=new Boolean("True");
		System.out.println(b1.booleanValue()+"\n"+b2.booleanValue()
		+"\n"+b3.booleanValue()+"\n"+b4.booleanValue());
		
	}
}
