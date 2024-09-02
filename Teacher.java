/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Asus X452C
 */
public class Teacher {
private String subject;

    public Teacher(String name, String NIM, String department, String rank, String subject) {
        super(name, NIM, department, rank);
        this.subject = subject;
    }

    public void getInformation() {
        super.getInformation();
        System.out.println("Subject: " + subject);
    }
}
    

