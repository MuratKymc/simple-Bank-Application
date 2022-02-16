package com.company;

import java.util.ArrayList;

public class user {

    private String name;
    private String surname;
    private String customerNumber;
    private String email;
    private String password;
    private String phoneNumber;
    ArrayList<BankAccount> accounts;

    public user(String name, String username, String customerNumber, String email, String password, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList <BankAccount>();
    }
    public BankAccount getAccountByIndex(int i){
        return this.accounts.get(i);
    }
    public void addAccount(BankAccount b){
        accounts.add(b);
        b.setOwner(this);
    }


    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getCustomerNumber(){
        return this.customerNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String Surname){
        this.surname = surname;
    }
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


}
