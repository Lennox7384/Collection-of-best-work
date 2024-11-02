/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project.pkg1.star.wars;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;




/**
 *
 * @author Cobber
 */
public class ForceTest {
    
    public ForceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    //--------------------------------------------------
    //Round 2 Testings. Phase 02
    //-------------------------------------------------
    
       
    /**
     * Test of setStrength method.
     * 52 SHOULD work because it is within the limits of 1 to 100. 
     */
    @Test
    public void test_SetStrength_method_Strength_of_ordinary_fighters_must_between_1_and_99_inThisCase_52 () {
        
        // set up test
        Fighter bigG24=new Fighter("Brook","Suleimani",22,"M",new Force(52,"Dark"), "Go home, looser!");
                                                //Remember the constructor  calls the setStrength, and set_sideOfForce methods 
                                                //to initialise the corresponding instance variables Strength and sideOfForce
                                                // so we don't need to explicitly call the methods themselves.
                                                // Every attempt of creating an instance of the Force class, gets the methods running.
                                                
        
        // Store the values of properties in corresponding varibles
        //You can use a helper method you created.
        int result =bigG24.getInherentForce().strength_verifier();
        int expresult = 52;
        
      
        //Run and compare 
        assertTrue(result==expresult);
       
    } 
    
      /**
     * Test of setStrength method.
     * 0 is out of the limits and should be properly handled
     */
    @Test
    public void test_SetStrength_method_Strength_of_all_fighters_must_not_be_below_0 () {
        
        // set up test
        Fighter bigG77=new Fighter("Brook","Suleimani",22,"M",new Force(-9,"Dark"), "Go home, looser!");
                                                //Remember the constructor  calls the setStrength, and set_sideOfForce methods 
                                                //to initialise the corresponding instance variables Strength and sideOfForce
                                                // so we don't need to explicitly call the methods themselves.
                                                // Every attempt of creating an instance of the Force class, gets the methods running.
                                                
        
        // Store the values of properties in corresponding varibles
        //You can use a helper method you created.
        int result =bigG77.getInherentForce().strength_verifier();
        int expresult =-9;
        
      
        //Run and compare 
        assertTrue(result==expresult); // Note this will be an error and the error will be properly handled.
       
    }  
    
        
      /**
     * Test of setStrength method.
     * 110 is out of the limits and should be properly handled
     */
    @Test
    public void test_SetStrength_method_Strength_of_all_fighters_must_not_be_above_100 () {
        
        // set up test
        Fighter bigG90=new Fighter("Brook","Suleimani",22,"M",new Force(110,"Dark"), "Go home, looser!");
                                                //Remember the constructor  calls the setStrength, and set_sideOfForce methods 
                                                //to initialise the corresponding instance variables Strength and sideOfForce
                                                // so we don't need to explicitly call the methods themselves.
                                                // Every attempt of creating an instance of the Force class, gets the methods running.
                                                
        
        // Store the values of properties in corresponding varibles
        //You can use a helper method you created.
        int result =bigG90.getInherentForce().strength_verifier();
        int expresult =110;
        
      
        //Run and compare 
        assertTrue(result==expresult); // Note this will be an error and the error will be properly handled.
       
    }  
    
  


//-------------------------------------------------------
//Second round of testing of methods.
//-------------------------------------------------------

    

    /**
     * Test of influence method, of class Force.
     * case 1: Fighter (randomFighter01) has a strength greater than 59, and only firstName. The strength is 92.
     */
    @Test
    public void testInfluence_fighterWithOnlyFirstName_and_strength_greater_than_59_should_pass() {
        //setup
        
       
        ByteArrayOutputStream result01= new ByteArrayOutputStream();
        System.setOut(new PrintStream(result01));
        
        Fighter randomFighter01 = new Fighter("Jayce",46,"M",new Force(92,"Light"), "You are nothing but a clown");
        String target = "bigRock";
        
        //Excecute
        Force.influence(randomFighter01, target);
        
        //Quick processing 1 (expected results)
        String randomFighter01Name =("Jayce");
        String randomFighter01expPhraseOne=(" ensures ");
        String randomFighter01expPhraseTwo=(".These aren't the droids they are looking for");
        
 
        //Expected printout 1
        String expResult01= (randomFighter01Name+randomFighter01expPhraseOne+target+randomFighter01expPhraseTwo); 
        
        //Retrived printouts
        String consoleOutput01= result01.toString().trim();
        
        //Consolidation 
        
        String expResult=(expResult01);
        String result=(consoleOutput01);
        
        //Assert
        assertEquals(expResult,result);
        
    
    }
    
    
    /**
     * case 2: Fighter (randomFighter02)  has a  strength less than 60.The strength is 50.
     * They must fail to influence the target.
     */
    
    @Test
    public void testInfluence_strength_less_than_60_should_fail_to_influence_the_target() {
   
        ByteArrayOutputStream result02= new ByteArrayOutputStream();
        System.setOut(new PrintStream(result02));
        
        Fighter randomFighter02 = new Fighter("Grace", "Gloria",32,"F",new Force(50,"Dark"), "I am just getting started");
        String target = "bigRock";
        
        //Execute
         Force.influence(randomFighter02, target);
        
        //Quick processing 2 (expected results)
        String randomFighter02firstName =("Grace ");//If re-testing with a new name, remember to and space and the end of first name at this point
        String randomFighter02lastName=("Gloria");
        String randomFighter02expPhrase=(" fails to influence ");
        
        //Expected printout 2
        String expResult02=(randomFighter02firstName+randomFighter02lastName+randomFighter02expPhrase+target);
        
        //Retrived printouts
        
        String consoleOutput02= result02.toString().trim();
        
        //Consolidation 
        
        String expResult=(expResult02);
        String result=(consoleOutput02);
        
        //Assert
        assertEquals(expResult,result);
    
    }
    /**
     * Case 3: Absurdly large strength should fail to generate relevant result.
     * The error has been handled with care.
     */
    
