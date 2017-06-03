package net.guocheng.cheer.exercise.ch13;

import java.awt.*;

import javax.swing.*;

public class Swing_3 
{
	public static void main(String[]args)
	{
//		static void invokeLater(Runnable runnable) 
//		导致 runnable在 dispatch thread的 dispatch thread中调用其 run方法。 
//		Causes runnable to have its run method called in the 
//		原因		追溯		到	具有	它的	运行	方法		认为	  在	 
//		dispatch thread of the system EventQueue.
//		调度		  线索/将--穿过		系统    等待事件
		EventQueue.invokeLater(()->//啥意思??????????
		{
			JFrame fame=new JFrame();
//			setTitle(String title) 将此框架的标题设置为指定的字符串。 
			fame.setTitle("SizeFrame");
//			getDefaultCloseOperation() 返回当用户在此框架上启动“关闭”时发生的操作。
//			static int EXIT_ON_CLOSE  退出应用程序默认窗口关闭操作。  
			fame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			setVisible(boolean b) 窗口 b的值显示或隐藏 。 
			fame.setVisible(true);
			//Shows or hides this Window depending on the value of parameter b.
			//窗口的显示和隐藏取决于b的值
			fame.setUndecorated(true);
			fame.setOpacity((float) 0.0);
		});
	}
}
class SizedFrame extends JFrame
{
	public SizedFrame()
	{
//		getDefaultToolkit()      获取默认工具包。      static Toolkit
		Toolkit kit=Toolkit.getDefaultToolkit();
//		getScreenSize() 获取屏幕的大小。  abstract Dimension
		Dimension screenSize=kit.getScreenSize();
//		Dimension的属性heigh     高度尺寸 可以使用负值
		int screenHeight=screenSize.height;
//		Dimension的属性width     宽度尺寸 可以使用负值
		int screenWidth=screenSize.width;
		
//		调整此组件的大小，使其宽度为 width ，高度为 height 。
		setSize(screenWidth/2,screenHeight/2);
//		设置此窗口是否应显示在本机窗口系统的默认位置或当前位置（由 getLocation返回）下一次窗口可见时。
		setLocationByPlatform(true);


//		getImage()   返回此图标的 Image  Image 。  
//		ImageIcon(String filename) 在指定的文件创建一个ImageIcon。  
		Image img=new ImageIcon("icon.gif").getImage();
//		setIconImage(Image image) 将要显示的图像设置为此窗口的图标。 
		setIconImage(img);
	}
}