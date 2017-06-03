package net.guocheng.cheer.exercise.ch13;
import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame
{
	public void launchFrame()
	{
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);	
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		Font f=new Font("宋体",Font.BOLD,100);
		g.setFont(f);
		g.drawString("wos", 200, 200);
		g.fillRect(100, 100, 20, 20);
		g.setColor(Color.red);
		g.fillOval(300, 300, 20, 20);
		
	}

	public static void main(String[]args)
	{
		GameFrame gf=new GameFrame();
		gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gf.launchFrame();
	}
}
