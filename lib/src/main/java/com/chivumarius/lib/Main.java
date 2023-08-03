/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "MAIN CLASS" ◄◄



    ♦ The "new" Keyword
         →  creates a New Objects from a Class.
         →  or a New Array.

    ♦ "Object" Creation "Syntax":
      --------------------------------------------
        ClassName objectName = new ClassName();
      --------------------------------------------

     ♦ The "Object"
        → is a "Template"/"Blueprint" for an "Object".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;



public class Main {
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "Creating Objects" from the "Car()" Class:
//        Car c1 = new Car();

        // ▼ "Modifying" the "Properties" of the "Car()" Class "Object":
//        c1.color = "Green";



        // ▼ "Creating Objects" from the "Car()" Class "Constructor":
        Car c1 = new Car("Green", 2023);


        // ▼ "Accessing" the "Car()" Class "Properties" of the "Objects":
        System.out.println(c1.color);
        System.out.println(c1.modelYear);


        // ▼ "Accessing" the "Car()" Class "Methods" of the "Objects":
//        c1.drive();
    }
}
