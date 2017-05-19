package Number;

public class Book 
{
	private String name;	//定义一个string类型的成员变量
	public String getName()	//定义一个getname()方法
	{
		int id=0;	//定义一个局部变量
		setName("java");	//调用类中其他方法
		return id+this.name;	//设置方法返回值    this调用本类的属性
		/*this关键字主要作用;1.this调用本类的属性,也就是类中的成员变量;
		 *              2.this调用本类的其他方法;
		 *              3.this调用本类中的其他构造方法,调用时要放在构造方法的首行.
		 */
	}
	private void setName(String name)	//定义一个setname()方法
	{
		this.name=name;		//将参数值赋予类中成员变量
	}
	public Book getBook()	//调用一个book类的方法非静态方法
	{
		return this;	//返回book类的引用 连续操作类的方法,返回类实例
	}
	public static void main(String[]args)
	{
		Book a=new Book();	//Book()构造器  new Book()构造一个新对象并初始化     Book a是对象变量
		Book b=a.getBook();	//a=b
		System.out.println(a+"\n"+b);
	}
	
}
