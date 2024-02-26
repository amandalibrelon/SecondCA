/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondCA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
    this.staff = new ArrayList <>();
    this.staffSet = new HashSet<>();
    }
    
    // overload constructor
    public Company(String name) {
        this.companyName = name;
        this.staff = new ArrayList <>();
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
        
        
        
        
        
            
            
        
            
   
    }


