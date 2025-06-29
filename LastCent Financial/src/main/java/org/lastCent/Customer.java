package org.lastCent;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends Human {

    double balance;
    ArrayList<Transaction> transactions;


    public Customer(String name, String surname, int age, int pesesl, Date birthDate, int telephoneNumber, String eMail, Address address, String documentID) {
        super(name, surname, age, pesesl, birthDate, telephoneNumber, eMail, address, documentID);
    }
}
