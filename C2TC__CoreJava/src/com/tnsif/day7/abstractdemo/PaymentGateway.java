package com.tnsif.day7.abstractdemo;

//Abstract class
abstract class PaymentGateway {
 public abstract void paymentProcess(double amt);

 public void connectToPayment() {
     System.out.println("Connecting to Payment gateway...");
 }
}

//Subclass that implements the abstract method
class CreditPayment extends PaymentGateway {
 @Override
 public void paymentProcess(double amt) {
     System.out.println("Processing the amount Rs." + amt);
 }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway payment = new CreditPayment();
        payment.connectToPayment();
        payment.paymentProcess(20000.0);
    }
}