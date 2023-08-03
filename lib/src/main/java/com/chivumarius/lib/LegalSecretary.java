/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "UNIFIED  MODELING  LANGUAGE" ("UML") ◄◄
                ►► "INHERITANCE" ◄◄
             ►► CASE STUDY "EMPLOYEES" ◄◄



                Employee
                    |
                    |
       ___________________________
      |             |             |
    Lawyer      Secretary      Marketer
                   |
              Legal Secretary


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


//
public class LegalSecretary extends Secretary{

    public void seyLegalOath() {
       System.out.println("My Legal Oath");
    }

}
