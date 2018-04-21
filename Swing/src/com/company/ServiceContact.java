package com.company;

import java.util.Date;

public class ServiceContact extends Contact {
    public ServiceContact(String client, String phone, String addres, Date date, Agency ag, String descr) {
        super(client, phone, addres, date, ag);
        this.description = descr;
        this.topic = ContactType.service;
    }
}
