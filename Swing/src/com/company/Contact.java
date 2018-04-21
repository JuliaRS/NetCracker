package com.company;

import java.util.Date;

public class Contact {
    String name;
    String phone;
    String address;
    Agency agency;
    String description;
    Date contactDate;
    ContactType topic;

    public Agency getAgency() {
        return agency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContactType getTopic() {
        return topic;
    }

    public void setTopic(ContactType topic) {
        this.topic = topic;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }


    public Contact(String name, String phone, String address, Date contactDate, Agency agency) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.contactDate = contactDate;
        this.agency = agency;
    }
    //type of contact for factory


}
