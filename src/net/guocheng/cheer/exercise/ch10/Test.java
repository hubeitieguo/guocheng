 package net.guocheng.cheer.exercise.ch10;

public class Test 
{
	public static void testAnimalVoice(Animal c)
	{
		c.voice();
		if(c instanceof Cat)//强制转换   ,将c转换成cat
		{
			((Cat) c).voice();
		}
	}
	public static void main(String[]args)
	{
		Animal c=new Cat();
		Pig b=new Pig();
		Animal d=new Dog();
//		Animal a=c;
		testAnimalVoice(c);
		testAnimalVoice(b);
		testAnimalVoice(d);
		Dog d2=(Dog)d;	//强制转换      调用Dog类中的seeDoor类
		d2.seeDoor();
		c.voice();
		b.voice();
		d.voice();
	}
}
