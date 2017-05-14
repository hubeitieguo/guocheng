package net.guocheng.cheer.sample.ch03;

public class calsse 
{
	public static void main(String [] args)
	{
		Dgg d=new Dgg("1","2",0,0,"3");
		d.play();
		System.out.println("**********");
		Prenguins p=new Prenguins();
		p.name="圆圆";
		p.sex="母";
		p.health=4;
		p.love=88;
		p.breed="企鹅";
		p.play();
	}

}
		class Pett
		{
			String name;
			String sex;
			int health;
			int love;
			String breed;	
			public void play()
			{
				System.out.println("狗狗的名字："+name+"\n"+
                        "狗狗的性别；"+sex+"\n"+
		                   "狗狗的年龄："+health+"\n"+
		                   "狗狗的亲密度："+love+"\n"+
		                     "狗狗的品种："+breed);
			}
		}
		class Dgg extends Pett//继承主类
		{
			public Dgg(String name,String sex,int health,int love,String breed)
			{//构造方法重载
				this.name=name;//赋值给所继承的属性
				this.sex=sex;
				this.health=health;
				this.love=love;
				this.breed=breed;
			}
		 public void play()
			{//普通方法重写,重写在子类
			 super.play();
			 System.out.println("是中华田园");
			}
		}
		class Prenguins extends Pett
		{

		}

