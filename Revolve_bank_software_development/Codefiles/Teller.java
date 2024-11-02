/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Teller {
    
    
    //--------------------------------------------------------------
    //  Personal Instance variables of Teller Objects 
    //--------------------------------------------------------------
    
    private String firstName;

        /**
         * 
         * @return returns the first name of the Teller. 
         */

         public String get_firstName()
         {

            return firstName;
         }


        /**
         * 
         * @param firstName Sets the first Name of the Teller object
         */

            public void set_firstName(String firstName)
         {

            this.firstName=firstName;
         }

    private String lastName;

        /**
         * 
         * @return returns the lastName of the Teller. 
         */

         public String get_lastName()
         {
 
            return lastName;
         }
 
 
         /**
          * 
          * @param lastName Sets the lastName of the Teller object
          */
 
         public void set_lastName(String lastName)
         {
 
            this.lastName=lastName;
         }

    private int contactNumber;

        /**
         * 
         * @return returns the contactNumber of the Teller. 
         */

         public int get_contactNumber()
         {
 
            return contactNumber;
         }
 
 
         /**
          * 
          * @param contactNumber Sets the contactNumber of the Teller object
          */
 
         public void set_contactNumber (int contactNumber)
         {
 
            this.contactNumber=contactNumber;
         }

    private double salary;

        /**
         * 
         * @return returns the salary of the Teller. 
         */

         public double get_salary()
         {
 
            return salary;
         }
 
 
         /**
          * 
          * @param salary Sets the salary of the Teller object
          */
 
         public void set_salary (double salary)
         {
 
            this.salary=salary;
         }

    



    private boolean fullTime;

        /**
         * 
         * @return returns the true if is teller is employeed full time. 
         */

         public boolean  get_fullTimeStatus()
         {
 
            return fullTime;
         }
 
 
         /**
          * 
          * @param fullTime put true if the teller is employeed fulltime and false if not
          */
 
         public void set_fullTimeStatus (Boolean  fullTime)
         {
 
            this.fullTime=fullTime;
         }
    private String educationLevel;

        /**
         * 
         * @return returns the educationLevel of the Teller. 
         */

         public String get_educationLevel()
         {
 
            return educationLevel;
         }
 
 
         /**
          * 
          * @param educationLevel Sets the educationLevel of the Teller object
          */
 
         public void set_educationLevel (String educationLevel)
         {
 
            this.educationLevel=educationLevel;
         }

    private int yearsOfExperience;

        /**
         * 
         * @return returns the contactNumber of the Teller. 
         */

         public int get_yearsOfExperience()
         {
 
            return yearsOfExperience;
         }
 
 
         /**
          * 
          * @param yearsOfExperience Sets the yearsOfExperience  of the Teller object
          */
 
         public void set_yearsOfExperience (int yearsOfExperience)
         {
 
            this.yearsOfExperience=yearsOfExperience;
         }

    private String employeeID;

        /**
         * 
         * @return returns the employeeID of the Teller. 
         */

         public String get_employeeID()
         {
 
            return employeeID;
         }
 
 
         /**
          * 
          * @param employeeID Sets the employeeID of the Teller object
          */
 
         public void set_employeeID (String employeeID)
         {
 
            this.employeeID=employeeID;
         }

    private String nationalID;

        /**
         * 
         * @return returns the nationalID of the Teller. 
         */

         public String get_nationalID()
         {
 
            return nationalID;
         }
 
 
         /**
          * 
          * @param nationalID Sets the nationalID of the Teller object
          */
 
         public void set_nationalID (String nationalID)
         {
 
            this.nationalID=nationalID;
         }

    private String password;

        /**
         * 
         * @return returns the npassword of the Teller. 
         */

         public String get_password()
         {
 
            return password;
         }
 
 
         /**
          * 
          * @param nationalID Sets the passwordof the Teller object
          */
 
         public void set_password (String password)
         {
 
            this.password=password;
         }


    //--------------------------------------------------------------
    // Organisation related Instance variables
    //--------------------------------------------------------------  

    /** 
    
        private String tellerID;................ Not needed, Teller already has Employee ID
        private String branchID;................This will be an insatance variable of the Bank Branch class
        private Date dateOfHire;................Not useful
        private boolean isActive;...............Not Useful
        private int numberOfCustomersServed;....Not Useful
        private int numberOfTransactions;.......Not Useful
        private String supervisorID;............Not Useful

    */


    //--------------------------------------------------------------
    // Structural instance variables
    //--------------------------------------------------------------  

    //Test

    public static ArrayList<Customer>test_customers= new ArrayList<Customer>();
    
    //An array List of size 0 intended to contain  all customers.

    private ArrayList<Customer>customers= new ArrayList<Customer>();

        //The following methods are highly likely to be thrown to a service  (Interface)

        /**
         * @return This will return a full list of cutomers that Teller has access to. 
         */
        public ArrayList <Customer> get_customers ()
        {

            return customers;

        }

        /**
         * 
         * @param customers An array of customers used to initialize the ArrayList customers.
         */
        public void set_Customers(Customer [] customers)
        {
            for(int i=0; i<customers.length;i++)
            {
                this.customers.add(customers[i]);
            }

        }

        /**
         *  This method deletes all the customers already put in the Customers Array List. 
         */
        public void clearCustomers()
        {

            customers.clear();
        }


        // Adds customer objects to the Array List.
        public void addCustomer(Customer customer)
        {
            this.customers.add(customer);
        }

        // Removes customer objects from the Array List.
        public void removeCustomer(int index) 
        {
            customers.remove(index);
        }

        // Picks out customer elements from the arrayList 
        public Customer getCustomer(int index)
        {
            return customers.get(index);
        }

    
    //--------------------------------------------------------------
    // Constructors of Teller Objects
    //--------------------------------------------------------------   
    
   //Default Contstructor.
    public Teller ()
    {

    }

    /**
     * CONSTRUCTOR  1
     * @param firstName Teller first Name
     * @param lastName  Teller Last Name
     * @param employeeID Teller's employee ID
     */

    public Teller(String firstName, String lastName, String employeeID )
    {
        set_firstName(firstName);
        set_lastName(lastName);
        set_employeeID(employeeID);
    }

    /**
     * Constructor 2
     * @param salary salary of teller. We are not including other parameter variables because they have already 
     * been defined in the previous constructor 1.
     */
    public Teller(String firstName, String lastName, String employeeID, double salary, Customer[]customers )
    {
        set_firstName(firstName);
        set_lastName(lastName);
        set_employeeID(employeeID);
        set_salary(salary);
        set_Customers(customers);


    }

    /**
     * CONSTRUCTOR 3
     * @param firstName Teller's first name
     * @param lastName  Teller's last Name
     * @param employeeID  Teller's Employee ID
     * @param salary ......Tellers Salary.
     * @param contactNumber Tellers's contact number 
     * @param startDate .....Teller's date of starting work 
     * @param endDate ........Teller's  date of Ending work
     * @param fullTime ........ Are they full timne or not
     * @param educationLevel .... Their Level of Education.
     * @param yearsOfExperience ... Their Years of Experience
     * @param nationalID ........... Their national ID number
     * @param password ............. Their password to gain access to the system 
     * @param customers ............. An ArrayLiST OF Customers that this Teller has control over. 
     */

    public Teller(String firstName, String lastName, String employeeID, double salary, 
    int contactNumber,  boolean fullTime, String educationLevel, 
    int yearsOfExperience, String nationalID, String password, Customer[] customers)
    {
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

        set_Customers(customers);
        
    }

    /**
     * CONSTRUCTOR 4: A copy constructor
     * @param other an already instanciated Teller object
     */

    public Teller (Teller other) 
    {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.contactNumber = other.contactNumber;
        this.salary = other.salary;
        this.fullTime = other.fullTime;
        this.educationLevel = other.educationLevel;
        this.yearsOfExperience = other.yearsOfExperience;
        this.employeeID = other.employeeID;
        this.nationalID = other.nationalID;
        this.password = other.password;

        // Customers possessed by the Teller included.

        this.customers=other.customers;
    }

    //--------------------------------------------------------------
    // Methods of Teller Objects 
    //--------------------------------------------------------------  


    /**
     * 
     * @return This method enables the teller ton generate a new customer object. 
     * A scanner has been use to allow the Teller enter the instance variable necessary to create a Customer object. 
     */

    public Customer createNewCustomer()
    {

        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        
        Boolean isActive;
        String password;

        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter firstName");
        firstName= in.nextLine();

        
        System.out.println("Enter lastName");
        lastName= in.nextLine();
        
        System.out.println("Enter email");
        email= in.nextLine();

        System.out.println("Enter phone number");
        phoneNumber=in.nextLine();

        System.out.println("Is this Customer active?");
        isActive=in.nextBoolean();
        in.nextLine();

        System.out.println("Enter password");
        password= in.nextLine();

        Customer newCustomer= new Customer(firstName,lastName,email,phoneNumber,null, isActive,password);
        in.close();
        return newCustomer;
        
    }
    

    /**
     * 
     * @param receiver the customer receiving money 
     * @param sender    the customer sending money 
     * @param amount  ammount being trasfered 
     * @param log ....  A log of events ???
     * @param receiverLog... Alog of events  ???
     * @param original_accountIndex   The exact position in the original account in an array of accounts owned by the sender.
     * @param destination_accountIndex The exact position in the original account in an array of accounts owned by the receiver.
     * @return returns a balance in the senders account. 
     */


    public double transferFunds(Customer receiver, Customer sender, double amount, String[] log, String [] receiverLog, int original_accountIndex, int destination_accountIndex)
    {
        
        //Initiating Customer account 
        Account initiating=sender.getAccounts().get(original_accountIndex);  //How can we more generally indentify accounts tho???

        //Receiving Customer Account
        Account receiving=  receiver.getAccounts().get(destination_accountIndex);

        //Process
        initiating.withdraw(amount, log);
        receiving.deposit(amount, log);  // Is it similar Log, Devin??

        return initiating.getBalance();

    }

    /**
     * 
     * @param customer The individual who wants their account to be deleted. 
     * @param accountIndex the  index referering to the specific account ehy want deleted.
     */


    public void deleteAccount(Customer customer, int accountIndex)
    {
        Account target_account =customer.getAccounts().get(accountIndex);

        target_account=null;

        // Garbage collector will take care of the rest from here. 

    }

    /**
     * 
     * @param customer the customer who intends to know their Balance. 
     * @param acccountIndex The account wwhose balancew they intend to know. 
     * @return returns the balance of that account. 
     */

    public double findCustomerBalance( Customer customer, int acccountIndex)
    {
    
        Account targeAccount=customer.getAccounts().get(acccountIndex);

        double accountBalance= targeAccount.getBalance();

        return accountBalance;
    }


    /**
     * 
     * @param customer The customer who wants their funds withdrwan 
     * @param acccountIndex The specific account from which they want the funds to be withdrwan 
     * @param log      A log of events that took place
     * @return returns the current balance. 
     */


    public double withdrawCustomerFunds(Customer customer, int acccountIndex, String[] log)
    {

        Account targetAccount= customer.getAccount(acccountIndex);

        double currentBalance= targetAccount.withdraw(acccountIndex, log);

        return currentBalance;
    }


    /**
     * 
     * @param customer The customer who wanted their funds deposited.
     * @param acccountIndex The specific account to which they want the funds deposited. 
     * @param log      A log of events that took place
     * @return returns the new balance. 
     */

    public double depositCustomerFunds(Customer customer, int acccountIndex, double ammount, String[] log)
    {
        Account targetAccount= customer.getAccount(acccountIndex);

        double newBalance= targetAccount.deposit(ammount, log);

        return newBalance;

    }
}
