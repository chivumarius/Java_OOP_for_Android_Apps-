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




// ▼ THE "CAR" CLASS ▼

public class CarEncapsulation {

    // ▼ "ATTRIBUTES DECLARATION" ▼
    private int modelYear;
    private String color;


    // ▼ "GETTER" METHODS ("ALT + INS") ▼
    public int getModelYear() {
        // ▼ Return "Private Variable":
        return modelYear;
    }


    public String getColor() {
        // ▼ Return "Private Variable":
        return color;
    }


    // ▼ "SETTER" METHODS ("ALT + INS") ▼
    public void setModelYear(int modelYear) {
        // ▼ "Sets" the "Value" of "Private Variable".
        this.modelYear = modelYear;
    }


    public void setColor(String color) {
        // ▼ "Sets" the "Value" of "Private Variable".
        this.color = color;
    }



    // ▼ "CONSTRUCTOR" (ATTRIBUTES INITIALIZATION) ▼
    public CarEncapsulation(String color, int modelYear){
        /* ▼ The "color" Attribute of the "Car()" Class
                = "color" Parameter of the "Constructor Method" */
        this.color = color;


         /* ▼ The "modelYear" Attribute of the "Car()" Class
                = "modelYear" Parameter of the "Constructor Method" */
        this.modelYear = modelYear;
    }


    // ▼ "METHODS" ("BEHAVIOR") ▼
    // ▼ The "drive()" Method:
    public void drive() {

        System.out.println("Driving");
    }
}
