package PolimorphismSorting;

class Demo {
    public static void main(String[] args) {
        Student studentDefaultConstructor = new Student();
        Student studentOnlyWithStudentId = new Student(100);
        Student studentWithAllSuperClassInstanceVariables = new Student("Mike", "M", 100, 1000);
        studentDefaultConstructor.lastName = "";
    }
}
