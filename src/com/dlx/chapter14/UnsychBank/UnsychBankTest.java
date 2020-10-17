package com.dlx.chapter14.UnsychBank;

import com.dlx.chapter14.UnsychBank.Bank;

public class UnsychBankTest {

    public static final int NACCOUNTS=22;
    public static final double INITIAL_BALANCE=1000;
    public static final double MAX_AMOUNT=1000;
    public static final int DELAY=10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount=i;
            Runnable r=()->{
                while (true) {
                    int toAccount = (int) (bank.size() * Math.random());
                    double amount=20*Math.random();
                    bank.transfer(fromAccount, toAccount, amount);
                    try {
                        Thread.sleep((int)(DELAY*Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
