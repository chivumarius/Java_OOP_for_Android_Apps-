/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

           ►► "INHERITANCE" IN "JAVA" ◄◄



    ♦ "Inheritance"
        → 


    

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


public class MainModifiers {

    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "Creating Objects" from the "CarTwo()" Class "Constructor":
        CarModifiers redCar = new CarModifiers(100, 2023);
        CarModifiers greenCar = new CarModifiers(60, 2024);


        // ▼ "Accessing" the "CarTwo()" Class "Methods" of the "Objects":
        redCar.accelerate();
        redCar.brake();



        /* ▼ The "speed" Attribute cannot be "Accessed"
                → because it is Set as "protected". */
        // ▼ "Accessing" the "private" Modifier for the "speed" Attribute:
        redCar.speed = 90;


        /* ▼ "Accessing" the "accelerate()" Method
                → from the "Same Package"
                → set it as "default" Modifier. */
        redCar.accelerate();
    }
}
