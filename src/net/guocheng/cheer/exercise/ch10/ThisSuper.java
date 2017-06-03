package net.guocheng.cheer.exercise.ch10;

public class ThisSuper 
{
	int a=25;
	public static void testThisSuper(Plane a)//此方法调用多态方式显示类方法
	{
//		a.planeName();
		if(a instanceof Plane)//进行判断a与plane类相等吗
		{
			((Plane) a).planeName();//强制转换
		}
	}
	public static void main(String[]args)
	{
		int a=2;
		Plane a2=new FighterPlane();
		Plane a4=new Helicopter();
		Plane a5=new Plane();
	
		testThisSuper(a2);
		testThisSuper(a4);
		testThisSuper(a5);
		class Test
		{
			int a=3;			
			public void test(int a)
			{
				System.out.println(a);
				System.out.println(this.a);		
			}
		}
		System.out.println(a);
		Test a1=new Test();
		a1.test(4);
		System.out.println(a1.a);



		System.out.println(a2.a);
		FighterPlane a3=new FighterPlane();
		System.out.println(a3.a);

	}
}
class Plane
{
	String PLANE_NAME="飞机";
	int a=1;
	public int weight(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public void planeName()
	{
		System.out.println("Plane");
	}
}
class FighterPlane extends Plane
{
	int a=super.a+10;
	public int weight(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public void planeName()
	{
		System.out.println("FighterPlane");
	}
}
class Helicopter extends Plane
{
	public int weight(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public void planeName()
	{
		System.out.println("Helicopter");
	}
}