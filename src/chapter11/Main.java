package chapter11;

public class Main {


        public static void main(String[] args) {
            Student john = new Student();
            john.setFirstName("John");
            john.setLastName("Abbott");
            john.setStudentId(1);

            Address mikeAddress = new Address("Canada",
                    "Montreal",
                    "Abc",
                    1,
                    "RFV654");

            Address anthonyAddress = new Address("Canada",
                    "Montreal",
                    "Sherbrooke",
                    1,
                    "EDC456");

            Student anthony = new Student();
            anthony.setAddress(new Address("Canada","Montreal","Sherbrooke",2,"EDC456"));

            Student mike = new Student("Mike","M",2, mikeAddress);

            Student tieda = new Student("Tieda","T",3, new Address("Canada",
                    "Montreal",
                    "Guy",
                    1234,
                    "EDC654"));

            Address addr = tieda.getAddress();
            String postalCode = addr.getPostalCode();

            String str = tieda.getAddress().getPostalCode();

            System.out.println(mike);
        }


}
