package net.guocheng.cheer.sample.ch04;

public class FinalTest 
{
	private static String value="abc";
//	private static final String value="abc";
	public static void main(String [] args)
	{
		FinalDemo finalDemo=new FinalDemo();
		finalDemo.setDemoValue("abcd");
		
		System.out.println(value);
		value="bcd";//有final就不能修改
		System.out.println(value);
		
		System.out.println(finalDemo.getDemoValue());
		System.out.println(finalDemo);
		
//		FinalDemoChild child=new FinalDemoChild;
		
	}
}
class FinalDemo
{
	private String demoValue;
	public void setDemoValue(String demcValue)
	{
		this.demoValue=demoValue;
	}
	public String getDemoValue()
	{
		return demoValue;
	}
	public String toString ()
	{
		return getClass().getName()+"demovValue;"+getDemoValue()+"j";
	}
}
