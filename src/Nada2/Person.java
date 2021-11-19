package Nada2;

import java.util.Objects;

class Person {
    int SIN;
    String firstName;
    String lastName;
//     private String genome;

    public Person() {
    }

    public Person(int SIN, String firstName, String lastName) {
        if valid(SIN){
            this.SIN=SIN;
        }

//         for(Person SIN)
//         if (PersonArrayList.equals
////                 (this.SIN, SIN))
//            System.out.println("Cannot have duplicate Social Security Number");
//         else if ((this.firstName.length())>20)
//                System.out.println("First name cannot be more than 20 characters.");
//         else if ((this.lastName.length()) < 20)
//                System.out.println("Last name cannot be more than 20 characters.");
//            else {
//                this.firstName = firstName;
//                this.lastName = lastName;
//                this.SIN = SIN;
//            }
    }
    public boolean valid(int SIN){
        boolean valid=false;
        String sinStr= toString(SIN);{
        for(int i=0; i<sinStr.length(); i++ ){
            if Person.
        }

        return valid;
        }


        return valid;
    }

    public boolean setSIN(int SIN) {
        this.SIN = SIN;
    }

    public int getSIN() {
        return SIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
