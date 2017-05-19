package Number;

public class Test
{
	
	public Test()//public 不同包之间可以使用
	{
		System.out.println("父类构造方法");//SomeSentence（很多句子） 构造方法
	}
	protected void doSomething()  //protected 不同包的子类可以使用
	{
		System.out.println("父类成员方法");//SomeSentence（很多句子） 成员方法
	}
	protected Test dolt()  //protected 不同包的子类可以使用
	{
		return new Test(); //方法return返回值类型为new实例化Test类型new Test()实例化
	}
static class Test2 extends Test //extends 子类继承父类
{
	public Test2() //构造方法
	{
		super(); //super 子类地动用父类   调用父类构造方法
		super.doSomething();  //super  子类调用父类   调用父类成员方法
	}
	public void doSomethingnew()  //新增方法  public 不同包之间可以使用
	{
		System.out.println("子类新增成员方法");
	}
	public void doSomething()  //重写父类方法  public  不同包之间可以使用
	{
		System.out.println("重写父类成员方法 ");//SomeSentence
	}
	protected Test2 dolt()  //重写父类方法,方法返回值类型为Test2类型   protected 不同包子类可以使用
	{
		return new Test2();   //return 返回 new实例化 Test2类型对象
	}
	public static void main(String[]args)
	{
		Test2 s=new Test2();
		s.doSomething();
		s.doSomethingnew();
		s.dolt();
		Test d=new Test();
		d.dolt();
	}
}
}
