/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondCA;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author amand
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> staff;
    private HashSet<Integer> staffSet;
    
    public Company() {
    this.companyName = "";
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

}
