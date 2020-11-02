package com.Homework_9;

import java.util.Date;
import java.lang.String;

public class Account {
    //DataFields
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.045;
    private Date dateCreated;

    //no-arg constructor
    public Account(){
        dateCreated = new Date();
    }

    //constructor with argument
    public Account(int id, double balance){
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    //id's getter and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    //balance's getter and setter
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //annualIntertstRate's getter and setter
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //get dateCreated
    public String getDateCreated(){
        return dateCreated.toString();
    }

    //getMonthlyInterestRate()
    public double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12;
    }

    //getMonthlyInterest()
    public double getMonthlyInterest(){
        return getBalance()*getMonthlyInterestRate();
    }

    //withDraw()
    public void withDraw(double amount){
        this.balance -= amount;
        setBalance(this.balance);

    }

    //deposit()
    public void deposit(double amount){
        this.balance += amount;
        setBalance(this.balance);
    }

}
