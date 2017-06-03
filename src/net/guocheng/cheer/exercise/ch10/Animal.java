 package net.guocheng.cheer.exercise.ch10;

public class Animal
{
	public void voice()
	{
		System.out.println("普通动物叫声");
	}
}
class Cat extends Animal
{
	public void voice()
	{
		System.out.println("喵喵");
	}
}
class Dog extends Animal
{
	public void voice()
	{
		System.out.println("汪汪");
	}
	public void seeDoor()
	{
		System.out.println("看们");
	}
}
class Pig extends Animal
{
	public void voice()
	{
		System.out.println("哼哼");
	}
}