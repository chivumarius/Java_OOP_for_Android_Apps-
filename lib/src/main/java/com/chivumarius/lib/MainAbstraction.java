/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

             ►► "ABSTRACTION" IN "JAVA" ◄◄



    ♦ "Abstraction" 
         → is the "Process" of "Hiding Certain Details"
         → and "Showing" Only "Essential Information"
         → to the "User".

         → It can be "Achieved"
         → with either "Abstract Classes"
         → or "Interfaces" .



        1 - "Abstract Class":
                → is a "Restricted Class"
                → that "Cannot Be Used"
                → to "Create Objects",


                • To "Access It",
                    → It must be "Inherited"
                    → from "Another Class".


                • It "Can Have":
                    → "Abstract Methods"
                    → and also "Regular Methods"



        2 - "Abstract Method":
                → can "Only Be Used"
                → in an "Abstract Class",
                → and It "Does Not Have" a "Body". The body is provided by the subclass (inherited from).




    ♦ The "abstract" Keyword
        → is a "Non-Access Modifier",
        → used for "Classes" and "Methods":


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;



public class MainAbstraction {
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ Using "Polymorphism"
        //      → we can "Create" an "Animal Object"
        //      → from the "Cat" or "Dog" Classes
        AnimalAbstraction dog1 = new DogAbstraction();  // ► "Equivalent" to: Dog dog1 = new Dog();
        AnimalAbstraction cat1 = new CatAbstraction();


        // ► "Calling" the "Methods":
        dog1.animalSound();
        cat1.animalSound();

        dog1.sleep();
        cat1.sleep();
    }
}
