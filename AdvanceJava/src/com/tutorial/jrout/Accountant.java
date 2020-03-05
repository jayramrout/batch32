package com.tutorial.jrout;

public class Accountant {
    private int accountId;
    public Accountant(int accountId){
        this.accountId = accountId;
    }
    public void checkAccount(){
        if(accountId > 500 && accountId < 1000) {
            System.out.println("This is a VIP Account...");
        }
    }
}
