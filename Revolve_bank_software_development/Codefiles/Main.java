/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.BoxLayout;

/**
 *
 * @author devinknecht
 */
public class Main {

    //------------------------------------------
    //  static variables of the BANK Branch 
    //------------------------------------------

    private static  int FRAME_WIDTH=400;
    private static  int FRAME_HEIGHT=400;
    private static String BANKNAME="Revolve Bank Moorhead Branch Coorporate Summary";
    private static String BANK_MANAGER_NAME="Hannah";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        



    //-----------------------------------------------------------------------------
    //Creation of 5 Customer Objects. 
    // We have decided to not included date of Birth as it bring about complications
    //------------------------------------------------------------------------------
    

        //Dedicated Customers. 
    
        Customer ella=new Customer("Ella","Olivia","ea@gmail.com","xxx-xxx",new Date(), true,"1234");
        Customer liam=new Customer("Liam","James","lg@gmail.com","xxx-xxx", new Date(),true,"1234");
        Customer sophia=new Customer("Sophia","Noah","sn@gmail.com","xxx-xxx",new Date(),true,"1234");
        Customer ava=new Customer("Ava","Isabella","aI@gmail.com","xxx-xxx",new Date(),true,"1234");
        Customer emma=new Customer("Emma","Kate","ek@gmail.com","xxx-xxx",new Date(),true,"1234");

        // Put the customers in an array called customers List
         Customer [] customersList= {ella,liam,sophia,ava,emma};

        //Dedicated Tellers

        Teller blake= new Teller("Blake", "Alexander", "333-333", 4000, 54321, false, "College", 5, "America", "1234", customersList);
        Teller camila=new Teller ("Camila","Grace","444-444",3000, 3434356,true,"College",6,"America","1234",customersList);

        // Put the Tellers in an array called tellers List
        Teller [] tellersList= {blake,camila};


        //2D Arrays of type String, for History of activities in each account. 

        String[][]ellasHistory= new String[10][10];
        String[][]ellasHistory1= new String[10][10];

        String[][] liamsHistory=new String [10][10];
        String[][] liamsHistory1=new String [10][10];

        String[][] sophiasHistory=new String [10][10];
        String[][] sophiasHistory1=new String [10][10];

        String[][] avasHistory=new String [10][10];
        String[][] avasHistory1=new String [10][10];


        String[][] emmasHistory=new String [10][10];
        String[][] emmasHistory1=new String [10][10];



        //To help with customer trasactions 
        String[]senderLog= new String[5];
        String[]receiverLog= new String[5];

        //Each customer has got multiple accounts

        
            //Ellas accounts: 
            Account ella_account01= new Account("Ella",0001,20000,ellasHistory,5,20);
            Account ella_account02= new Account ("Ella",0002,30000,ellasHistory1,5,20);
            Account ella_account03= new Account ("Ella",0002,30000,ellasHistory1,5,20);
            ella.addAccount(ella_account01);
            ella.addAccount(ella_account02);
            ella.addAccount(ella_account03);
            

        
            //Liams Accounts
            Account liam_account01= new Account("Liam",0001,50000,liamsHistory,5,20);
            Account liam_account02= new Account ("Liam",0002,90000,liamsHistory1,5,20);

            liam.addAccount(liam_account01);
            liam.addAccount(liam_account02);

            //Sophias Accounts
            Account sophia_account01= new Account("Sophia",0001,34712,sophiasHistory,5,20);
            Account sophia_account02= new Account ("Sophia",0002,78532,sophiasHistory1,5,20);

            sophia.addAccount(sophia_account01);
            sophia.addAccount(sophia_account02);

            //Avas Accounts
            Account avas_account01= new Account("Avas",0001,12000,avasHistory,5,20);
            Account avas_account02= new Account ("Avas",0002,70000,avasHistory1,5,20);

            ava.addAccount(avas_account01);
            ava.addAccount(avas_account02);

            //EmmasHistory
            Account emma_account01= new Account("Emma",0001,26000,emmasHistory,5,20);
            Account emma_account02= new Account ("Emma",0002,42000,emmasHistory1,5,20);

            emma.addAccount(emma_account01);
            emma.addAccount(emma_account01);
    
        
        // Lets create an instance of a Bank Manager

        Manager hannah= new Manager();

