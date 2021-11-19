package inheritance2.entities;

import java.util.Objects;

 class Person {

    String firstName;
    String lastName;
    int SIN;
    private String genome;

    public Person() {
        //this("John","Abbott",1);
        //System.out.println("Person Constructor");
    }

    public Person(String firstName, String lastName, int SIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SIN = SIN;
        //System.out.println("Person overloaded constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSIN() {
        return SIN;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    public String getGenome() {
        return genome;
    }

    public void setGenome(String genome) {
        this.genome = genome;
    }

    public void talk() {
        System.out.println("Hi!");
    }

    void eat() {
        System.out.println("Person like to eat salad!");
    }

    private void walk() {
        System.out.println("It is a good day for walking!");
    }

    @Override
    public String toString() {
        return "<" + firstName +
            ", " + lastName +
            ", " + SIN +
            ", genome: " + genome +
            ">";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getSIN() == person.getSIN() &&
            getFirstName().equals(person.getFirstName()) &&
            getLastName().equals(person.getLastName()) &&
            Objects.equals(getGenome(), person.getGenome());
    }
}