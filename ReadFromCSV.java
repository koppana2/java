package fileHandling;

import java.io.*;

public class ReadFromCSV {

	public static void main(String[] args) throws IOException {
		String url = "C:\\Users\\heman\\Desktop\\EmpDetails.csv";
		BufferedReader br = new BufferedReader(new FileReader(url));
		String colLine = br.readLine();
		System.out.println(colLine);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

	}

}
