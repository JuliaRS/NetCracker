package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
public class ContactsModel extends AbstractTableModel {
    public List<Contact> getContacts() {
        return contacts;
    }

    private List <Contact>  contacts = new ArrayList<>();
    ContactsModel(Contact[] cont) {
        for (Contact c: cont) {
            contacts.add(c);
        }
    }
    ContactsModel(){

    }

    @Override
    public int getRowCount() {
        return contacts.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Contact c = contacts.get(i);
        switch (i1){
            case 0: return c.getName();
            case 1: return c.getPhone();
            case 2: return c.getAddress();
            case 3: return c.getAgency();
            case 4: return c.getContactDate();
            case 5: return c.getTopic();
            case 6: return c.getDescription();
        }
        return  null;
    }

    public void addContact(Contact c) {
        contacts.add(c);
        fireTableDataChanged();
    }

    public void removeContact(int id){
        contacts.remove(id);
        fireTableDataChanged();
    }

    public void removeContact(Agency ag){
       
    }
}
