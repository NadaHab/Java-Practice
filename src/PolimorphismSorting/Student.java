package PolimorphismSorting;

public class Student extends Person{

    private int studentId;

    public Student() {
    }

    public Student(int studentId) {
        super("John","Abbott",0);
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, int id, int studentId) {
        super(firstName, lastName, id);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void study(){
        firstName = "Abc";
        lastName = "Def";
        id = 10;

        //genome = "";
        String genome = getGenome();

        talk();
        super.talk();
    }

    @Override
    void talk() {
        System.out.println("Bonjour!");
    }

    @Override
    public String toString() {
        return "Student{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", id=" + id +
            ", studentId=" + studentId +
            '}';
    }
}

