/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;


public class Manager extends Teller {
    
    //An ArrayList of all Teller Objects 
    
    
    private ArrayList<Teller> tellers = new ArrayList<Teller>();

    // Notice that this setter takes in an array of Tellers and assigns individual elements(of the Array) to the ArrayList. 

    public void setTellers (Teller[] tellersList) {
        for (int i = 0; i < tellersList.length; i++) {this.tellers.add(tellersList[i]);}
    }

    public void clearTellers () {tellers.clear();}
    public ArrayList<Teller> getTellers () {return tellers;}
    public void hireTeller (Teller teller) {tellers.add(teller);}
    public void fireTeller (int index) {tellers.remove(index);}
    public Teller getTeller (int index) {return tellers.get(index);}
    
    /* 
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    public void setCustomers (Customer[] customers) {
        for (int i = 0; i < this.customers.size(); i++) {this.customers.add(customers[i]);}  // Devin You might wanna take a look at this again 
    }
    public void clearCustomers () {customers.clear();}
    public ArrayList<Customer> getCustomers () {return customers;}
    public void addCustomer (Customer customer) {customers.add(customer);}
    public void removeCustomer (int index) {customers.remove(index);}
    public Customer getCustomer (int index) {return customers.get(index);}
    
    */
    public int getNumTellers () {return tellers.size();}
    public int getNumCustomers(){return super.get_customers().size();}
    
    public double[] liquidityCheck () {
        double accountAssets = 0.0;
        double loanedAssets = 0.0;
        double revenue = 0.0; // not used yet
        double investedAssets = 0.0; // not used yet

        // We must provide the manager with direct access to Customers.
        //

        for (int a = 0; a < super.get_customers().size(); a++) {
            for (int b = 0; b < super.get_customers().get(a).getAccounts().size(); b++) {
                accountAssets += super.get_customers().get(a).getAccount(b).getBalance();  // Good Job Devin!!
            }
            for (int c = 0; c < super.get_customers().get(c).getLoans().size(); c++) {
                loanedAssets += -super.get_customers().get(a).getLoan(c).getBalance();
            }
        }
        double[] listOfAssets = {accountAssets, loanedAssets, revenue, investedAssets};
        return listOfAssets;
    }

    /**
     * Important thing here is the fact that the manager has got direct access to customers without depending on the teller. 
     */
    
    public void freezeAll () {
        for (int a = 0; a < super.get_customers().size(); a++) {
            for (int b = 0; b <super.get_customers().get(a).getAccounts().size(); b++) {
                super.get_customers().get(a).getAccount(b).freeze();
            }
        }
    }

    // This array of customers is to help with setting the default value of customers ArrayList  instance variable;

    Customer [] setter_customers= new Customer [5];
    Teller [] setter_Tellers=new Teller[5];
    public void defaultManagerInfo () {
        // Initialize default values
        set_firstName("");
        set_lastName("");
        set_employeeID("");
        set_salary(0.0);
        set_contactNumber(7);
        set_fullTimeStatus(false);
        set_educationLevel("");
        set_yearsOfExperience(0);
        
        set_nationalID("");
        set_password("");

        // This is very important for manager to be able to access the ArrayList of all Customers and theerefore, their Accounts

        set_Customers(setter_customers);
        setTellers(setter_Tellers);

       
    }
   

    public void replaceManagerInfo (String firstName, String lastName, String employeeID, double salary, 
    int contactNumber,  boolean fullTime, String educationLevel, 
    int yearsOfExperience, String nationalID, String password, Customer[] customers, Teller [] tellers) {
        set_firstName(firstName);
        set_lastName(lastName);
        set_employeeID(employeeID);
        set_salary(salary);
        set_contactNumber(contactNumber);
        set_fullTimeStatus(true);
        set_educationLevel(educationLevel);
        set_yearsOfExperience(yearsOfExperience);
        set_nationalID(nationalID);
        set_password(password);

        // Now set the customers that this Teller has control over.

        set_Customers(customers); // Takes in an array of customers and uses it to  populate the ArrayList Instance variable.
        setTellers(tellers);
     }
    
}
