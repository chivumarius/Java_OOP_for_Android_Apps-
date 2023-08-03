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

package com.chivumarius.lib;


// (II) "User-Defined" Packages →  → Create by the Users:
// ▼ "Importing" the "Single Class" ("CarPackage") from the "myPackage" Package
import com.chivumarius.lib.myPackage.CarPackage;

// (I) "Built-In" Packages  → from the "Java API"
// ▼ "Importing" the "Single Class" ("Scanner") from the "java.util" Package
import java.util.Scanner;



// ▼ "CLASS" ▼
public class MainPackages {

    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        //  (I) "Built-In" Packages
        //           → from the "Java API":

        // ▼ "Creating" an "Object" of the "Scanner" Class
        Scanner scan = new Scanner(System.in);


        // ▼ Accessing the "nextLine()" Method
        //      → from the "scan" Object
        //      → of the "Scanner()" Class
        String userName = scan.nextLine();

        System.out.println("Hello " + userName);





        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (II) "User-Defined" Packages
        //          → Create by the Users:

        // ▼ "Creating" an "Object" of the "CarPackage" Class
        CarPackage c1 = new CarPackage("Blue", 2022);
    }
}
