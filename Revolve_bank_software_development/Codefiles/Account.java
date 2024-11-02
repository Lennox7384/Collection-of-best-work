/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Date;


public class Account  {


    //Name of the Account owner 
    
    private String name = "";
    public String getName () {return name;}
    public void setName (String name) {this.name = name;}

    //Status of the account
    
    private boolean isFrozen = false;
    public boolean getState () {return isFrozen;}
    public void freeze () {isFrozen = true;}
    public void melt () {isFrozen = false;}

    //Account interst Rate. Should be a static variable
    
    private double interestRate = 0.03;
    public double getInterestRate () {return interestRate;}
    public void setInterestRate (double interestRate) {this.interestRate = interestRate;}
    
    //Withdrawal charge should be a static variable
    private double withdrawalCharge = 0;
    public double getWithdrawalCharge () {return withdrawalCharge;}
    public void setWithdrawalCharge (double withdrawalCharge) {this.withdrawalCharge = withdrawalCharge;}
    
    //Account's Unique Identity.

    private int id = 0;
    public int getID () {return id;}
    public void setID (int id) {this.id = id;}
    

    //Balance of the Account. 

    private double balance = 0;
    public double getBalance () {return balance;}
    public void setBalance (double balance) {this.balance = balance;}
    
    //An array of Labels of type string 

    private final String[] LABELS = {"Date", "Type", "Info", "Currency", "Amount", "Balance"};
    public String[] getLabels () {return LABELS;}
    
    //Empty ArrayList called History. Intended to Contain ARRAYS OF STRINGS

    private ArrayList<String[]> history = new ArrayList<String[]>();   //This is Genious Devin!
    public ArrayList<String[]> getHistory () {return history;}


    // A 2D Array of type String . Notice that entire rows (Arrays) are being added to the ArrayList.

    // We must be very keen about the parameter variable and how it will be entered. 
    

    public void setHistory (String[][] history) {
        for (int i = 0; i < history.length; i++) {this.history.add(history[i]);}
    }

    // Intended to retrive specific Arrays of type String that had been strored in  History ArrayList.
    // This is different from the History getter because the getter returns the entire ArrayList (of arrays.)

    public String[] getLog (int index) {return history.get(index);}

    // Helps to remove and add arrays in the arrayList History. 
    public void addLog (String[] log) {history.add(log);}
    public void removeLog (int index) {history.remove(index);}



    //---------------------------------------------
    // Account Constructors.
    //---------------------------------------------
    
    //Default Constoructor.

    public Account () {}

    //Constructor 1

    public Account (String name, int id, double balance) {
        setName(name);
        setID(id);
        setBalance(balance);
    }

    //Contructor 2.

    public Account (String name, int id, double balance, double interestRate, double withdrawalCharge) {
        setName(name);
        setID(id);
        setBalance(balance);
        setInterestRate(interestRate);
        setWithdrawalCharge(withdrawalCharge);
    }

    // Constructor 3

    public Account (String name, int id, double balance, String[][] history) {
        setName(name);
        setID(id);
        setBalance(balance);
        setHistory(history);
    }

    //Constructor 4

    public Account (String name, int id, double balance, String[][] history, double interestRate, double withdrawalCharge) {
        setName(name);
        setID(id);
        setBalance(balance);
        setHistory(history);
        setInterestRate(interestRate);
        setWithdrawalCharge(withdrawalCharge);
    }

    //---------------------------------------------
    // Account Methods
    //---------------------------------------------
    

    /**
     *  This method looks Good.
     * @param amount  the sum to be DEPOSITED.
     * @param log  ???
     * @return
     */

    public double deposit (double amount, String[] log) {
        if (amount > 0) {
            balance += amount;
            addLog(log);
        } else {System.out.println("transaction failed: you need to use positive numbers");}
        return getBalance();
    }


    /**
     * 
     * @param amount  the sum to be withdrawn 
     * @param log ???
     * @return
     */

    public double withdraw (double amount, String[] log) {
        if (amount > 0) {
            if (!isFrozen) {
                if (balance - (amount + withdrawalCharge) > 0) {
                    balance -= amount + withdrawalCharge;
                    addLog(log);
                } else {System.out.println("transaction failed: account " + id + " doesn't have sufficient funds or is a loan");}
            } else {System.out.println("transaction failed: account " + id + " is frozen");}
        } else {System.out.println("transaction failed: you need to use positive numbers");}
        return getBalance();
    }

    /**
     * 
     * @param reciever Account object to recieve the funds Transfered. 
     * @param amount  The ammount to be trasfered. 
     * @param log  ???
     * @param recieverLog ??? Both Log and Receiver Log have not been used here.
     * @return
     */


    public double transfer (Account reciever, double amount, String[] log, String[] recieverLog) {
        double balanceBefore = balance;
        withdraw(amount, log);

        //???  There could be an issue here. 
        reciever.deposit(balanceBefore - balance, recieverLog);
        return getBalance();
    }


    public double transferToLoan (Loan reciever, double amount, String[] log, String[] recieverLog) {
        double balanceBefore = balance;
        withdraw(amount, log);
        reciever.deposit(balanceBefore - balance, recieverLog);
        return getBalance();
    }
    public double applyInterest () {
        balance += interestRate * balance;
        return getBalance();
    }
    public void dispute (int index) {
        // Send info to bank when object is finished
    }

    //--------------------------------------------
    // Implementation of Comparable Interface 
    //--------------------------------------------

    
  


/**
 *     Teller nova= new Teller("Nova","Elizabeth","776655");
    
    Customer austin=nova.createNewCustomer();
    System.out.println(austin.getLastName());
    
    Customer gianna=nova.createNewCustomer();
    Customer colton=nova.createNewCustomer();
    Customer sofia =nova.createNewCustomer();

        private Date endDate;

       

         public Date  get_endDate()
         {
 
            return endDate;
         }
 
 

 
         public void set_endDate (Date  endDate)
         {
 
            this.endDate=endDate;
         }


private Date startDate;

       

         public Date  get_startDate()
         {
 
            return startDate;
         }
 
 
       
 
         public void set_startDate (Date  startDate)
         {
 
            this.startDate=startDate;
         }







 */

    
}