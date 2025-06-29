package org.lastCent;

import java.util.Date;

public class Employee extends Human {

    public Employee(String name, String surname, int age, int pesesl, Date birthDate, int telephoneNumber, String eMail, Address address, String documentID) {
        super(name, surname, age, pesesl, birthDate, telephoneNumber, eMail, address, documentID);
    }
}
