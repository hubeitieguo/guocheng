package net.guocheng.cheer.sample.ch03;

public class calssf
{
	public static void main(String [] args)
	{
		Dggg d=new Dggg();
		d.play("1","2",0,0,"3");
		System.out.println("**********");
		Prenguinss p=new Prenguinss();
		p.name="圆圆";
		p.sex="母";
		p.health=4;
		p.love=88;
		p.breed="企鹅";
		p.play();
	}

}
		class Pettt
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
		class Dggg extends Pettt//继承主类
		{
	
		 public void play(String name,String sex,int health,int love,String breed)
			{//普通方法重载
			    this.name=name;//赋值给所继承的属性
				this.sex=sex;
				this.health=health;
				this.love=love;
				this.breed=breed;
			 super.play();
			 System.out.println("我是中华田园犬");
			}
		}
		class Prenguinss extends Pettt
		{

		}