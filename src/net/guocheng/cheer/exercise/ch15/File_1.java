package net.guocheng.cheer.exercise.ch15;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;


public class File_1 
{
	public static void main(String[]args)
	{
		File f=new File("D:/guocheng/workspace");
		if(f.isDirectory())
		{
			File[] children=f.listFiles(new FileFilter()
			{

				@Override
				public boolean accept(File pathname) 
				{
					System.out.println(pathname.getName());
					return pathname.getName().endsWith(".exe");
				}
			});
			System.out.println("Result as Velow>>>>>");
			for (int i=0;i<children.length;i++)
			{
				File child=children[i];
				System.out.println(child.getAbsolutePath());
			}
			
		}
	}
}
