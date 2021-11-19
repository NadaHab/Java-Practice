//package inheritance;
//
//import inheritance.entities.Address;
//import inheritance.entities.Student;
//import inheritance.dataCollection.DataCollection;
//
//public class App {
//
//    public App() {
//        demoObjectCreation();
//        demoArrayOfObjectsOperations();
//        demoObjectEquality();
//    }
//
//    void demoObjectCreation(){
//
//        Address mikeAddress = new Address("Canada",
//            "Montreal",
//            "Sherbrooke", //Atwater
//            1010,
//            "RFV654");
//
//        Address anthonyAddress = new Address("Canada",
//            "Montreal",
//            "Sherbrooke",
//            2020,
//            "EDC456");
//
//        Student john = new Student();
//        john.setFirstName("John");
//        john.setLastName("Abbott");
//        john.setStudentId(1);
//        john.setAddress(anthonyAddress);
//
//        Student anthony = new Student("Anthony","Molson",123, 200);
//        //anthony.setAddress(anthonyAddress);
//        anthony.setAddress(new Address("Canada","Montreal","Sherbrooke",234,"EDC456"));
//
//        Student mike = new Student("John","Molson",345, 300,mikeAddress);
//
//        Student tieda = new Student("Tieda","Li",456, 400, new Address("Canada",
//            "Montreal",
//            "Guy",
//            1234,
//            "EDC654"));
//
//        // ..........................................
//        Address addr = tieda.getAddress();
//        String postalCode = addr.getPostalCode();
//
//        String str = tieda.getAddress().getPostalCode();
//        // ..........................................
//
//        //System.out.println(mike);
//
//        DataCollection.addStudent(john);
//        DataCollection.addStudent(anthony);
//        DataCollection.addStudent(mike);
//        DataCollection.addStudent(tieda);
//
//        DataCollection.showDataCollection();
//
////        ArrayList<Student> studentArrayList = new ArrayList<>();
////        studentArrayList.addAll(Arrays.asList(john,mike,tieda));
////        DataCollection.addMultipleStudents(studentArrayList);
//    }
//
//    void demoArrayOfObjectsOperations(){
//
//        System.out.println("Find Tieda Li: \n" + DataCollection.findStudentsByLastName("Li") + "\n");
//
//        System.out.println("Find students in Sherbrooke street: \n" + DataCollection.findStudentsByStreetAddress("Sherbrooke") + "\n");
//
//        System.out.println("Updated streets: " + DataCollection.updateStudentsStreetAddress("Sherbrooke","Atwater") + "\n");
//
//        System.out.println("Deleted students indexes: " + DataCollection.deleteStudentsByLastName("Li") + "\n");
//    }
//
//    void demoObjectEquality(){
//
//        Address firstAddress = new Address("Canada",
//            "Montreal",
//            "Saint Catherine",
//            1,
//            "RFV654");
//
//        Address secondAddress = new Address("Canada",
//            "Montreal",
//            "Peel",
//            1,
//            "RFV654");
//
//        Student firstStudent = new Student("Mike","M",2, 200, firstAddress);
//        Student secondStudent = new Student("Mike","M",2, 200, secondAddress);
//
//        System.out.println("Is firstStudent equal to secondStudent: " + firstStudent.equals(secondStudent));
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        new App();
//    }
//}
