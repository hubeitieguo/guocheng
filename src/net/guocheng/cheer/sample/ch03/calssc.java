package net.guocheng.cheer.sample.ch03;
import java.util.Scanner;
public class calssc 
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消费金额");
		int a=sc.nextInt();
		boolean c=false;
		do
		{
			c=false;
		System.out.println("是否参加优惠活动； 1.满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("1.满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2.满100元，加3元换购500ml可乐一瓶");
		System.out.println("3.满100元，加10元换购5公斤面粉");
		System.out.println("4.满200元，加10元可换购1个苏泊尔炒菜锅一个");
		System.out.println("5.满200元，加20元可换购欧莱雅护肤水一瓶");
		System.out.println("0.不换购");
		System.out.println("请选择");
		int b=sc.nextInt();		
			switch (b)
		{
		case 1:
			{
				if(a>=50)
					{
						a=a+2;
						System.out.println("消费总金额；"+a);
						System.out.println("你已成功换购；百事可乐饮料一瓶");
					}
				else 
					{
						System.out.println("你不符合此次活动");
						c=true;
					}
				break;
			}
		case 2:
			{
				if(a>=100)
					{
						a=a+3;
						System.out.println("消费总金额；"+a);
						System.out.println("你已成功换购500ml可乐一瓶");
					}
				else 
					{
						System.out.println("你不符合此次活动");
						c=true;
					}
				break;
			}
		case 3:
			{
				if(a>=100)
					{
						a=a+10;
						System.out.println("消费总金额；"+a);
						System.out.println("你已成功换购5公斤面粉");
					}
				else 
					{
						System.out.println("你不符合此次活动");
						c=true;
					}
				break;
			}
		case 4:
			{
				if(a>=200)
					{
						a=a+10;
						System.out.println("消费总金额；"+a);
						System.out.println("你已成功换购1个苏泊尔炒菜锅一个");
					}
				else 
					{
						System.out.println("你不符合此次活动");
						c=true;
					}
				break;
			}
		case 5:
			{
				if(a>=200)
					{
						a=a+20;
						System.out.println("消费总金额；"+a);
						System.out.println("你已成功换购欧莱雅护肤水一瓶");
					}
				else 
					{
						System.out.println("你不符合此次活动");
						c=true;
					}
				break;
			}
		case 0:
			{
				System.out.println("谢谢参加此次活动");
				break;
			}
		}
			if(c)
			{
				
			}
		}
		while(c);
		System.out.println("本次消费总金额；"+a);	
	}
}
