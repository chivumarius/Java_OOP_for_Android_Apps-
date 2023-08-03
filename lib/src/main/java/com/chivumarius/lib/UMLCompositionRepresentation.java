/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "UNIFIED  MODELING  LANGUAGE" ("UML") ◄◄
                 ►► "COMPOSITION" ◄◄




    

    ♦ The "Composition"
        → is a "Part" of "Association Relationship",
        → being "Considered" as a "Strong Type" 
        → of "Association".

        • "Deleting One" of the "Elements" 
            → Affects "Another Associated Element".         → is a "Blueprint"


            -------------------
                 Folder            // ► "Class Name"  ("UMLCompositionRepresentation")
            -------------------
                                     // ► "Attributes"


            -------------------
                                    // ► "Methods" ("Behavior")

            -------------------
                    ♦
                    |
                    |
                    ↓
            -------------------
                   File               // ► "Class Name"  ("UMLClassRepresentation")
            -------------------
                                    // ► "Attributes"


            -------------------
                                  // ► "Methods" ("Behavior")

            -------------------


        ►► "UNIFIED  MODELING  LANGUAGE" ("UML") ◄◄
             ►► "DEPENDENCY REPRESENTATION" ◄◄






    ♦ The "Dependency Representation"
        → in which the "Method" of "One Class"
        → "Depends" on "Another Class" (e.g. "Key" Class)


            -------------------
                 Vehicle            // ► "Class Name"  ("UMLDependencyRepresentation")
            -------------------
                                     // ► "Attributes"


            -------------------
             + startEngine(key)         // ► "Method Depend of Key Class" ("Behavior")

            -------------------
                    ♦ ("Empty Rhombus")
                    :
                    :  ("Dotted Line")
                    :
                    ▼
            -------------------
                   Key               // ► "Class Name"
            -------------------
                                    // ► "Attributes"


            -------------------
                                  // ► "Methods" ("Behavior")

            -------------------

              Notes:
                1 - The "-" Sign → means "private"
                2 - The ":" Sign → means that it Refers to the "Data Type"
                3 - The "+" Sign → means "public"
                4 - The "#" Sign → means "protected"
                5 - The "♦" ("Full Rhombus") Sign → means "Association Relationship" between "This Class"
                5 - The "<>" ("Empty Rhombus") Sign → means "Association Relationship" between "This Class"
                6 - The "↓" Sign → means "Association Relationship" with "This Class"
                7 - The "----►" ("Dotted Line") Sign → means "Dependency Relationship" of "Another Class"
                8 - The "→" ("Solid  Line") Sign → means "Inheritance" of "Another Class"
                9 - The "♦→" ("Full Rhombus" & "Solid  Line") Sign → means "Composition" with "Another Class"


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.io.File;

// ▼ "CLASS NAME" ▼
public class UMLCompositionRepresentation {
    private File file;
}


