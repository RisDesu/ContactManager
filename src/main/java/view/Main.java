/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ContactManager;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author HP
 */
public class Main {
     public static void main(String[] args) {
        String title = "Menu";
        String[] s = new String[]{"Add a contact ", "Display all contact", 
            "Delete a contact","Exit"};
        Menu<String> menu = new ContactManager(title, s);
         ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Pham Phu Dong", "3 ae sieu nhan", "betonamu", "555-111-888", "Pham Phu", "Dong"));
        lc.add(new Contact(2, "Tran Luong Thao Chi", "3 ae sieu nhan", "betonamu", "000-111-666", "Tran Luong Thao", "Chi"));
        lc.add(new Contact(3, "Phan Gia Huy", "3 ae sieu nhan", "betonamu", "777-555-222", "Phan Gia", "Huy"));
        menu.run();
    }
}
