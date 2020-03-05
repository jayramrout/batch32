package com.tutorial.jrout.client;

import com.jrout.tutorial.accountant.Accountant;

public class AccountantClient {
    public static void main(String[] args) {
        Accountant accountant = new Accountant(600);
        accountant.checkAccount();
        accountant.getClass();
    }
}
