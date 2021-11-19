package chapter11;

public class Student {

    private String firstName;
    private String lastName;
    private int studentId;
    private Address address;

    public Student() {
    }

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = id;
    }

    public Student(String firstName, String lastName, int id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = id;
        this.address = address;
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

    @Override
    public String toString() {
        return "Student{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", studentId=" + studentId +
            ", address=" + address +
            '}';
    }
}