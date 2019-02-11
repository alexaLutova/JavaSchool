package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.List;

public class CreateFunction {
    List<PhoneCode> phoneCodesList;

    public CreateFunction(List<PhoneCode> phoneCodesList) {
        this.phoneCodesList = phoneCodesList;
    }

    @Override
    public CatalogEntry apply(Person person) {
        String personPhone = person.getPhoneNumber();
        String code="";
        String city = "";
        String region = "";
        for (PhoneCode ph : phoneCodesList) {
            if (city.startsWith(ph.getCode())) {
                code = ph.getCode();
                city = ph.getCity();
                region = ph.getRegion();
            }
        }
        return new CatalogEntry(person, city, region);
    }
}