            hannah.replaceManagerInfo("Hannah", "Elizabeth", "234567", 30000, 12342323, true, "College", 10,"121212", "1234",  customersList, tellersList);


        //Let's create a bank branch now.

        BankBranch revolveMoorhead= new BankBranch("RevolveMoorhead", "Moorhead", 901,hannah);


        //-----------------------------------------------------------------
        // Nopw lets test out the methods based on the above buid up
        //-----------------------------------------------------------------


      System.out.println(blake.get_salary());

        
        System.out.println("This bank has a total of "+hannah.getNumCustomers()+ " Customers.");
        System.out.println("This bank has a total of "+ hannah.getNumTellers()+ " Tellers");


        System.out.println("Total tellers salaries ammount to "+ revolveMoorhead.total_TellerSalaries(hannah));

        System.out.println("Total expenditure of the Bank is "+ revolveMoorhead.total_BankExpenditure());
        System.out.println();

        System.out.println("Below is a list of customers and the money they have in each of their accounts");
        revolveMoorhead.get_CustomerNames_and_theirAccount_balances(hannah);

        System.out.println("The total revenue at the Bank is: "+ revolveMoorhead.total_Revenue(hannah));


        //------------------------------------------------------------
        //  Money trasfer
        //------------------------------------------------------------
    
        blake.transferFunds(liam,ella,1000,senderLog,receiverLog,0,0);


        System.out.println(liam.getAccount(0).getBalance());
        System.out.println(ella.getAccount(0).getBalance());


        blake.depositCustomerFunds(emma, 0, 20000, receiverLog);
        System.out.println(ella.getAccount(0).getBalance());



        //--------------------------------------------------------------
        //Bank GRAPHICAL USER INTERFACE 
        //--------------------------------------------------------------

        
        JFrame branchFrame= new JFrame(BANKNAME);
        branchFrame.getContentPane().setBackground(Color.GRAY);
       
        //List oF JButtons that run methods of the bank branch 

        JButton totalTellerSalary_button= new JButton("Total Teller salaries");
        JButton managerSalary_button=new JButton("Salary of manager");
        JButton totalBankExpenditure_Button= new JButton("Bank Expenditure");
        JButton bankRevenue_Button=new JButton("Bank revenue");

        JButton listOfCustomers_and_theirAccountBalances= new JButton("All customers and their account balances");

        //The lables for displaying resuls 

        JLabel totalTellerSalary_label= new JLabel();
        JLabel managerSalary_label= new JLabel();
        JLabel bankExpenditure_label= new JLabel();
        JLabel bankRevenue_Label= new JLabel();
        
        //A panel that holds buttons and labels
        // The code below detaches the buttons from the Frame.In other words, you can resize the frame without affecting the size of the buttons. 

