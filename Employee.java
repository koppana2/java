package fileHandling;

public class Employee {
	private String Id, Name, Dept, Salary;

	public Employee() {
	}

	public Employee(String id, String name, String dept, String salary) {
		this();
		this.Id = id;
		this.Name = name;
		this.Dept = dept;
		this.Salary = salary;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		this.Dept = dept;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Dept=" + Dept + ", Salary=" + Salary + "]";
	}

}
