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



// ▼ "PARENT/SUPER CLASS" ▼
public class Animal {

   
    // ▼ The "" Method ▼
    public void animalSound(){
       System.out.println("The animal make a sound"); 
    }

}
