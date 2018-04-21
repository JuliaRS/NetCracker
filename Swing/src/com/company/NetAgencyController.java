package com.company;

import java.util.Date;

public class NetAgencyController {
    private ContactsModel contactsModel = new ContactsModel();
    private AgenciesModel agModel = new AgenciesModel();

    public ContactsModel getContactsModel() {
        return contactsModel;
    }

    public AgenciesModel getAgModel() {
        return agModel;
    }

    public AgencyFactory getAgencyFactory() {
        return agencyFactory;
    }

    public ContactFactory getContactFactory() {
        return contactFactory;
    }

    public ContactType[] getTc() {
        return tc;
    }

    private AgencyFactory agencyFactory;
    private ContactFactory contactFactory;
    private final ContactType tc[];
    public NetAgencyController() {
        tc = new ContactType[]{ContactType.info, ContactType.buying, ContactType.service, ContactType.buying, ContactType.compliance};
    }

    public void createAgency(String name, String city, String phone, int emp){
        Agency a = agencyFactory.getAgency(emp, name, city, phone);
        agModel.addAgency(a);

    };
    public void createContact(String client, String phone, String address, Agency ag, Date dt, String descr, ContactType tc){
        Contact c = contactFactory.getContact(tc, client, phone, address, dt, ag, descr);
    };
    /*public void filterBy(){

    };*/

    public Agency getAgency(int index){
        return agModel.getAgency(index);
    }
    public Contact getContact(int index){
        return contactsModel.getContacts().get(index);
    }
    public void editAgency(int index, Agency ag){
        agModel.setValueAt(ag.name, index, 0);
        agModel.setValueAt(ag.city, index, 1);
        agModel.setValueAt(ag.phone, index, 2);
        agModel.setValueAt(ag.employeeCount, index, 3);
        agModel.fireTableDataChanged();
    };


    public void editContact(int index, Contact c){
        contactsModel.setValueAt(c.name, index, 0);
        contactsModel.setValueAt(c.phone, index, 1);
        contactsModel.setValueAt(c.address, index, 2);
        contactsModel.setValueAt(c.agency, index, 3);
        contactsModel.setValueAt(c.contactDate, index, 4);
        contactsModel.setValueAt(c.topic, index, 5);
        contactsModel.setValueAt(c.description, index, 6);
        contactsModel.fireTableDataChanged();

    };


    public void deleteAgency(int index){
       Agency delagency = agModel.getAgency(index);
       contactsModel.removeContact(delagency);
       agModel.removeAgency(index);

    }

    public void deleteContact(int index){
        contactsModel.removeContact(index);
    }


}
