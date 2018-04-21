package com.company;


import java.util.Date;

public class ContactFactory implements IContactFactory {
    public Contact getContact(ContactType t, String clientName, String phone, String addres, Date date, Agency ag, String descr) {
        switch (t){
            case info: return new InfoContact(clientName, phone, addres, date, ag, descr);
            case buying: return  new TourBuingContact(clientName, phone, addres, date, ag, descr);
            case service: return  new ServiceContact(clientName, phone, addres, date, ag, descr);
            case compliance: return new ComplianceContact(clientName, phone, addres, date, ag, descr);
        }
        return null;
    }

}
