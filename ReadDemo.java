package fileHandling;

import java.io.*;
import java.io.IOException;

public class ReadDemo {
	public static void main(String[] args) throws IOException {

	/*	FileInputStream fInput = new FileInputStream("C:\\Users\\heman\\Desktop\\ReadDemo.txt");

		int i = fInput.read();    //74

		while (i != -1) {                  //-1 -----> end of data 74!= -1 T
			System.out.print((char) i);    //J
			i = fInput.read();             //97
		}
		fInput.close();*/
		
	FileReader fr = new FileReader("C:\\Users\\heman\\Desktop\\ReadDemo.txt");
	char[] c = new char[100];
	// fr.read(c);
	// System.out.println(c);
	fr.read(c, 25, 60);
	System.out.println(c);
	fr.close();

	}

}