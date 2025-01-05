/*a java program that creates a class named Employee having the following members : Name, Age, Phone number, Address, Salary. It also has a method named printSalary() which prints the salary of the Employee. Two classes Officer and Manager inherits the Employee class. The Officer and Manager classes have data members specialisation and department respectively and assigning name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same*/

import java.util.Scanner;

class Employee
{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	public Employee(String name, int age, String phoneNumber, String address, double salary)
	{
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary()
	{
		System.out.println("Salary: " + salary);
	}
}
class Officer extends Employee
{
	String specialization;
	public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization)
	{
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
}
class Manager extends Employee
{
	String department;
	public Manager(String name, int age, String phoneNumber, String address, double salary, String department)
	{
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Officer details:");
		System.out.print("Name: ");
		String officerName = scanner.nextLine();
		System.out.print("Age: ");
		int officerAge = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Phone Number: ");
		String officerPhoneNumber = scanner.nextLine();
		System.out.print("Address: ");
		String officerAddress = scanner.nextLine();
		System.out.print("Salary: ");
		double officerSalary = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Specialization: ");
		String officerSpecialization = scanner.nextLine();
		Officer officer = new Officer(officerName, officerAge,
		officerPhoneNumber, officerAddress, officerSalary,
		officerSpecialization);
		System.out.println("\nEnter Manager details:");
		System.out.print("Name: ");
		String managerName = scanner.nextLine();
		System.out.print("Age: ");
		int managerAge = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Phone Number: ");
		String managerPhoneNumber = scanner.nextLine();
		System.out.print("Address: ");
		String managerAddress = scanner.nextLine();
		System.out.print("Salary: ");
		double managerSalary = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Department: ");
		String managerDepartment = scanner.nextLine();
		Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);
		System.out.println("\nOfficer Details:");
		System.out.println("Name: " + officer.name);
		System.out.println("Age: " + officer.age);
		System.out.println("Phone Number: " + officer.phoneNumber);
		System.out.println("Address: " + officer.address);
		officer.printSalary();
		System.out.println("Specialization: " + officer.specialization);
		System.out.println("\nManager Details:");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone Number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
		scanner.close();
	}
}