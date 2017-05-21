package net.guocheng.cheer.exercise.ch13;
import javax.swing.*;
import java.awt.*;
public class FlowLayout_1 extends JFrame
{
	public FlowLayout_1()
	{
		setTitle("本窗体使用流布局管理器");
		Container c=getContentPane();
		setLayout(new FlowLayout(2,10,10));
		for (int i=0;i<10;i++)
		{
			c.add(new JButton("button"+i));
		}
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[]args)
	{
		new FlowLayout_1();
	}
}
