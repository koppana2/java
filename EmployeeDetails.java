package fileHandling;

import java.io.*;

public class EmployeeDetails {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("EmpDetails");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		String emp = "";
		while (line != null) {

			String[] s = line.split(":");
			emp += s[1].trim() + ",";
			line = br.readLine();
		}
		System.out.println(emp);
		createEmployeeClass(emp);
		br.close();

	}

	public static void createEmployeeClass(String emp) {
		String[] employee = emp.split(",");

		String Id = employee[0];
		String Name = employee[1];
		String Dept = employee[2];
		String Salary = employee[3];

		Employee e = new Employee(Id, Name, Dept, Salary);
		System.out.println(e);
	}

}
