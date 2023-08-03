/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "ENCAPSULATION" IN "JAVA" ◄◄




    ♦ "Encapsulation"
        → meaning that "Sensitive" Data
        → is "Hidden" from "Users". To achieve this, you must:


    ♦ To "Achieve This", we must:

        1 - Declare Class "Variables"/ "Attributes"
                → as "private".

        2 - Provide Public "get()" and "set()" Methods
                → to "Access" and "Update"
                → the "Value" of a "Private Variable"



    ♦ The "Private Variables"
        → can "Only" be "Accessed"
        → within the "Same Class".
        → an "Outside Class"
        → has "No Access" to "It".


    ♦ We "Cab Access" a "Private Variables"
        → only if we Provide Public "Get" and "Set" Methods.



    ♦ The "get()" Method
        → "Returns" the "Private Variable". value,



    ♦ The "set()" Method
        → "Sets" the "Value"
        → of the "Private Variable".



    ♦ "Syntax" for "Both"
        → is that they "Start"
        → with either "get" or "set",
        → followed by the "Name" of the "Variable",
        → with the "First Letter"
        → in "Upper Case":
      ---------------------------------------------------
          // ▼ "GETTER" METHOD ▼
          public String getName() {
            // ▼ Return "Private Variable":
            return name;
          }


          // ▼ "SETTER" METHOD ▼
          public void setName(String newName) {
            // ▼ "Sets" the "Value" of "Private Variable".
            this.name = newName;
          }
      ---------------------------------------------------



    ♦ "Quick Command"
        → for "Generating" the "Getters" and "Setters":
      ---------------------------------------------------
            ► Alt + Ins
            ► Click "Getter" or "Setter"
      ---------------------------------------------------


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;

public class MainEncapsulation {

    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "Creating Objects" from the "Car()" Class "Constructor":
        CarEncapsulation c1 = new CarEncapsulation("Grey", 2024);


        // ▼ "Setting" the "modelYear" Private Variable
        //      → by "Setter" Method:
        c1.setModelYear(2030);


        // ▼ "Getting" the "modelYear" Private Variable
        //      → by "Getter" Method:
        System.out.println(
            c1.getModelYear()
        );


        // ▼ "Setting" the "color" Private Variable
        //      → by "Setter" Method:
        c1.setColor("Orange");


        // ▼ "Getting" the "color" Private Variable
        //      → by "Getter" Method:
        System.out.println(
                c1.getColor()
        );
    }
}
