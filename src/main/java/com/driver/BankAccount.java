package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name=name;
        this.balance=balance;
        this.minBalance=minBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception


        String ans = "";

        while (digits > 0) {
            if (sum >= 9) {
                sum = sum - 9;
                digits--;
                ans += String.valueOf(9);
            } else if (sum == 8) {
                sum -= 8;
                digits--;
                ans += String.valueOf(8);
            } else if (sum == 7) {
                sum -= 7;
                digits--;
                ans += String.valueOf(7);
            } else if (sum == 6) {
                sum -= 6;
                digits--;
                ans += String.valueOf(6);
            } else if (sum == 5) {
                sum -= 5;
                digits--;
                ans += String.valueOf(5);
            } else if (sum == 4) {
                sum -= 4;
                digits--;
                ans += String.valueOf(4);
            } else if (sum == 3) {
                sum -= 3;
                digits--;
                ans += String.valueOf(3);
            } else if (sum == 2) {
                sum -= 2;
                digits--;
                ans += String.valueOf(2);
            } else if (sum == 1) {
                sum -= 1;
                digits--;
                ans += String.valueOf(1);
            } else if (sum == 0) {
                sum -= 0;
                digits--;
                ans += String.valueOf(0);
            }
        }

        if (sum != 0) {
            throw new Exception("Account Number can not be generated");
        }

        return ans;
    }

    public void deposit(double amount) {
        //add amount to balance

        balance=balance+amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance


        double withdraw=balance-amount;

        if(withdraw<minBalance){
            throw new Exception("Insufficient Balance");
        }

        balance=withdraw;
    }

}