package net.guocheng.cheer.exercise.ch10;
abstract class A
{
	public final float PI=3.14159f;		//定义一个常量
	public float getArea(float r)
	{
		return 0.1f;//定义一个计算面积的方法
	}
	public float getCircumference(float r)
	{
		return 0.2f;
	}
	public  float getArea(float a,float b) 		//重载
	{
		return 0f;
	}
}
 class B extends A
{
	public float getArea(float r) 
	{
		return 1.2f;
	}
	public float getCircumference(float r) 			//重写
	{
		return 2.2f;
	}
	public float getArea() 
	{
		return 3.2f;
	}
}
 class C extends A
{
	public float getArea(float r) 
	{
		return 4.2f;
	}
	public float getCircumference(float r) 
	{
		return 5.2f;
	}
	public float getArea() 
	{
		return 6.2f;
	}
}
public class Abstract_1 
{
	public static void main(String[]args)
	{
		A b=new B();
		A c=new C();
		B j=new B();
		float k=j.getArea();
		float d=b.getArea(6.3f);
		float e=b.getCircumference(3.5f);
		float f=b.getArea(2.5f, 3.5f);
		float g=c.getArea(6.3f);
		float h=c.getCircumference(3.5f);
		float i=c.getArea(2.5f, 3.5f);
		System.out.println(Float.toString(d)+"\n"+Float.toString(e)+"\n"+Float.toString(f)
		+"\n"+Float.toString(g)+"\n"+Float.toString(h)
		+"\n"+Float.toString(i)+"\n"+Float.toString(k));
	}
}
