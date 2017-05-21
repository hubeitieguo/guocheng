package net.guocheng.cheer.exercise.ch13;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Swing_1 extends JFrame 
{
	public void CreateJFrame(String title)
	{
		JFrame jf=new JFrame(title);
		Container container=jf.getContentPane();
		JLabel jl=new JLabel("这是个jframe窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Swing_1().CreateJFrame("创建一个jframe窗体");
	}
}
