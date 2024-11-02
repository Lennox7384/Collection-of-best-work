
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public final class Loan extends Account {
    
    
    private double lateCharge = 0.0;


    public double getLateCharge () {return lateCharge;}
    public void setLateCharge (double lateCharge) {this.lateCharge = lateCharge;}
    
    private int paymentPeriods = 0;
    public int getPaymentPeriods () {return paymentPeriods;}
    public void setPaymentPeriods (int paymentPeriods) {this.paymentPeriods = paymentPeriods;}
    
    private double amountPayedInPeriod = 0.0;
    public double getAmountPayedInPeriod () {return amountPayedInPeriod;}
    public void setAmountPayedInPeriod (double amountPayedInPeriod) {this.amountPayedInPeriod = amountPayedInPeriod;}
    
    public Loan () {}
    public Loan (int id, double owed, double lateCharge, int paymentPeriods) {
        setID(id);
        setBalance(-owed);
        setInterestRate(0.08);
        setLateCharge(lateCharge);
        setPaymentPeriods(paymentPeriods);
    }
    public Loan (int id, double balance, double interestRate, double lateCharge, int paymentPeriods) {
        setID(id);
        setBalance(balance);
        setInterestRate(interestRate);
        setLateCharge(lateCharge);
        setPaymentPeriods(paymentPeriods);
    }
    
    public double periodCheck () {
        if (!(amountPayedInPeriod > -getBalance()/paymentPeriods)) {
            setBalance(getBalance() - lateCharge);
            System.out.println("You did not make a full payment on your loan for this period, and will be charged: $" + lateCharge);
        }
        applyInterest();
        return getBalance();
    }
    @Override
    public double deposit (double amount, String[] log) {
        double result = super.deposit(amount, log);
        amountPayedInPeriod += amount;
        return result;
    }
 
}