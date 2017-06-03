package net.guocheng.cheer.exercise.ch10;
public class InterfaceAnimalTest 
{
	public static void main(String[]args)
	{
//		monkey继承父类NewAnimal和实现接口InterfaceAnimal
//		IneterfaceAnimal g=new Monkey();//只能调用InerfaceAnimal中的方法voide()
		IneterfaceAnimal h=new Duck();
//		NewAnimal c=new Monkey();//只能调用NewAnimal中的方法method()
		Monkey a=new Monkey();//可以调用monkey所继承的父类和实现接口
		int b=a.method(38, 29, 29);
		System.out.println("add together"+b);
		a.voice();
		h.voice();
	}
}	
