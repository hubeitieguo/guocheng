package net.guocheng.cheer.sample.ch01;
import java.util.Scanner;
public class HelloJava {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入");
		int age=sc.nextInt();
		if(age>=60){
			System.out.println("老年人");
		}
		else if(40<=age&&age<60){
			System.out.println("中年人");
		}
		else if(20<=age&&age<40){
			System.out.println("青年人");
		}
		/*for (a=0,a<=100,a=a++){
			b=a*2;
			
			System.out.println(b);
		}
		//System.out.println(s1);
		//System.out.println(s2);*/
	}
}
