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
public class FighterTest {
    
    public FighterTest() {
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
    
    
    //-----------------------------------------------------------------------
    // Star wars phase 02 method tests
    //-----------------------------------------------------------------------
    
     
    /**
     * Test of gettauntPhrase method, of class Fighter.
     */
     
    @Test
    public void testtauntMethod_Console_printout_must_Equal_the_phrase_you_are_dead() {
        //setup
        ByteArrayOutputStream printedPhrase= new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedPhrase));
        Fighter testFighter09 = new Fighter("Walking","Dead",64,"M",new Force(85,"Dark"),"you are dead");
        
        //Excecute 
        testFighter09.taunt();
        
        //Expected printout
        String expResult = "you are dead";
        
        //Retrived printouts
        String result= printedPhrase.toString().trim();
        
        //Assert
        assertEquals(expResult,result);
            
    }

    /**
     * Test of the static method fight, of class Fighter.
     * Case 1: Light and Dark. Dark Stronger.
     */
    @Test
    public void testfightMethod_Dark_Stronger_John_should_win_over_Escobar()
    {
    //setup
    ByteArrayOutputStream printedPhrase01= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase01));
    
    Fighter bigG22=new Fighter("John",22,"M",new Force(81,"Dark"), "I have come here to chew bubble gum and kick butts.");
    Fighter bigG23=new Fighter("Pablo", "Escobar",43,"M",new Force(80,"Light"), "I'll be back");
    
    //Execute
    Fighter.fight (bigG22,bigG23);
    
    //Expected printout
    String expResult01="John fights Pablo Escobar and John wins! John then gloats: I have come here to chew bubble gum and kick butts.";
        
    //Retrived printouts
    String result01= printedPhrase01.toString().trim();
        
    //Assert
    assertEquals(expResult01,result01);
    
    }
    
    
    /**
     * Test of the static method fight, of class Fighter.
     * Case 2: Light and Dark. Light Stronger 
     */
    @Test
    public void testfightMethod_Light_Stronger_Makosa_should_win_over_Brook()
    {
    //setup
    ByteArrayOutputStream printedPhrase02= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase02));
    
    Fighter bigG24=new Fighter("Brook","Suleimani",22,"M",new Force(62,"Dark"), "Go home, looser!");
    Fighter bigG25=new Fighter("Makosa",43,"M",new Force(68,"Light"), "You throw punches like you are swatting flies at a picnic.");
    
    //Execute
    Fighter.fight (bigG24,bigG25);
    
   
    //Expected printout
    String expResult02="Makosa fights Brook Suleimani and Makosa wins! Makosa then gloats: You throw punches like you are swatting flies at a picnic.";
        
    //Retrived printouts
    String result02= printedPhrase02.toString().trim();
        
    //Assert
    assertEquals(expResult02,result02);
    } 
    
    
    /**
     * Test of the static method fight, of class Fighter.
     * Case 3: Light and Light. Both have same strength level  
     */
    @Test
    public void testfightMethod_Light_And_Light_Same_Strength_NoFightingOccurs()
    {
    //setup
    ByteArrayOutputStream printedPhrase03= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase03));
    
    Fighter bigG26=new Fighter("Brunta",29,"M",new Force(62,"Light"), "Wassup, homie.Wasssuuup!");
    Fighter bigG27=new Fighter("Mathew",34,"M",new Force(62,"Light"), "Come back when you''ve learnt how to fight");
    
    //Execute
    Fighter.fight (bigG26,bigG27);
   
    //Expected printout
    String expResult03="Both Brunta and Mathew are twins in the Light side of force.And therefore cannot fight.Both have strength of 62";
        
    //Retrived printouts
    String result03= printedPhrase03.toString().trim();
        
    //Assert
    assertEquals(expResult03,result03);
    
    }
    
    /**
     * Test of the static method fight, of class Fighter.
     * Case 4: LLight and Light. One light Stronger.  
     */
    @Test
    public void testfightMethod_Light_And_Light_Moses_Stronger()
    {
    //setup
    ByteArrayOutputStream printedPhrase04= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase04));
    
   Fighter bigG28=new Fighter("Moses",29,"M",new Force(79,"Light"), "You are a joke!");
   Fighter bigG29=new Fighter("Judas",34,"M",new Force(62,"Light"), "My lil baybee.");
    
    //Execute
    Fighter.fight (bigG28,bigG29);
   
    //Expected printout
    String expResult04="Moses is stronger in the Light side  of force than Judas";
        
    //Retrived printouts
    String result04= printedPhrase04.toString().trim();
        
    //Assert
    assertEquals(expResult04,result04);
    
    } 
    
    /**
     * Test of the static method fight, of class Fighter.
     *Case 5: Dark and Dark. Both have same strength level  
     */
    @Test
    public void testfightMethod_Dark_And_Dark_Same_Strength_NoFightingOccurs()
    {
    //setup
    ByteArrayOutputStream printedPhrase05= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase05));
    
    Fighter bigG30=new Fighter("Lavenda",29,"F",new Force(40,"Dark"), "Yoooow!");
    Fighter bigG31=new Fighter("Joshua",34,"M",new Force(40,"Dark"), "Count all the stars!");
    
    //Execute
    Fighter.fight (bigG30,bigG31);
   
    //Expected printout
    String expResult05="Both Lavenda and Joshua are twins in the Dark side of force.And therefore cannot fight.Both have strength of 40";
        
    //Retrived printouts
    String result05= printedPhrase05.toString().trim();
        
    //Assert
    assertEquals(expResult05,result05);
    
    } 
    
    
    /**
     * Test of the static method fight, of class Fighter.
     * Case 6:Dark and Dark. One Dark Stronger.  
     */
    @Test
    public void testfightMethod_Dark_And_Dark_Mercy_Stronger()
    {
    //setup
    ByteArrayOutputStream printedPhrase06= new ByteArrayOutputStream();
    System.setOut(new PrintStream(printedPhrase06));
    
    Fighter bigG32=new Fighter("Mercy",36,"F",new Force(72,"Dark"), "Better find your match next time");
    Fighter bigG33=new Fighter("Melvin",19,"F",new Force(40,"Dark"), "Who told you you were gonna beat me!");
    
    //Execute
    Fighter.fight (bigG32,bigG33);
   
    //Expected printout
    String expResult06="Mercy is stronger in the Dark side  of force than Melvin";
        
    //Retrived printouts
    String result06= printedPhrase06.toString().trim();
        
    //Assert
    assertEquals(expResult06,result06);
    
    }
    
}
