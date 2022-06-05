package code_decode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 2000));
		empList.add(new Employee(5, 2500));
		empList.add(new Employee(6, 3000));
		empList.add(new Employee(7, 3500));
		
       //sort employee based on their salaries in descending order
		List<Employee> empSortList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println("sort employee based on their salaries in descending order : " + empSortList);
		System.out.println("\n");
		// fetch Top 3 salaried employee using limit()
		List<Employee> empSortList1 = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.limit(3).collect(Collectors.toList());
		System.out.println("fetch Top 3 salaried employee : " + empSortList1);
		System.out.println("\n");
		// Fetch all employee having salary less than 3rd highest salary using skip()?
		List<Employee> empSortList2 = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.skip(3).collect(Collectors.toList());
		System.out.println("Fetch all employee having salary less than 3rd highest salary : " + empSortList2);
	}

}
