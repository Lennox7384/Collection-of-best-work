/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg1.star.wars;

/**
 *
 * @author Lennox
 */
public class Fighter implements Cloneable {
    
    //-----------------------------------------------------------
    // Class-independent variables, methods etc.. that may arise 
    //-----------------------------------------------------------
    
    
    
    /**Someone must put in a name with reasonable number of characters.
     * Normally between 1 and 10. Although, 1 would be unreasonable.
     * Empty spaces as characters couldn't be prevented.This might be a weakness.
     */
    static int nameMinLength=2;
    static int nameMaxLength=10;
    
    static String genderCharacter_1="M";
    static String genderCharacter_2="F";
    
    static int minAge =15;
    static int maxAge =999;
    
    
    //-----------------------------------------------------------------------------
    // Instance variables for class fighters
    // Remember every instance variable must have its own getter and setter methods
    //------------------------------------------------------------------------------
    
    private String firstName;
    
    /**
     * 
     * @return  returns the first name.
     */
    public String getfirstName()
    {
        return firstName;
    }
    
    private String lastName;
    /**
     * 
     * @return returns the last name 
     */
    public String getlastName()
    {
        return lastName;
    }
    
      
    /**
     * 
     * @param firstName enables you set the first name of the fighter object
     * @param lastName  enables you set the last name of the fighter object
     */
    public void setName(String firstName, String lastName)
    {
        int firstNameCount=firstName.length();
        int lastNameCount=lastName.length();
    
        if(firstNameCount<nameMinLength || firstNameCount>nameMaxLength && lastNameCount<nameMinLength || lastNameCount>nameMaxLength)
    {
        throw new IllegalArgumentException ("Names must have characters between 2 and 10 (inclusive)");
    }
    else
    {
        this.firstName= firstName;
        this.lastName=lastName;
    }  
    }
    
    
     /**
     * We could have stuck to setName method only
     * but since some fighters have only one name, we are gonna add
     * a specific setter below that only sets fistName.
     * That will help us create a custom class that doesn't include lastName.
     */
    
    public void setfirstName(String firstName)
    {
        int firstNameCount1=firstName.length();
      
        if(firstNameCount1<nameMinLength || firstNameCount1>nameMaxLength)
    {
        throw new IllegalArgumentException ("Names must have characters between 2 and 10 (inclusive)");
    }
    else
    {
        this.firstName=firstName;
    }
      
    }
    
     
  
    private String gender;
    
    /**
     * 
     * @return  returns the gender of the Fighter Object in question.
     */
    public String getGender()
    {
      return gender;
    }
    /**
     * 
     * @param gender enables setting the gender F or M for every fighter object 
     */
    public void setGender (String gender)
    {
     String genderCharacter = gender;
     
     if (genderCharacter.equals(genderCharacter_1)|| genderCharacter.equals(genderCharacter_2))
     {
       this.gender=gender;
     }
     else
     {
       throw new IllegalArgumentException ("You must use either F or M to represent gender");
     }
    
    }
    
    private int age;
    /**
     * 
     * @return the age for the fighter object in question 
     */
    public int getAge()
    {
    return this.age;
    }
    /**
     * 
     * @param age  the age for every fighter object
     */
    
    public void setAge(int age)
    {
    int ageCheck=age;
    
    if (ageCheck<minAge||ageCheck>maxAge)
    {
    throw new ArithmeticException("The age is out of the acceptable range.Figher must be between 15 and 70 (inclusive) yrs old");
    }
    else
    {
     this.age=age;
    }
    
    }
   
   private String tauntPhrase;
   
   /**
    * 
    * @return the tauntPhrase for everyFighterObject
    */
   
   public String gettauntPhrase()
   {
   return tauntPhrase;
   }
   
   /**
    * 
    * @param tauntPhrase sets a unique insult phrase for every Fighter object.
    */
   
   public void settauntPhrase(String tauntPhrase)
   {
    this.tauntPhrase=tauntPhrase;
   }
   
   
   private Force inherentForce= new Force(35,"Light");
   
   /**
    * 
    * @return the property/instance variable inherentForce
    */
   
   public Force getInherentForce()
   {
    /**
    String inherentForceClass= this.inherentForce.getClass().getName();
    int  inherentForceStrength= this.inherentForce.getStrength();
    String inherentForceSideOfForce= this.inherentForce.get_sideOfForce();
    
    System.out.print ln("the object is of class "+ inherentForceClass +" and has a  strength of "+ inherentForceStrength  +" and sideOfForce " + inherentForceSideOfForce);
    **/
    return this.inherentForce;
   }
   
