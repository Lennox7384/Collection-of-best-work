
public class BankBranch {

//-------------------------------------------
// All the static variables
//-------------------------------------------



    //---------------------------------------------
    // Bank Branch Instance variables 
    //---------------------------------------------
   
    private String branchName;

        public String get_branchName() //What is the branch name
        {
            return branchName;
        }

        public void set_branchName(String branchName)
        {
            this.branchName=branchName;
        }
    
    private String branchLocation; //Where is the physical location of the branch

    public String get_branchLocation()
    {
        return branchLocation;
    }

    public void set_branchLocation(String branchLocation)
    {
        this.branchLocation=branchLocation;
    }


    private int branchIDCode; //Probably needs to be a final or smth

    public int get_branchIDCode()
    {
        return branchIDCode;
    }

    public void set_branchIDCode(int branchIDCode)
    {
        this.branchIDCode=branchIDCode;
    }


    private Manager branchManager; //every branch must have an object of the manager class as its instance varaible

    public Manager get_branchManager()
    {
        return this.branchManager;
    }

    public void set_branchManager(Manager branchManager)
    {
        this.branchManager=branchManager;
    }   



    //---------------------------------------------
    // Bank Branch Constructors
    //---------------------------------------------

    //Default constructor
    public BankBranch()
    {

    }

    //Constructor 1

    public BankBranch(String branchName, String branchLocation, int branchIDCode)
    {
        this.set_branchName(branchName);
        this.set_branchLocation(branchLocation);
        this.set_branchIDCode(branchIDCode);

    }

    //Constructor 2 (Full constructor)

    public BankBranch(String branchName, String branchLocation, int branchIDCode, Manager branchManager)
    {
        this.set_branchName(branchName);
        this.set_branchLocation(branchLocation);
        this.set_branchIDCode(branchIDCode);
        this.set_branchManager(branchManager);

    }


    //---------------------------------------------
    // Bank Branch Methods
    //---------------------------------------------

    

    //Processing the Money flowing out of the Bank: 

    /**
     * 
     * @param branchManager the manager of this branch of the bank 
     * @return returns the salary of the cummulative salaries of alll tellers of the Bank. 
     */

    public double total_TellerSalaries( Manager branchManager)
    {
       double totalsalaries_Tellers=0;

       for(int i=0; i<branchManager.getTellers().size();i++)
       {
            totalsalaries_Tellers+=branchManager.getTellers().get(i).get_salary();
       }

       return totalsalaries_Tellers;
    }



    /**
     * 
     * @return returns the salary of the manager of this bank branch. 
     */

    public double branchManagerSalary()
    {
        double managerSalary=branchManager.get_salary();

        return managerSalary;

    }

    /**
     *  This is a simple simulation of money flowing out of the Bank 
     * @return  returns the total ammount paid to both the Tellers and the Bank Manager. 
     */

    public double total_BankExpenditure()
    {

        double bankExpenditure= branchManagerSalary()+total_TellerSalaries(branchManager);

        return bankExpenditure;
    }



    //Processign the money flowing into the bank: Total revenue.
    //This revenue ios calculataed off of total money in customer accounts.
    //Of course, its more complex than that but lets go with this for the purposes of simulation. 



    /**
     *  Returns the total money flowingn into the bank branch essentially customer acount balances. 
     * @param branchManager
     * @return
     */
    public double total_Revenue(Manager branchManager)
    {
        double  bankRevenue=0;

        for (int i=0;i< branchManager.get_customers().size();i++)
        {
                Customer customerEvent= branchManager.getCustomer(i);

                for (int ii=0;ii<customerEvent.getAccounts().size();ii++)
                {
                    Account accountEvent= customerEvent.getAccount(ii);

                    bankRevenue+=accountEvent.getBalance();

                }
        }

        return bankRevenue;

    }


    /**
     * This method prints all customers' firstnames and their bank accounts infront of their names.
     * @param branchManager
     */

    public String[][] get_CustomerNames_and_theirAccount_balances( Manager branchManager)
    {
        // Create a 2d array

        String [][] data=new String[branchManager.get_customers().size()][5];

        for(int row=0;row<data.length;row++){
        for(int col=0;col<5;col++){

        for(int j=0; j<branchManager.get_customers().size();j++)
        {
            Customer targetCustomer= branchManager.getCustomer(j);

            data[j][0]="" +targetCustomer.getFirstName();

            //System.out.println(targetCustomer.getFirstName());

            for(int ii=0; ii<targetCustomer.getAccounts().size();ii++)
            {

                data[j][ii+1]="" +targetCustomer.getAccount(ii).getBalance();

            //System.out.print(" "+targetCustomer.getAccount(ii).getBalance() + " ");
            }
            
        }

    }
    }

    return data;
       
    }

}
