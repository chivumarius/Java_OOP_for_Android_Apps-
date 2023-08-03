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



// ▼ "CLASS" ▼
public class MainInheritanceEmployee {

    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "CREATION OF OBJECTS" ▼
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();



        // ▼ "ACCESSING" THE "OBJECTS METHODS" ▼
        System.out.println(
            employee.getVacationDays()
        );

        System.out.println(
            lawyer.getLawyerPosition()
        );

        System.out.println(
            secretary.getSalary()
        );


        System.out.println(
            legalSecretary.getVacationDays()
        );


        System.out.println(
            marketer.insideMarket()
        );
    }
}
