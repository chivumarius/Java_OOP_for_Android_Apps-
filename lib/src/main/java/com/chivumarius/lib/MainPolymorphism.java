/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

             ►► "POLYMORPHISM" IN "JAVA" ◄◄



    ♦ "Polymorphism" 
         → means "Many Forms",
         → and it "Occurs"
         → when we have "Many Classes"
         → that are "Related" to "Each Other"
         → by "Inheritance".


    ♦ "Inheritance"
        → allows us to "Inherit"
        ► "Attributes" and "Methods"
        → from "Another Class".



    ♦ "Polymorphism"
        → "Uses" these "Methods"
        → to Perform "Different Tasks".



    ♦ This "Allows Us"
        → to "Perform" a "Single Action"
        → in "Different Ways".



    ♦ The "super" Keyword
        → refers to "Superclass"/ "Parent" "Objects".

        • Used to "Call Superclass Methods"
            → and to "Access"
            → the "Superclass Constructor".


         • It is also Used
            → to Eliminate "Confusion"
            → between "Superclasses" ("Parent")
            → and "Subclasses" ("Child")
            → that "Have Methods"
            → with the "Same Name".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;



public class MainPolymorphism {
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ Using "Polymorphism"
        //      → we can "Create" an "Animal Object"
        //      → from the "Cat" or "Dog" Classes
        Animal dog1 = new Dog();  // ► "Equivalent" to: Dog dog1 = new Dog();
        Animal cat1 = new Cat();


        // ► "Calling" the "Methods":
        dog1.animalSound();
        cat1.animalSound();
    }
}