    @Test
    public void testInfluence_absurdly_large_strengths_anythingAbove100_should_fail_to_produce_relevant_result() {
   
        ByteArrayOutputStream result02= new ByteArrayOutputStream();
        System.setOut(new PrintStream(result02));
        
        Fighter randomFighter02 = new Fighter("Grace", "Gloria",32,"F",new Force(150,"Dark"), "I am just getting started");
        String target = "bigRock";
        
        //Execute
         Force.influence(randomFighter02, target);
        
        //Quick processing 2 (expected results)
        String randomFighter02firstName =("Grace ");//If re-testing with a new name, remember to and space and the end of first name at this point
        String randomFighter02lastName=("Gloria");
        String randomFighter02expPhrase=(" fails to influence ");
        
        //Expected printout 2
        String expResult02=(randomFighter02firstName+randomFighter02lastName+randomFighter02expPhrase+target);
        
        //Retrived printouts
        
        String consoleOutput02= result02.toString().trim();
        
        //Consolidation 
        
        String expResult=(expResult02);
        String result=(consoleOutput02);
        
        //Assert
        assertEquals(expResult,result);
    
    }
    
    /**
     * Test of moveObject method, of class Force.
     * Case 1: Fighter (objectMover) has a force strength greater than 59, and only firstName. The force strength is: 64
     **/
    @Test
    public void testMoveObject_forceGreaterThan_59_should_Fling_target_across_the_room() 
    {
    
       ByteArrayOutputStream result01= new ByteArrayOutputStream();
       System.setOut(new PrintStream(result01));
        
       Fighter objectMover01 = new Fighter("Jacob",19,"M",new Force(64,"Dark"), "You are a little toddler");
       String target = "bigRock";
       
       //Excecute
        Force.moveObject(objectMover01,target);
        
       //Quick processing 1 (expected results)
        String objectMover01Name =("Jacob");
        String objectMover01expPhraseOne=(" flings ");
        String objectMover01expPhraseTwo=(" across the room!");
        
       //Expected Printout 1
       
       String expResult01=(objectMover01Name+objectMover01expPhraseOne+target+objectMover01expPhraseTwo);
    
      //Retrieved printouts
      String consoleOutput01= result01.toString().trim();
    
      //Consolidation 
        
      String expResult=(expResult01);
      String result=(consoleOutput01);
      
      //Assert
      assertEquals(expResult,result);
    
    }
 

    /**
     * Test of moveObject method, of class Force.
     *Case 2: Fighter (objectMover) has a force of Strength less than 60, and both first name and last name. The force here is: 52
     **/
    @Test
    public void testMoveObject_fighterForce_Is_lessThan_60_target_must_be_unMovable() {
        
       ByteArrayOutputStream result02= new ByteArrayOutputStream();
       System.setOut(new PrintStream(result02));
        
       Fighter objectMover02 = new Fighter("Arnold", "GreenHat",37,"M",new Force(52,"Light"), "You fight like a toddler");
       String target = "bigRock";
       
      //Excecute
      Force.moveObject(objectMover02,target);
     
        
      //Quick processing 1 (expected results)
      String objectMover02firstName =("Arnold "); //If re-testing with a new name, remember to and space and the end of first name at this point
      String objectMover02secondName=("GreenHat");
      String objectMover02expPhraseOne=(" is unmovable by ");
      String objectMover02expPhraseTwo=(".");
        
      //Expected printout 2
      String expResult02=(target+objectMover02expPhraseOne+objectMover02firstName+objectMover02secondName+objectMover02expPhraseTwo);
        
      //Retrived printout
      String consoleOutput02= result02.toString().trim();
       
      //Consolidate
      String result=(consoleOutput02);
      String expResult=(expResult02);
        
      //Assert
      assertEquals(expResult,result);
        
    }
    
    /**
     * Case 3: Absurd force level, in this case way below zero.
     * Error is generated, the error is handled with care.
     */
    
      @Test
    public void testMoveObject_fighterForce_Is_absurdly_below_zero_error_should_appear_and_handled_nicely() {
        
       ByteArrayOutputStream result02= new ByteArrayOutputStream();
       System.setOut(new PrintStream(result02));
        
       Fighter objectMover666 = new Fighter("Arnold", "GreenHat",37,"M",new Force(-520,"Light"), "You fight like a toddler");
       String target = "bigRock";
       
      //Excecute
      Force.moveObject(objectMover666,target);
     
        
      //Quick processing 1 (expected results)
      String objectMover02firstName =("Arnold "); //If re-testing with a new name, remember to and space and the end of first name at this point
      String objectMover02secondName=("GreenHat");
      String objectMover02expPhraseOne=(" is unmovable by ");
      String objectMover02expPhraseTwo=(".");
        
      //Expected printout 2
      String expResult02=(target+objectMover02expPhraseOne+objectMover02firstName+objectMover02secondName+objectMover02expPhraseTwo);
        
      //Retrived printout
      String consoleOutput02= result02.toString().trim();
       
      //Consolidate
      String result=(consoleOutput02);
      String expResult=(expResult02);
        
      //Assert
      assertEquals(expResult,result);
        
    }  
       
}
