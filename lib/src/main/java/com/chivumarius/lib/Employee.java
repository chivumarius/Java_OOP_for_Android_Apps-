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


// ▼ "PARENT CLASS" ▼
public class Employee {

    // ▼ "METHODS" ▼
    public int getHours() {
        return 40;
    }


    public double getSalary() {
        return 4000.0;
    }


    public int getVacationDays() {
        return 10;
    }
}
