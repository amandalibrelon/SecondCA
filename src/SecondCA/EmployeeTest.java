package SecondCA;


import SecondCA.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amand
 */
public class EmployeeTest {

    public static void main(String[] args) {

        // creating 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Declaring an array to store employee objects
        Employee[] projectGroup = {emp1, emp2, emp3};

        // printing out the value of variable nextEmpNum 
        System.out.println("Value of nextEmpNum: " + Employee.getNextEmpNum());
        

    }
}
