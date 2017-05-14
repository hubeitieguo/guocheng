public class classg 
{
	public static void main(String[] args)
	{
		dog r=new dog("1","2",1);
		r.play();
	}
}
	abstract class pet
	{
		String name;
		String sex;
		int age;
		
		public abstract void play();
	}
	class dog extends pet
	{
		public dog(String name,String sex,int age)
		{
			this.name=name;
			this.sex=sex;
			this.age=age;

		}
		public void play()
		{
			System.out.println("名字；"+name+"\n"+"性别"+sex+"\n"+"年龄"+age);
			System.out.println("此处风景如此好");
		}
	}

