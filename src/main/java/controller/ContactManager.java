/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import view.Validation;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Contact;
import model.ContactList;
import view.Menu;

/**
 *
 * @author HP
 */
public class ContactManager extends Menu<String>{
    private ContactList list= new ContactList();
    public ContactManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.createContact();
                break;
            case 2:
                list.printAllContact();
                break;
            case 3:
                list.deleteContactd();
                break;
            case 4:
                System.exit(0);        
        }
    }

}