        JPanel bankBranchPanel=new JPanel(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();

        // This panel will hold Customers and the balances int htheir accounts

        JPanel customerPanel=new JPanel();
        customerPanel.setLayout(new BoxLayout(customerPanel, BoxLayout.Y_AXIS));

        //JTable to hold customers ad their balances

        String[] columnNames= {"Customers","ACC1","ACC2","ACC3","ACC4","ACC5"};

        //Now bring in the customers and their balances
        
        String[][] customerData=revolveMoorhead.get_CustomerNames_and_theirAccount_balances(hannah);

        DefaultTableModel model= new DefaultTableModel(customerData,columnNames);

        JTable customerDataTable=new JTable(model);

        //-----------------------------------------------
        // Action Listener to the list of customers button
        //------------------------------------------------

        listOfCustomers_and_theirAccountBalances.addActionListener(e->
        {
            JOptionPane.showMessageDialog(branchFrame,new JScrollPane(customerDataTable),"Summary of Customers data",JOptionPane.PLAIN_MESSAGE);
  
        });

        // Add componets to customerpanel

        customerPanel.add(listOfCustomers_and_theirAccountBalances);
        customerPanel.add(Box.createVerticalStrut(10));
 
        gbc.insets =new InsetsUIResource(3, 3, 3, 3);// Adding some spacing around the componenets.
        gbc.anchor=GridBagConstraints.WEST;

        //Order matters here, just so you remember while looking back. 

        gbc.gridx=0;
        gbc.gridy=0;
        bankBranchPanel.add(totalBankExpenditure_Button,gbc);

        gbc.gridx=1;
        bankBranchPanel.add(bankExpenditure_label,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        bankBranchPanel.add(managerSalary_button,gbc);

        gbc.gridx=1;
        bankBranchPanel.add(managerSalary_label,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        bankBranchPanel.add(totalTellerSalary_button,gbc);

        gbc.gridx=1;
        bankBranchPanel.add(totalTellerSalary_label,gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        bankBranchPanel.add(bankRevenue_Button,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        bankBranchPanel.add(bankRevenue_Label, gbc);

        bankBranchPanel.setBackground(Color.green);

        //This below, puts all the components together in the Frame. 
        branchFrame.add(bankBranchPanel,BorderLayout.NORTH);
        branchFrame.add(customerPanel);


        //Adding Listeners 

        //Expenditure Listener.
        totalBankExpenditure_Button.addActionListener(e->
        {

            bankExpenditure_label.setText("Total money flowing out of the Bank "+ revolveMoorhead.total_BankExpenditure());

        });

        //Teller Salary Listener

        totalTellerSalary_button.addActionListener(e->
        {
            totalTellerSalary_label.setText("Combined Tellers salary is "+ revolveMoorhead.total_TellerSalaries(hannah));

        });


        //Manager Salary Listener

        managerSalary_button.addActionListener(e->
        {
            managerSalary_label.setText("Manager's Salary is " + revolveMoorhead.branchManagerSalary());
        });

        //Revenue Listener

        bankRevenue_Button.addActionListener(e->
        {

            bankRevenue_Label.setText("This bank currently has " +revolveMoorhead.total_Revenue(hannah));
        });

        //Finish Constructing Frame

        branchFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        branchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        branchFrame.setVisible(true);


























        /** * 
        // Bank Account Tests
        Account devinAccount = new Account (12345, 1000);
        String[] logPlaceholder = {""};
        System.out.println("balance: " + devinAccount.deposit(-100, logPlaceholder));
        System.out.println("balance: " + devinAccount.deposit(100, logPlaceholder));
        System.out.println("balance: " + devinAccount.withdraw(-100, logPlaceholder));
        System.out.println("balance: " + devinAccount.withdraw(100, logPlaceholder));
        System.out.println("balance: " + devinAccount.withdraw(1100, logPlaceholder));
        
        System.out.println();
        
        devinAccount.freeze();
        System.out.println("balance: " + devinAccount.deposit(100, logPlaceholder));
        System.out.println("balance: " + devinAccount.withdraw(100, logPlaceholder));
        Account lennoxAccount = new Account (23456, 1000);
        System.out.println("Lennox's balance: " + lennoxAccount.getBalance());
        System.out.println("Devin's balance: " + devinAccount.transfer(lennoxAccount, 100, logPlaceholder, logPlaceholder));
        System.out.println("Lennox's balance: " + lennoxAccount.getBalance());
        devinAccount.thaw();
        System.out.println("Lennox's balance: " + lennoxAccount.getBalance());
        System.out.println("Devin's balance: " + devinAccount.transfer(lennoxAccount, 100, logPlaceholder, logPlaceholder));
        System.out.println("Lennox's balance: " + lennoxAccount.getBalance());
        
        System.out.println();
        devinAccount.applyInterest();
        System.out.println("balance: " + devinAccount.getBalance());
        
        // Loan Tests
        Loan devinLoan = new Loan (12345, 10000, 200, 10);
        System.out.println("owed: " + devinLoan.deposit(-100, logPlaceholder));
        System.out.println("owed: " + devinLoan.deposit(100, logPlaceholder));
        
        System.out.println("owed: " + devinLoan.deposit(100, logPlaceholder));
        System.out.println("owed: " + devinLoan.periodCheck());
        System.out.println("owed: " + devinLoan.deposit(2000, logPlaceholder));
        System.out.println("owed: " + devinLoan.periodCheck());
        
        System.out.println("balance after transfer: " + devinAccount.transferToLoan(devinLoan, 100, logPlaceholder, logPlaceholder));
        System.out.println("owed after transfer: " + devinLoan.getBalance());
        System.out.println("owed: " + devinLoan.withdraw(100, logPlaceholder));

        //------------------------------------
        /Github test
        //----------------------------------------
        /
        */
    }
    
}
