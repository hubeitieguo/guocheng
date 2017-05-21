package net.guocheng.cheer.exercise.ch02;
//多态
class A 
{  
    public String show(D obj)		//
    {  
           return ("A and D");  
    }   
    public String show(A obj)
    { 
           return ("A and A");  
    }   
}   
class B extends A
{  
    public String show(B obj)
    {  
           return ("B and B");  
    }  
    public String show(A obj)
    {  
           return ("B and A");  
    }   
}  
class C extends B{}   
class D extends B{}  
public class Polymorphic 
{  
	public static void main(String[]args)
	{
		A a1 = new A();  	//实例化一个A类型对象 a1
		A a2 = new B();  	//实例化一个指向B类的A类型对象a2-----多态
		B b = new B();  	//实例化一个B类型对象b
		C c = new C();   	//实例化一个C类型对象c
		D d = new D();   	//实例化一个D类型对象d
		System.out.println(a1.show(b));
		System.out.println(a1.show(c));
		System.out.println(a1.show(d));
		System.out.println(a2.show(b));
		System.out.println(a2.show(c));
		System.out.println(a2.show(d));
		System.out.println(b.show(b));
		System.out.println(b.show(c));
		System.out.println(b.show(d)); 
	}
}
