package org.lastCent;

import java.util.Date;

public abstract class Human {
    private String name;
    private String surname;
    private int age;
    private int pesel;
    private Date birthDate;
    private int telephoneNumber;
    private String eMail;
    private String documentID;
    private Address address;


    public Human(String name, String surname, int age, int pesesl, Date birthDate, int telephoneNumber, String eMail,
                 Address address, String documentID){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesesl;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
        this.eMail = eMail;
        this.address = address;
        this.documentID = documentID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPesel() {
        return pesel;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
