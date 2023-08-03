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


// ▼ "CHILD CLASS" ▼
public class Marketer extends Employee {

    public boolean insideMarket() {
        return true;
    }

    @Override
    public int getHours() {
        return super.getHours();
    }
}
