/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Asus X452C
 */
public class CommunityMember {
    protected String name;
    protected String NIM;

    public CommunityMember(String name, String NIM) {
        this.name = name;
        this.NIM = NIM;
    }

    public void getInformation() {
        System.out.println("Name: " + name + ", NIM: " + NIM);
    }
}


