/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Asus X452C
 */
public class Student {
      private String major;

    public Student(String name, String NIM, String major) {
        super(name, NIM);
        this.major = major;
    }

    Student(String john_Doe, String string, String computer_Science) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getInformation() {
        super.getInformation();
        System.out.println("Major: " + major);
    }
}


