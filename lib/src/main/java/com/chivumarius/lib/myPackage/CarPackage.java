/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

                 ►► "PACKAGES" & "JAVA API LIBRARY" ◄◄




    ♦ "Packages"
        → are Used to "Group Related Classes".

        • We can "Think" of "It"
            → as a "Folder" in a "File Directory".

        • They are Used
            → to Avoid "Name Conflicts" and
            → to "Write" a Better "Maintainable Code".




    ♦ "Packages" → are "Divided" → into "Two Categories":

        (I)  "Built-In" Packages
                → from the "Java API".

        (II) "User-Defined" Packages
                → Create by the Users.




    ♦ "Java API" Library
        → is a "Library" of "Pre-Written Classes",
        → that are "Used" for "Free",
        → "Included" in the "Java Development Environment"


        • It "Contains"
            → "Components" for "Managing":
                •► "Input",
                •► "Database Programming",
                •► and much more.


        • It is "Divided" into:
            1- "Packages" and
            2 - "Classes".


            ►► We can either "Import"
                ► a "Single Class"
                    → "Along" with "Its Methods"
                    → and "Attributes",
                ► or a "Whole Package"
                    → that "Contain"
                    → "All" the "Classes"
                    → that "Belong"
                    → to the "Specified Package".



        • To "Use" a "Class" or a "Package"
            → from the "Library",
            → we need to "Use"
            → the "import" Keyword.


        • "Syntax":
          -------------------------------------------------------------------------
            import package.name.Class;   // ► to "Import" a "Single Class"
            import package.name.*;       // ► to "Import" the "Whole Package"
          -------------------------------------------------------------------------


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

//  (II) "User-Defined" Packages ("myPackage")
//                → Create by the Users.
package com.chivumarius.lib.myPackage;




// ▼ THE "CAR" CLASS ▼

public class CarPackage {

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
    public CarPackage(String color, int modelYear){
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
