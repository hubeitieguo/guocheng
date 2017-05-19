package Number;

class Parent   //创建父类
{
	Parent()
	{
		System.out.println("调用父类的Parent()构造方法");
	}
}
class SubParent extends Parent   //subparent继承父类parent    extends子类继承父类
{
	SubParent()
	{
		System.out.println("调用子类的SubParent()构造方法");
	}
}
public class Subroutine extends SubParent//subroutine继承subparent类    public不同包也可以用
{
	Subroutine()
	{
		System.out.println("调用子类的Subroutine()构造方法");
	}
	public static void main(String[]args)  //static静态方法可以用static调用或者事例化
	{
		Subroutine s=new Subroutine();//实例化new子类对象
	}
}