   /**
    * 
    * @param inherentForce an instance of force class part of instance variables for fighter class objects. 
    */
   public void setinherentForce(Force inherentForce)
   {
     this.inherentForce=inherentForce;
   }
   
   
    //-----------------------------------------------------------
    // Constructors for class fighters 
    //-----------------------------------------------------------
    
   /**
    * Default Constructor (Normally has nothing contained in it)
    */
    public Fighter (){}
    
    /**
     * Custom Constructor (1).
     * @param firstName the parameter variable initializes the instance variable firstName
     * @param lastName  the parameter variable initializes the instance variable lastName
     */
    
    
    public Fighter(String firstName, String lastName)
    {
         this.setName(firstName,lastName);
    }
    
    /**
     * Custom Constructor (2)
     * @param firstName the parameter variable initializes the instance variable firstName
     * @param lastName  the parameter variable initializes the instance variable lastName
     * @param inherentForce the parameter initializes the instance variable inhererentForce with an instance of the Force class.  
     */
    
    public Fighter(String firstName, String lastName, Force inherentForce)
    {
    this.setName(firstName,lastName);
    this.setinherentForce(inherentForce);
    }
    
    /**
     *  Custom constructor(3)
     * @param firstName the parameter variable initializes the instance variable firstName
     * @param age the parameter variable initializes the instance variable age
     * @param gender the parameter variable initializes the instance variable gender.
     * @param inherentForce the parameter initializes the instance variable inhererentForce with an instance of the Force class.
     * @param tauntPhrase sets a unique insult phrase for every Fighter object.
     */
    
    public Fighter(String firstName, int age, String gender, Force inherentForce,String tauntPhrase)
    {
        this.setfirstName(firstName);
        this.setAge(age);
        this.setGender(gender);
        this.setinherentForce(inherentForce);
        this.settauntPhrase(tauntPhrase);
        
    }
    
    /**
     *  Custom constructor(4) Full constructor
     * @param firstName the parameter variable initializes the instance variable firstName
     * @param lastName  the parameter variable initializes the instance variable lastName
     * @param age the parameter variable initializes the instance variable age
     * @param gender the parameter variable initializes the instance variable gender.
     * @param inherentForce the parameter initializes the instance variable inhererentForce with an instance of the Force class.
     * @param tauntPhrase sets a unique insult phrase for every Fighter object.
     */
    
    public Fighter(String firstName,String lastName, int age, String gender, Force inherentForce,String tauntPhrase)
    {
        this.setName(firstName,lastName);
        this.setAge(age);
        this.setGender(gender);
        this.setinherentForce(inherentForce);
        this.settauntPhrase(tauntPhrase); 
    }
    

    //-----------------------------------------------------------
    // Methods for class fighters
    //-----------------------------------------------------------

    /**
     * Prints out the taunt phrase for each fighter.
     */
    public void taunt()
    {
        System.out.println(this.tauntPhrase);
    }
    
