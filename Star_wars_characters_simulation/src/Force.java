/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg1.star.wars;

/**
 *
 * @author lennox
 */
public class Force implements Cloneable{
   //---------------------------------------------------------------------
   // Class independent variables, methods etc that may arise
   //---------------------------------------------------------------------
    
    static String forceSide_one ="Dark";
    static String forceside_two = "Light";
    
    // these sstrings closely relate to the influence() method, and the activities around it.
    static String influencePhrase01= (" ensures ");
    static String influencePhrase02=(".These aren't the droids they are looking for");
    static String influencePhrase03=(" fails to influence ");
    
    // these  strings closely relate to the moveObject() method, and the activities around it.
    
    static String moveObjectPhrase01=(" flings ");
    static String moveObjectPhrase02=(" across the room!");
    static String moveObjectPhrase03=(" is unmovable by ");
    static String moveObjectPhrase04=(".");
    
   
    
   //---------------------------------------------------------------------
   // Instance Variables for Force class
   //---------------------------------------------------------------------
    
    private int  strength;
    
    /**
     * 
     * @return the integer stored in the instance variable strength.
     */
    
    public int getStrength ()
    {
    return strength;
    }
    
    /**
     * 
     * @param strengthLevel a number between 1 and 100  that will represents 
     * the strength of a character.
     * 
     */
    public void setStrength (int strengthLevel)
    {
    
    if (strengthLevel>100 || strengthLevel<1)
    {
       throw new ArithmeticException ("Input number is out of acceptable range.Put in a number from 1 to 100");
    }
    else 
    {
        strength=strengthLevel;
    }  
     
    
    }
    
 
    private String sideOfForce= "";
    
    /**
     * 
     * @return sideOfForce.A String either "Dark" or "Light" that
     * characterize Force
     */
    public String get_sideOfForce()
    {
     
     return sideOfForce;
    }
    
    //we might keep referring to these variables allover the project so we keep them 
    //class independent.
    
    
    
    /**
     * 
     * @param sideOfForce A number between 1 and 100 that will initialize the 
     * Instance variable sideOfForce.
     */
    
    
    
    public void set_sideOfForce(String sideOfForce)
    {
          
      if (sideOfForce.equals(forceSide_one) || sideOfForce.equals(forceside_two))
      {
        this.sideOfForce= sideOfForce; 
      }
      else 
      {
       throw new IllegalArgumentException ("sideOfForce entered does not exactly match 'Dark' or 'Light'"); // IllegalArgument exception adapted from Chat GPT 
                                                                                                              //responce to a target prompt.   
      }
     
    
    }
   
    
 
    //---------------------------------------------------------------------
    // Constructors of Force class
    //---------------------------------------------------------------------
    
    //Default constructor is not mandatory. 
    // Since I have a custom constructor, default constructor must be 
    //explicitly spelt out Incase I get to want to use it.
    
    public Force (int strength, String sideOfForce) 
    {
        setStrength(strength);
        set_sideOfForce(sideOfForce);
    
    }
   
    
    //---------------------------------------------------------------------
    // Methods of force class.
    //---------------------------------------------------------------------
    
    public int strength_verifier ()
    {
        
     int candidate_Strength=this.strength;
     
     return candidate_Strength;
    }
    
    /**
     * 
     * @return the just set instance variable sideOfForce for a Force object. 
     */
    public String sideOfForce_verifier()
    {
    String candidate_sideOfForce = this.sideOfForce;
    return candidate_sideOfForce;
    } 
    
    /**
     * 
     * @param randomFighter an instance of the class fighter
     * @param target A string defined in the project description to be part of the parameter variables.
     */
    public static void influence(Fighter randomFighter, String target)
    {
        int randomFightersStrength= randomFighter.getInherentForce().getStrength();
        
        if (randomFightersStrength>59)
        {
           if (randomFighter.getlastName()==null)
            {
                System.out.println(randomFighter.getfirstName()+influencePhrase01+ target+influencePhrase02);
            }
           else
           {
               System.out.println(randomFighter.getfirstName()+" "+randomFighter.getlastName()+influencePhrase01+ target+influencePhrase02);
           
           }
            
        }
        else // everything equal to or less than 59.
        {
            if (randomFighter.getlastName()==null)
            {
                System.out.println(randomFighter.getfirstName()+influencePhrase03+target);
            }
           else
           {
               System.out.println(randomFighter.getfirstName()+" "+randomFighter.getlastName()+influencePhrase03+target);
           
           }
            
        }
        
    }
    /**
     * 
     * @param objectMover any instance of the class fighter
     * @param target  a string defined in the project description to be part of the parameter variable here.
     */
    public static void moveObject(Fighter objectMover, String target)
    {
        int randomFighter02Strength=objectMover.getInherentForce().getStrength(); 
        
        if(randomFighter02Strength>59)
        {
            if(objectMover.getlastName()==null)
            {
                System.out.println(objectMover.getfirstName()+moveObjectPhrase01+target+moveObjectPhrase02);
            }
            else
            {
                System.out.println(objectMover.getfirstName()+" "+objectMover.getlastName()+moveObjectPhrase01+target+moveObjectPhrase02);
            }
        }
        else
        {
            if(objectMover.getlastName()==null)
            {
                System.out.println(target+moveObjectPhrase03+objectMover.getfirstName()+moveObjectPhrase04);
            }
            else
            {
                System.out.println(target+moveObjectPhrase03+objectMover.getfirstName()+" "+objectMover.getlastName()+moveObjectPhrase04);
            
            }
        }
        
        
    }
    
    //--------------------------------------------------------------------------
    //Below is an attempt to create a clone method for thos class, Force 
    //--------------------------------------------------------------------------
    /**
     * 
     * @return when called on instances of force class, it will return a copy of the instance
     * @throws CloneNotSupportedException  ???
     */
    public Force cloneForce() throws CloneNotSupportedException
    {
        return (Force) super.clone();
    
    }
    
    
    
    
    
    
}
