package net.guocheng.cheer.exercise.ch13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.*;

class MyJDialog extends JDialog
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJDialog(MyFrame frame)
	{
		super (frame,"第一个JDialog窗体",true);
		Container container=getContentPane();
		container.add(new JLabel("这是个对话框"));
		setBounds(120,120,100,100);
	}
}
public class MyFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String args[])
	{
		new MyFrame();
	}
	public MyFrame()
	{
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("弹出对话框");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						new MyJDialog(MyFrame.this).setVisible(true);
					}
				});
		container.add(bl);
	}
}