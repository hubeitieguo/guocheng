package net.guocheng.cheer.exercise.ch02;
//数据类型
public class DataType 	//创建类
{
	public static void main(String[]args)	//主方法
	{
//		int x;	//声明int类型变量
//		int x,y;	//声明int类型变量x,y
//		int x=450,y=-462;	//声明int类型变量并赋值
		char word='d',word2='@';	//定义char类型变量
//		char x=97; char x='a';	//定义char类型变量
		int p=23,p2=45;		//定义int类型变量
		System.out.println("d在unicode表中的顺序位置是:"+(int)word);	//强制将转化成int类型
		System.out.println("@在unicode表中的顺序位置是:"+(int)word2);	//强制将转化成int类型
		System.out.println("unicode表中的第23位是:"+(char)p);	//强制将转化成char类型
		System.out.println("unicode表中的第45位是:"+(char)p2);	//强制将转化成char类型
		byte myByte=124;	//声明byte类型变量并赋值
		short myShor=32564;	//声明short类型变量并赋值
		int myInt=45784612;	//声明int类型变量并赋值
		long myLong=46789451;	//声明long类型变量并赋值
		long result=myByte+myShor+myInt+myLong;	//获得各数相加后的结果
		System.out.println("输出结果:"+result);	//将以上变量相加后的结果输出
		char c1='\\';	//将转义字符'\\'赋值给变量c1
		char char1='\u2605';	//将转义字符'\u2605'赋值给变量char1
		System.out.println(c1);	//输出结果\
		System.out.println(char1);	//输出结果★
//		boolean b;
//		boolean b,b2;
		boolean a=true;	//定义布尔型变量a并赋值true
		boolean b=false;	//定义布尔型变量b并赋值flase
		System.out.println(a);	//输出boolean类型变量a
		System.out.println(b);	//输出boolean类型变量b
	}	
/*	byte	8	-128---127
 * short	16	-32768---32767
 * int		32	-21 4748 3648---21 4748 3647
 * long		64	-922 3372 0368 5477 5808---922 3372 0368 5477 5807
 * float	32	1.4E-45---3.402 8235E38
 * double	64	4.9E-324---1.7976 9313 4862 3157E308
 * 
 * 
 * 
*/
}
