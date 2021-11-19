package inheritance2.dataCollection;



import inheritance2.entities.Student;

import java.util.ArrayList;

public class DataCollection {

        private static ArrayList<Student> studentDataCollection = new ArrayList<>();
        private static ArrayList<Student> foundStudents;

        public static void addStudent(Student student){
            studentDataCollection.add(student);
        }

        public static void addMultipleStudents(ArrayList<Student> studentsArrayList){
            studentDataCollection.addAll(studentsArrayList);
        }

        public static ArrayList<Student> findStudentsByLastName(String lastName){
            foundStudents = new ArrayList();

            for (Student student : studentDataCollection) {
                if (student.getLastName().toLowerCase().startsWith(lastName.toLowerCase())) {
                    foundStudents.add(student);
                }
            }

            return foundStudents;
        }

        public static ArrayList<Student> findStudentsByStreetAddress(String street){
            foundStudents = new ArrayList();

            for (Student student :
                    studentDataCollection) {
                if (student.getAddress().getStreet().toLowerCase().equals(street.toLowerCase())) {
                    foundStudents.add(student);
                }
            }
            return foundStudents;
        }

        public static ArrayList<Integer> findStudentsByIndex(String lastName){
            ArrayList<Integer> foundIndexes = new ArrayList();
            for (Student student :
                    studentDataCollection) {
                // ToDo: find by lastName and add the index to foundIndexes
                //{foundIndexes.add(studentDataCollection.indexOf(student));}
            }

            return foundIndexes;
        }

        public static ArrayList<Integer> deleteStudentsByLastName(String lastName){
            ArrayList<Integer> deletedIndexes = new ArrayList();
            ArrayList<Student> foundStudentsToDelete = findStudentsByLastName(lastName);

            for (Student student :
                    foundStudentsToDelete) {
                deletedIndexes.add(studentDataCollection.indexOf(student));
                System.out.printf("\nDeleted students: " + student + "\n");
                studentDataCollection.remove(student);
            }
            return deletedIndexes;
        }

        public static ArrayList<Student> updateStudentsStreetAddress(String oldStreet, String newStreet){
            ArrayList<Student> foundStudentsToUpdate = findStudentsByStreetAddress(oldStreet);

            for (Student student :
                    foundStudentsToUpdate) {
                student.getAddress().setStreet(newStreet);
            }
            return foundStudentsToUpdate;
        }

        public static ArrayList<Student> findAndUpdateStudentsStreetAddress(String oldStreet, String newStreet){
            ArrayList<Student> updatedStudents = new ArrayList<>();

            for (Student student :
                    studentDataCollection) {
                if (student.getAddress().getStreet().equals(oldStreet)){
                    student.getAddress().setStreet(newStreet);
                    updatedStudents.add(student);
                }
            }
            return updatedStudents;
        }

        public static void showDataCollection(){
            System.out.println("\n\nDataCollection state: \n" + studentDataCollection + "\n");
        }
    }

