package SecondCA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amand
 */
public class Employee {
    
    public String name;
    public String email;
    public int empNum;
    public static int nextEmpNum = 1;
    private int Manager;
    String username;
    String password;
    
    
// constructor with default values
    public Employee(int par, String manager) {
        this.name = "";
        this.email = "";
        this.empNum = nextEmpNum++;

    }

    // constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    // accessor methos
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
       
    }

    public String getPassword() {
        return password;
    }
        
    public void setPassword(String password) {
        this.password = password;
    
    }
    public String getName() {
        return name;

    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

//setEmail method
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Email is too short, email must me longer than 3 characters");
        }
    }

// getNextEmpNum() method
    public static int getNextEmpNum() {
        return nextEmpNum;
    }


}
