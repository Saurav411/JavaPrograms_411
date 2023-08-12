package EmployeeSalaryComparasion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {

		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Deepak", 3500, "HR"));
		hashSet.add(new Employee("Saurav", 5500, "Inventory"));
		hashSet.add(new Employee("Suman", 1500, "IT"));
		hashSet.add(new Employee("Raj", 6500, "Infra"));

		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		Collections.sort(myList);
		System.out.println("\n Required list is: " + myList + "\n");

	}
}
