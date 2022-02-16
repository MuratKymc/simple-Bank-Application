package com.company;

public class BankAccount {
    private user owner;
    private double balance;
    private double minimumBalance;
    private String accountNumber;
    private String ibanNumber;

    public BankAccount(double balance, double minimumBalance,String accountNumber,String ibanNumber){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountNumber = accountNumber;
        this.ibanNumber = ibanNumber;
    }

    public void setOwner(user owner){
        this.owner = owner;
    }

    public double getBalance(){
        return this.balance;
    }
    public double getMinimumBalance(){
        return this.minimumBalance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getIbanNumber(){
        return this.ibanNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setMinimumBalance(double minmumBalance){
        this.minimumBalance = minimumBalance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setIbanNumber(String ibanNumber){
        this.ibanNumber = ibanNumber;
    }


    public boolean checkBalance(double m ){
        return (this.balance -  m)>= this.minimumBalance;
    }
    public void makeEFT(BankAccount receiver, double m){
        if(checkBalance(m)){
            this.balance = this.balance - m;
            receiver.setBalance(receiver.getBalance() + m);
            System.out.println("Success!!");

        }
        else{
            System.out.println("Error!!");
        }
    }


}
