package net.guocheng.cheer.sample.ch03;

public class calssb 
{
	public  void play(String str)
	{
		String petName=str;
		if(str=="cat")
		{
			System.out.println(str+"抓老鼠");
		}
		else if (str=="dog"){
			System.out.println(str+"玩飞盘");
		}
	}
	public static void main(String[] args)
	{
		calssb pet=new calssb();
		pet.play("dog");
	}
}
//主方法调用普通方法play需要将类实例化赋值给你一个对象