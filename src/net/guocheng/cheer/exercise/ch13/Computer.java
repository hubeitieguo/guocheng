package net.guocheng.cheer.exercise.ch13;

import java.awt.*;

import java.net.URL;

import javax.swing.*;

public class Computer extends JFrame
{
	public void launchFrame()
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
//		setSize(screenWidth/2,screenHeight/2);
		int Height=600;
		int Width=400;
		setSize(Width,Height);//设置窗体大小
		
		int x=(screenWidth-Height)/2;
		int y=(screenHeight-Width)/2;
		setLocation(x,y);//设置显示的位置
		
		Computer computer=new Computer();
		computer.setBackground(Color.BLACK);
		computer.setUndecorated(true);//不让setOpcaity()方法抛出异常
		computer.setOpacity(0.6f);//设置透明度
		setVisible(true);	
	}
	public void button()
	{
		JPanel panel=new JPanel();
//        ImageIcon ii=new ImageIcon(getClass().getResource("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/center.jpg"));
//        JLabel uppicture=new JLabel(ii); //往面板里加入JLabel
		JTextField textField=new JTextField("default input",200);
		textField.setColumns(3);
//		add(textField,BorderLayout.SOUTH);
		
//		panel.setLayout(new GridLayout(8,5,50,50));
		
		
		JButton addButton=new JButton();
		ImageIcon iconAdd = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/加号.png");  
		addButton.setIcon(iconAdd); 
		Dimension preferredSize=new Dimension(50,50);
		addButton.setPreferredSize(preferredSize);
		
		JButton subtractButton=new JButton();
		ImageIcon iconSubtract = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/减号.png");  
		subtractButton.setIcon(iconSubtract); 
		subtractButton.setPreferredSize(preferredSize);
		
		JButton multiplayButton=new JButton();
		ImageIcon iconMultiplay = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/乘号.png");  
		multiplayButton.setIcon(iconMultiplay); 
		multiplayButton.setPreferredSize(preferredSize);
		
		JButton dividedButton=new JButton();
		ImageIcon iconDivided = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/除号.png");  
		dividedButton.setIcon(iconDivided); 
		dividedButton.setPreferredSize(preferredSize);
		
		JButton equalButton=new JButton();
		ImageIcon iconEqual = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/等号.png");  
		equalButton.setIcon(iconEqual); 
		equalButton.setPreferredSize(preferredSize);
		
		JButton zeroButton=new JButton();
		ImageIcon icon = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/0.png");  
		zeroButton.setIcon(icon); 
		zeroButton.setPreferredSize(preferredSize);
//		zeroButton.setBorder(null);
//		zeroButton.setContentAreaFilled(false);
//		zeroButton.setSize(50, 50);
//		zeroButton.setOpaque(false);
//		zeroButton.setBorderPainted(false);
		
		JButton oneButton=new JButton();
		ImageIcon icon1 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/1.png");  
		oneButton.setIcon(icon1); 
		oneButton.setPreferredSize(preferredSize);
		
		JButton twoButton=new JButton();
		ImageIcon icon2 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/2.png");  
		twoButton.setIcon(icon2); 
		twoButton.setPreferredSize(preferredSize);
		
		JButton threeButton=new JButton();
		ImageIcon icon3 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/3.png");  
		threeButton.setIcon(icon3); 		
		threeButton.setPreferredSize(preferredSize);
		
		JButton fourButton=new JButton();
		ImageIcon icon4 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/4.png");  
		fourButton.setIcon(icon4); 
		fourButton.setPreferredSize(preferredSize);
		
		JButton fiveButton=new JButton();
		ImageIcon icon5 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/5.png");  
		fiveButton.setIcon(icon5); 
		fiveButton.setPreferredSize(preferredSize);
		
		JButton sixButton=new JButton();
		ImageIcon icon6 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/6.png");  
		sixButton.setIcon(icon6); 
		sixButton.setPreferredSize(preferredSize);
		
		JButton seveneButton=new JButton();
		ImageIcon icon7 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/7.png");  
		seveneButton.setIcon(icon7); 
		seveneButton.setPreferredSize(preferredSize);
		
		JButton eightButton=new JButton();
		ImageIcon icon8 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/8.png");  
		eightButton.setIcon(icon8);  
		eightButton.setPreferredSize(preferredSize);
		
		JButton nineButton=new JButton();
		ImageIcon icon9 = new ImageIcon("D:/guocheng/git_repository/guocheng/src/net/guocheng/cheer/exercise/ch13/9.png");  
		nineButton.setIcon(icon9);  
		nineButton.setPreferredSize(preferredSize);

//		setLayout(new BorderLayout());
//	     add(oneButton, BorderLayout.NORTH);
//	     add(twoButton, BorderLayout.SOUTH);
//	     add(threeButton, BorderLayout.EAST);
//	     add(fourButton, BorderLayout.WEST);
//	     add(fiveButton, BorderLayout.CENTER);
	     
		panel.add(textField);
		
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplayButton);
		panel.add(dividedButton);
		panel.add(equalButton);
		
		panel.add(zeroButton);
		panel.add(oneButton);
		panel.add(twoButton);
		panel.add(threeButton);
		panel.add(fourButton);
		panel.add(fiveButton);
		panel.add(sixButton);
		panel.add(seveneButton);
		panel.add(eightButton);
		panel.add(nineButton);
		

		
		GridBagConstraints s= new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		s.fill = GridBagConstraints.BOTH;
		
		
		s.gridwidth=0;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
		s.gridheight=1;//该方法是设置组件垂直所占用的格子数，如果为0，就说明该组件是该列的最后一个
	    s.weightx = 0;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
	    s.weighty=1;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
	    layout.setConstraints(textField, s);
	    
		s.gridwidth=0;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(equalButton, s);
	    
		s.gridwidth=1;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(zeroButton, s);
	    
		s.gridwidth=1;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(oneButton, s);
		
		s.gridwidth=1;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(twoButton, s);
	    
		s.gridwidth=1;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(threeButton, s);
	    
		s.gridwidth=0;
		s.gridheight=1;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(fourButton, s);
	    
		s.gridwidth=1;
		s.gridheight=2;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(fiveButton, s);
	    
		s.gridwidth=1;
		s.gridheight=2;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(sixButton, s);
	    
		s.gridwidth=1;
		s.gridheight=2;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(seveneButton, s);
	    
		s.gridwidth=1;
		s.gridheight=2;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(eightButton, s);
	    
		s.gridwidth=0;
		s.gridheight=0;
	    s.weightx = 0;
	    s.weighty=0;
	    layout.setConstraints(nineButton, s);
	    
//		s.gridwidth=0;
//		s.gridheight=1;
//	    s.weightx = 1;
//	    s.weighty=1;
//	    layout.setConstraints(textField, s);
	    
//		public interface  SetLayout(int gridwidth,int gridheight,int weightx,int weighty,Component comp)
//		{
//			Component comp;
//			s.gridwidth=0;
//			s.gridheight=1;
//		    s.weightx = 1;
//		    s.weighty=1;
//		    layout.setConstraints(comp, s);
//		}
		add(panel);
		
	}
	public static void main(String []args)
	{
		Computer computer=new Computer();
		computer.launchFrame();
		computer.button();
	}
}
