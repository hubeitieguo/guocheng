package net.guocheng.cheer.exercise.ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamtest 
{
	public static void main (String[]args) throws IOException
	{
		File f=new File("D:/guocheng/workspace");
		FileOutputStream out=new FileOutputStream(f);
		String content="Welcome 输入输出";
		out.write(content.getBytes());
		out.flush();
		out.close();
		
		
	}
}
