/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondCA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class Company {

    private String companyName;
    private ArrayList<Employee> staff;
    private HashSet<Integer> staffSet;

    // default constructor
    public Company() {
        this.companyName = "";
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>();
    }

    // overload constructor
    public Company(String name) {
        this.companyName = name;
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>();

    }

    //adding new employee
    public void addNewStaff(Employee employee) {
        if (!staffSet.contains(employee.getEmpNum())) {
            staff.add(employee);
            staffSet.add(employee.getEmpNum());
        } else {
            System.out.println("Employee with the same employee number already exists");
        }
    }

    // removing employee
    public void removeStaff(int empNum) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() == empNum) {
                iterator.remove();
                staffSet.remove(empNum);
                System.out.println("Employee removed");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    // method to get staff number

    public int getStaffNumber() {
        return staff.size();
    }

    // listing employees above a given employee number
    public void listEmployees(int empNumThreshold) {
        System.out.println("Employee above employee number " + empNumThreshold + ":");
        for (Employee employee : staff) {
            if (employee.getEmpNum() > empNumThreshold) {
                System.out.println(employee.getEmpNum());
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Company company = new Company("MyCompany");

        // Adding a manager 
        Employee manager = new Employee(1, "Manager");
        company.addNewStaff(manager);
        manager.setUsername("Gnomeo");
        manager.setPassword("Smurf");

        // creating Menu
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. View current staff");
            System.out.println("2. Add new staff");
            System.out.println("3. Remove staff");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // view current staff
                    System.out.println("Number of employees " + company.getStaffNumber());
                    break;

                case 2:
                    //adding new staff
                    System.out.println("Enter employee number: ");
                    int empNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter employee name: ");
                    String empName = sc.nextLine();
                    Employee newEmployee = new Employee(empNum, empName);
                    company.addNewStaff(newEmployee);
                    break;

                case 3:
                    //removing staff
                    System.out.println("Enter employee number to remove: ");
                    int empNumToRemove = sc.nextInt();
                    break;
                case 4:
                    // exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Incorrect choice!");

            }
        } while (choice != 4);

        sc.close();

    }
}
