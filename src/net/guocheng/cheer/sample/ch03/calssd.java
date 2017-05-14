package net.guocheng.cheer.sample.ch03;

public class calssd 
{
	public static void main(String [] args)
	{
		Dog d=new Dog();
		d.play();
		System.out.println("**********");
		Prenguin p=new Prenguin();
		p.play();
	}

}
		class Pet
		{
			String Name;
			String sex;
			int health;
			int love;
			String breed;				
		}
		class Dog
		{
		 public void play()
			{
				Pet p=new Pet();
				p.Name="旺财";
				p.sex="公";
				p.health=6;
				p.love=80;
				p.breed="金毛";
				System.out.println("狗狗的名字："+p.Name+
	                               "狗狗的性别；"+p.sex+
				                   "狗狗的年龄："+p.health+
				                   "狗狗的亲密度："+p.love+
				                     "狗狗的品种："+p.breed);
			}
		}
		class Prenguin
		{
			public void play()
			{
				Pet q=new Pet();
				q.Name="圆圆";
				q.sex="母";
				q.health=4;
				q.love=88;
				q.breed="企鹅";
				System.out.println("企鹅的名字："+q.Name);
				System.out.println("企鹅的性别；"+q.sex);
				System.out.println("企鹅的年龄："+q.health);
				System.out.println("企鹅的亲密度："+q.love);
				System.out.println("企鹅的品种："+q.breed);
			}
		}

