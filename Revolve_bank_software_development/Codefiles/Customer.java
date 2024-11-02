/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;


public class Customer {
    
    // Indicates that a Customer can have multiple Bank Accounts.

    private ArrayList<Account> accounts = new ArrayList<Account>();
    public void setAccounts (Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {this.accounts.add(accounts[i]);}
    }



    // This is used to prolly delete the accounts
    public void clearAccounts () {accounts.clear();}

    // This is the getter of the Array List. Will return a list of Accounts. 
    public ArrayList<Account> getAccounts () {return accounts;}

    // This will add an account element to the Array List. 

    public void addAccount (Account account) {accounts.add(account);}

    // This will remove an account element from the Array List.

    public void removeAccount (int index) {accounts.remove(index);}

    // This would retrive a specific account element from the Array List. 
    public Account getAccount (int index) {return accounts.get(index);}
    
    private ArrayList<Loan> loans = new ArrayList<Loan>();
    public void setLoans (Loan[] loans) {
        for (int i = 0; i < this.loans.size(); i++) {this.loans.add(loans[i]);}
    }
    public void clearLoans () {loans.clear();}
    public ArrayList<Loan> getLoans () {return loans;}
    public void addLoan (Loan loan) {loans.add(loan);}
    public void removeLoan (int index) {loans.remove(index);}
    public Loan getLoan (int index) {return loans.get(index);}
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private boolean isActive;
    private String password;

    // Default constructor
    public Customer() {
    }

    // Custom constructor
    public Customer(String firstName, String lastName, String email, String phoneNumber,Date dateOfBirth, boolean isActive, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
        this.password = password;
    }

    // Getters and setters for all properties
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Methods
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void updatePersonalInformation(String firstName, String lastName, String email, String phoneNumber,Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    
}
