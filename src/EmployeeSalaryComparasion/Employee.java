package EmployeeSalaryComparasion;

public class Employee implements Comparable<Employee> {
	String Name;
	int Salary;
	String Department;

	public Employee(String name, int salary, String department) {
		super();
		Name = name;
		Salary = salary;
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Salary=" + Salary + ", Department=" + Department + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (Salary > o.Salary) {
			return -1;
		} else if (Salary < o.Salary) {
			return 1;
		}
		return 0;
	}
}
