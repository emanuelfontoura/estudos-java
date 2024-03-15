package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		int id;
		String name;
		double salary;
		for(int c = 0; c < n; c++) {
			System.out.printf("Employee #%d%n", c + 1);
			System.out.print("Id: ");
			id = sc.nextInt();
			System.out.print("Name: ");
			String clearBuffer = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee Id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Employee employeeIncrease = employees.stream().filter(e -> e.getId() == idIncrease).findFirst().orElse(null);
		
		if(employeeIncrease == null) {
			System.out.println("This id not exists!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentageIncrease = sc.nextDouble();
			for(Employee employee : employees) {
				if(employee.getId() == idIncrease) {
					employee.increaseSalary(percentageIncrease);
				}
			}
		}
		
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		sc.close();
	}

}
