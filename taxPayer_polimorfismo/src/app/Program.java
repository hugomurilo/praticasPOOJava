package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double valueExpend = sc.nextDouble();
				list.add(new Individual(name, income, valueExpend));
			} else {
				System.out.print("Number of employees: ");
				int nEmp = sc.nextInt();
				list.add(new Company(name, income, nEmp));
			}
		}
		
		System.out.println();
		double totalTax=0.0;
		System.out.println("TAXES PAID: ");
		for(TaxPayer emp: list) {
			double tax = emp.tax();
			System.out.println(emp.getName() + ": $" + String.format("%.2f", emp.tax()));
			totalTax+=tax;
		}
		
		System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", totalTax));
		
		sc.close();
	}

}
