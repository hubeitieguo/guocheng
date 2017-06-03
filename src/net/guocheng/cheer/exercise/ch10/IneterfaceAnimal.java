package net.guocheng.cheer.exercise.ch10;

public interface IneterfaceAnimal 
{
	public void voice();
}
class NewAnimal
{
	public int method(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
}

class Monkey extends NewAnimal implements IneterfaceAnimal
{

	@Override
	public void voice() 
	{
		System.out.println("Monkey");
	}
	
}

class Duck extends NewAnimal implements IneterfaceAnimal
{

	@Override
	public void voice() 
	{
		System.out.println("Duck");
	}
	
}