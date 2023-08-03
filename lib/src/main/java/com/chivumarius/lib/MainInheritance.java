/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

                 ►► "INHERITANCE" IN "JAVA" ◄◄




    ♦ "Inheritance "
        → is a "Mechanism"
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



// ▼ "CLASS" ▼
public class MainInheritance {

    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "Creating Objects" from the "CarInheritance()" Class "Constructor":
        CarInheritance mercedes = new CarInheritance(1400, "Red");


        // ▼ "Accessing" the "horn()" Inherited Method
        //      → of the "Objects"
        //      → from the "Vehicle()" Parent Class
        //      → of the "CarInheritance" Class:
        mercedes.horn();



        // ▼ "Getting" the "Weight" Private Variable
        //      → by "Getter" Method:
        System.out.println(
                mercedes.getWeight()
        );
    }
}
