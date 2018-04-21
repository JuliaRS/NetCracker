package com.company;


import java.lang.management.MemoryUsage;

public class AgencyFactory implements IAgencyFactory {
    @Override
    public Agency getAgency(int emp, String agName, String city, String phone) {
       if (emp <= 10){
           return new SmallAgency(agName, city, phone, emp);
       }else if (emp <= 25){
           return new MediumAgency(agName, city,phone, emp);
       }else if (emp <=100){
           return new BigAgency(agName,city, phone, emp);

       }
        return null;
    }

}