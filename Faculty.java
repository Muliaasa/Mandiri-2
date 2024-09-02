/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Asus X452C
 */
public class Faculty {
    protected String department;

    public Faculty(String name, String NIM, String department) {
        super(name, NIM);
        this.department = department;
    }


    Faculty(String jane_Smith, String string, String computer_Science, String professor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getInformation() {
        super.getInformation();
        System.out.println("Department: " + department);
    }
}

