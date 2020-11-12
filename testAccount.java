package com.Homework_9;

public class testAccount {
    public static void main(String[] args){
        Account account = new Account(1122, 20000);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("The balance in this account is " + account.getBalance());
        System.out.println("The monthly interest is " + account.getMonthlyInterest());
        System.out.println("The new account " + account.getId() + " is created on " + account.getDateCreated());
    }
}
