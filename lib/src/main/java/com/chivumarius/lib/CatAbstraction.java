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


// ▼ "CHILD/SUB CLASS" ▼
public class CatAbstraction extends AnimalAbstraction {

    // ▼ "Override" the "Inherited Method" ("Alt + Ins") ▼
    @Override
    public void animalSound() {
        System.out.println("The Cat Says: Meow..");
    }
}
