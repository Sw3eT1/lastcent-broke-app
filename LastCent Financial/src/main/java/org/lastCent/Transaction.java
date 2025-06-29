package org.lastCent;

import java.util.Date;

public class Transaction {

    private Date dateOfTransaction;
    private double valueOfTransaction;
    private Human sender;
    private Human reciver;
     private boolean isCompleted;

    public Transaction(Date dateOfTransaction, double valueOfTransaction, Human sender, Human reciver){
        this.dateOfTransaction = dateOfTransaction;
        this.valueOfTransaction = valueOfTransaction;
        this.sender = sender;
        this.reciver = reciver;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public double getValueOfTransaction() {
        return valueOfTransaction;
    }

    public Human getSender() {
        return sender;
    }

    public Human getReciver() {
        return reciver;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
