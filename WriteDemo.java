package fileHandling;

import java.io.*;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		String s = "This File is Demo Purpose                   ";

	/*	FileOutputStream fo = new FileOutputStream("C:\\Users\\heman\\Desktop\\WriteDemo.txt");
		byte[] b = s.getBytes();
		fo.write(b);
		fo.close();*/
		
	FileWriter fw = new FileWriter("C:\\Users\\heman\\Desktop\\WriteDemo.txt",true);
	fw.write(s);
	//fw.write("Line 2 new content");
	fw.close();

	}

}
