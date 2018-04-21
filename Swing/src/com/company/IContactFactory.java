package com.company;

import java.util.Date;

public interface IContactFactory {
    Contact getContact(ContactType t, String clientName, String phone, String addres, Date date, Agency ag, String descr);

}
