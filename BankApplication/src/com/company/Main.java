package com.company;

public class Main {

    public static void main(String[] args) {

        user u1 = new user("ali", "ahemet","1234567","asd@b.com","5678","5555555");
        BankAccount b1 = new BankAccount(100,-100,"12345","TR123456");
        BankAccount b2 = new BankAccount(100,-100,"123456","TR1234567");

        u1.addAccount(b1);
        u1.addAccount(b2);

        b1.makeEFT(b2, 20);

        System.out.println("B1 : " + b1.getBalance());
        System.out.println("B2 : " + b2.getBalance());

    }
}
