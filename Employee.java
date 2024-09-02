/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Asus X452C
 */
public class Employee {
    protected String department;

    public Employee(String name, String NIM, String department) {
        super(name, NIM);
        this.department = department;
    }

    public void getInformation() {
        super.getInformation();
        System.out.println("Department: " + department);
    }
}
}


