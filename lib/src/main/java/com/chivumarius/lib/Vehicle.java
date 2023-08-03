/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

                 ►► "INHERITANCE" IN "JAVA" ◄◄




    ♦ "Inheritance "
        →  is a "Mechanism"
        → to Make the "Code Reusable"
        → by Defining a "Child Class" ("Subclass")
        → of a "Parent Class" ("Base Class")
        → in which "Subclass"
        → Inherits "Properties" and "Methods"
        → of "Parent Class".



    ♦ "Attributes" and "Methods"
        → can be "Inherited"
        → from "One Class"
        → to "Another".



    ♦ "Inheritance" is "Grouped" into "Two Categories":

        1 - "SubClass" ("Child")
                → the "Class" that "Inherits"
                → "Another Class".


        2 - "SuperClass" ("Parent")
                → the "Class" being "Inherited"
                → from "Another Class".



    ♦ The "extends" Keyword
        → allows "Inheritance" from "Another Class"



   ♦ The "final" Keyword
        → is a "Non-Access Modifier"
        → used for "Classes", "Attributes" and "Methods",
        → which Makes Them "Non-Changeable"
        → ("Impossible" to "Inherit" or "Override").


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


// ▼ "PARENT CLASS"▼
public class Vehicle {
//public final class Vehicle {

    // ▼ "METHODS" ("BEHAVIOR") ▼
    // ▼ The "horn()" Method:
    public void horn() {

        System.out.println("peep, peep");
    }
}
