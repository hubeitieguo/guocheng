package net.guocheng.cheer.exercise.ch10;
	interface Callnterface		//定义一个接口,包含一个常量PI和两个方法分别计算周长和面积
	{
		final float PI=3.14159f;		//定义一个常量
		float getArea(float r);			//定义一个计算面积的方法
		float getCircumference(float r);		//定义一个计算周长的方法
		
	}
	interface RightTriangle
	{
		float getArea(float a,float b);
		
	}
	public  class Interface_1 implements Callnterface,RightTriangle	//一个类实现两个个接口的所有方法
	{
		public float getArea(float r)		//
		{
			float area=PI*r*r;		//计算面积
			return area;		//返回面积值
		}
		public float getCircumference (float r)
		{
			float circumference=2*PI*r;
			return circumference;
		}
		public float getArea(float a,float b)
		{
			float area=a*b/2;
			return area;
		}
		public static void main(String[]args)
		{
			Interface_1 c=new Interface_1();
			float f=c.getArea(2.5f);
			float e=c.getCircumference(4.5f);
			float g=c.getArea(4.5f,7.8f);
			System.out.println(Float.toString(f)+"\n"+Float.toString(e)+"\n"+Float.toString(g));
		}
	}

