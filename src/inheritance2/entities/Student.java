package inheritance2.entities;

import java.util.Objects;

public class Student extends Person {

    private int studentId;
    Address address;

    public Student() {
        //System.out.println("Student Constructor");
    }

    public Student(int studentId) {
        super("John", "Abbott", 0);
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, int SIN, int studentId) {
        super(firstName, lastName, SIN);
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, int SIN, int studentId, Address address) {
        super(firstName, lastName, SIN);
        this.studentId = studentId;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void study() {
        firstName = "Adam";
        lastName = "Smith";
        SIN = 1000;

        //genome = "";
        String genome = getGenome();

        talk();
        super.talk();
    }

    @Override
    public void talk() {
        System.out.println("Bonjour!");
    }

    @Override
    void eat() {
        System.out.println("Student like to eat Pizza!");
    }

    @Override
    public String toString() {
        return "<" + firstName +
                ", " + lastName +
                ", " + address + ">";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }
}