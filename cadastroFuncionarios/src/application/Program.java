package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		// Reading Data
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("\nEmplyoee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee person = list.stream().filter(search -> search.getId() == id).findFirst().orElse(null);
		if(person == null) {
			System.out.println("This id does not exist!");
		} else {
		System.out.print("Enter the percentage for salary increase: ");
		double percent = sc.nextDouble();
		person.increaseSalary(percent);		
		}
		
		System.out.println();
		System.out.println("\nList of employees:");
		for(Employee eachEmp : list) {
			System.out.println(eachEmp);
		}
		
		
		sc.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee person = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return person != null;
	}
}
