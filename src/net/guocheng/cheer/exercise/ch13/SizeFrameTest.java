package net.guocheng.cheer.exercise.ch13;

import java.awt.*;

import javax.swing.*;

public class SizeFrameTest 
{	
	public static void main(String[]args)
	{
		EventQueue.invokeLater(()->
		{
			JFrame frame=new SizedFrame();
			frame.setTitle("sizedframe");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
class SizedFrame extends JFrame
{
	public SizedFrame()
	{
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenHeight=screenSize.height;
		int screenWidth=screenSize.width;
		
		setSize(screenWidth/2,screenHeight/2);
		setLocationByPlatform(true);
		
		Image img=new ImageIcon("icon.gif").getImage();
		setIconImage(img);
		
	}
}