package net.guocheng.cheer.sample.ch02;

public class dowhlie {
	public static void main(String[]args){
		int sum=0;
		char i='a';
		do{
			sum=sum+i;
			i++;
			System.out.println(sum);
		}while(i<='c');
		System.out.println("循环结束");
	}
}
