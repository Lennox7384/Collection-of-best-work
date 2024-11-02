/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg1.star.wars;

/**
 *
 * @author Cobber
 */
public class StarWarsMainApp {
    
  public static void main (String[]args)throws CloneNotSupportedException
  {
      
      
    
    /**
     * Formal star wars characters. 
     * Instances of the class,  Fighter. 
     */
  
   Fighter fighterAsajj= new Fighter("Assaj","Ventress",30,"F", new Force(85,"Dark"),"You fight like a damp noodle");
   Fighter fighterBariss= new Fighter("Bariss","Offee",30,"F", new Force(85,"Light"),"You are about as terrifying as a marshmallow");
   Fighter fighterDarth= new Fighter("Darth","Vader",42,"M", new Force(100,"Dark"),"Is this supposed to be a fight or we are just stretching?");
   Fighter fighterEmpereror= new Fighter("Emperor","Palpatine",82,"M", new Force(97,"Dark"),"I'll be back");
   Fighter fighterKilo= new Fighter("Kilo","Ren", 20,"M", new Force(95,"Dark"),"I have come here to chew bubble gum and kick butts");
   Fighter fighterLuke= new Fighter("Luke","SkyWalker",19,"M", new Force(97,"Light"),"I've been hit harder by a gust of wind");
   Fighter fighterObi= new Fighter("Obi Wan","Kenobi",57,"M", new Force(85,"Light"),"I've had ants that put up a better fight");
   Fighter fighterPrincess= new Fighter("Princess","Leia",19,"F", new Force(75,"Light"),"Is this the part where I pretend to be afraid?");
   Fighter fighterRey= new Fighter("Rey",20,"F", new Force(96,"Light"),"I'd be more worried if you were an actual threat");
   Fighter fighterStorm= new Fighter("Storm","Trooper",25,"M", new Force(1,"Dark"),"Is that all you've got, I was expecting atleast a challenge");
   Fighter fighterYoda= new Fighter("Yoda",896,"M", new Force(99,"Light"),"You call that an insult, I've heard better from a toddler");
  
   
   // Active combats
   
   Fighter.fight(fighterBariss,fighterStorm); //Light(Bariss)stronger
   Fighter.fight(fighterPrincess,fighterAsajj);//Dark(Asajj) stronger
   Fighter.fight(fighterBariss,fighterAsajj);//Light vs Dark equal strength
   Fighter.fight(fighterObi,fighterRey);//Light vs Light Ray stronger
   Fighter.fight(fighterBariss,fighterObi);// Light vs Light equal strength
   
   //Target Movements and influences
   String chosenTarget="the Rock";
   Force.moveObject(fighterLuke, chosenTarget);
   Force.influence(fighterKilo, chosenTarget);
   Force.influence(fighterStorm,chosenTarget);
   
   
   //Cloning Storm Trooper.
   
   Fighter stormClone01=fighterStorm.clone();
   Fighter stormClone02=fighterStorm.clone();
   Fighter stormClone03=fighterStorm.clone();
   Fighter stormClone04=fighterStorm.clone();
   
   //Unique taunts for each of the storm Trooper clones.
   
   stormClone01.settauntPhrase("You couldn't scare a flea with that performance!");
   stormClone02.settauntPhrase("Nice try,but you are barking up the wrong tree!");
   stormClone03.settauntPhrase("You are all talk an no bite, like toothless tiger");
   stormClone04.settauntPhrase("You are about as intimidating as a butterfly in a windstorm");
   
   // Printing the Clones' taunt phrases.
   System.out.println("The taunt phrase of stormClone01 is: "+stormClone01.gettauntPhrase());
   System.out.println("The taunt phrase of stormClone02 is: "+stormClone02.gettauntPhrase());
   System.out.println("The taunt phrase of stormClone03 is: "+stormClone03.gettauntPhrase());
   System.out.println("The taunt phrase of stormClone04 is: "+stormClone04.gettauntPhrase());
  }
  
    
}
