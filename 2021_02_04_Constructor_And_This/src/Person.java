public class Person {
    String firstName;
    String lastName;
    int passportID;
    String date;
    boolean status;
    int children;
    String gender;

    public Person(int personID,
                  String personFN,
                  String personLN,
                  String personGender,
                  boolean personStatus,
                  int personChildren) {
        firstName = personFN;
        lastName = personLN;
        passportID = personID;
        status = personStatus;
        children = personChildren;
        gender = personGender;

    }

    public Person(String personFN, int personID, String personGender, boolean personStatus) {
        firstName = personFN;
        passportID = personID;
        gender = personGender;
        status = personStatus;
    }

    public void toDisplay() {
        System.out.println(status ? "Интересен" : "Скучный");
        System.out.println("User name: " + firstName);
        System.out.println("Gender: " + gender);
    }
}

class PersonTest {
    public static void main(String[] args) {
        try2();
        Person javaCoder = new Person("Ilon", 100, "m", true);
        javaCoder.toDisplay();
    }

    private static void try2() {
    }

    /*private static void telran() {
        Person student1 = new Person("Ganna", 1);
        // System.out.println(student1.firstName);
        Person student2 = new Person("Natalia", 2);
        // System.out.println(student2.firstName);
        Person student3 = new Person("Anastasia", 3);
        // System.out.println(student3.firstName);
        Person student4 = new Person("Ekaterina", 4);
        //  System.out.println(student4.firstName);

        Person[] group = new Person[]{student1, student2, student3, student4};
        System.out.println(group[2].firstName);
    }*/
}