    /**
     * The method that brings two fighters together in a combat and produces results
     * @param fighter_A  the first of two combatants
     * @param fighter_B  the second of two combatants
     */
    public static void fight (Fighter fighter_A, Fighter fighter_B)
    {
        //Store the specific sides of force for the two fighters in two different variables.
        String fighter_AsideOfForce= fighter_A.getInherentForce().get_sideOfForce();
        String fighter_BsideOfForce=fighter_B.getInherentForce().get_sideOfForce();
        
        if(fighter_A.getlastName()!=null&&fighter_B.getlastName()!=null)  // this is because some fighters have got only one name and we need to safely accomodate that!
       {
        
        
        
            if (!fighter_AsideOfForce.equals(fighter_BsideOfForce))
            {   
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String weakFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String strongFighterTaunt=fighter_A.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+" "+fighter_A.getlastName()+ " and "+fighter_B.getfirstName()+" "+fighter_B.getlastName()+ " are Strong. None overpowered the other ");
                }
                else
               {
                    String strongerFighter=""+ fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String weakFighter=""+fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String strongFighterTaunt=fighter_B.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
        
            }
            else //same sideOfForce
            {
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String weakFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+" "+fighter_A.getlastName()+ " and "+ fighter_B.getfirstName()+" "+fighter_B.getlastName()+ " are twins in the " +fighter_A.getInherentForce().get_sideOfForce()+ " side of force.And therefore cannot fight.Both have strength of " +fighter_A.getInherentForce().getStrength());
                }
                else
                {
                    String strongerFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String weakFighter=""+fighter_A.getfirstName()+" "+fighter_A.getlastName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
            }
        }
        else if (fighter_A.lastName==null&&fighter_B.lastName!=null)
        {
            if (!fighter_AsideOfForce.equals(fighter_BsideOfForce))
            {   
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName();
                    String weakFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String strongFighterTaunt=fighter_A.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+ " and "+fighter_B.getfirstName()+" "+fighter_B.getlastName()+ " are Strong. None overpowered the other ");
                }
                else
               {
                    String strongerFighter=""+ fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String weakFighter=""+fighter_A.getfirstName();
                    String strongFighterTaunt=fighter_B.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
        
            }
            else //same sideOfForce
            {
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName();
                    String weakFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+ " and "+ fighter_B.getfirstName()+" "+fighter_B.getlastName()+ " are twins in the " +fighter_A.getInherentForce().get_sideOfForce()+ " side of force.And therefore cannot fight.Both have strength of " +fighter_A.getInherentForce().getStrength());
                }
                else
                {
                    String strongerFighter=""+fighter_B.getfirstName()+" "+fighter_B.getlastName();
                    String weakFighter=""+fighter_A.getfirstName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
            }
            
       
        }
        else if (fighter_A.lastName!=null&&fighter_B.lastName==null)
        {
            if (!fighter_AsideOfForce.equals(fighter_BsideOfForce))
            {   
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String weakFighter=""+fighter_B.getfirstName();
                    String strongFighterTaunt=fighter_A.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+" "+fighter_A.getlastName()+ " and "+fighter_B.getfirstName()+ " are Strong. None overpowered the other ");
                }
                else
               {
                    String strongerFighter=""+ fighter_B.getfirstName();
                    String weakFighter=""+fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String strongFighterTaunt=fighter_B.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
        
            }
            else //same sideOfForce
            {
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName()+" "+fighter_A.getlastName();
                    String weakFighter=""+fighter_B.getfirstName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+" "+fighter_A.getlastName()+ " and "+ fighter_B.getfirstName()+ " are twins in the " +fighter_A.getInherentForce().get_sideOfForce()+ " side of force.And therefore cannot fight.Both have strength of " +fighter_A.getInherentForce().getStrength());
                }
                else
                {
                    String strongerFighter=""+fighter_B.getfirstName();
                    String weakFighter=""+fighter_A.getfirstName()+" "+fighter_A.getlastName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
            }
        
        }
        else
        {
            if (!fighter_AsideOfForce.equals(fighter_BsideOfForce))
            {   
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName();
                    String weakFighter=""+fighter_B.getfirstName();
                    String strongFighterTaunt=fighter_A.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+ " and "+fighter_B.getfirstName()+ " are Strong. None overpowered the other ");
                }
                else
               {
                    String strongerFighter=""+ fighter_B.getfirstName();
                    String weakFighter=""+fighter_A.getfirstName();
                    String strongFighterTaunt=fighter_B.gettauntPhrase();
               
                    System.out.println(strongerFighter+" fights "+weakFighter+ " and "+strongerFighter +" wins! "+ strongerFighter+ " then gloats: "+strongFighterTaunt);
                }
        
            }
            else //same sideOfForce
            {
                //Now explicitly determine the strength level of each fighter. 
                int fighter_AstrengthLevel=fighter_A.inherentForce.getStrength();
                int fighter_BstrengthLevel=fighter_B.inherentForce.getStrength();
            
                if(fighter_AstrengthLevel>fighter_BstrengthLevel)
                {
                    String strongerFighter=""+ fighter_A.getfirstName();
                    String weakFighter=""+fighter_B.getfirstName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
                else if (fighter_AstrengthLevel==fighter_BstrengthLevel)
                {
                    System.out.println("Both "+fighter_A.getfirstName()+ " and "+ fighter_B.getfirstName()+ " are twins in the " +fighter_A.getInherentForce().get_sideOfForce()+ " side of force.And therefore cannot fight.Both have strength of " +fighter_A.getInherentForce().getStrength());
                }
                else
                {
                    String strongerFighter=""+fighter_B.getfirstName();
                    String weakFighter=""+fighter_A.getfirstName();
               
               
                    System.out.println(strongerFighter+" is stronger in the "+fighter_A.getInherentForce().get_sideOfForce()+ " side  of force than "+weakFighter);
                }
            }
            
            
        }
        
           
       
       
       
   }
    
    //-------------------------------------------------------------------
    //Below is another attempt to create a clone method 
    //-------------------------------------------------------------------
    
    public Fighter clone() throws CloneNotSupportedException
    {
        return (Fighter) super.clone();
    
    }

            
            
            
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

