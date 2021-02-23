package inheritance;

public class StartApplication {
    public static void main(String[] args) {
        lessonStart();
        Student pasha = new Student("Паша", "Алексеев", "43534");
        Person dasha = new Student("Даша", "Семёнофф", "5345243");
        Object rita = new Student("Рита", "Иванова", "3564356345");
        Person andrew = new Teacher();

        String hausmaster = "Василий";

        Student[] informatik = new Student[]{pasha, (Student) dasha, (Student) rita};
        Person[] newPersons = new Person[]{dasha, null, pasha, (Student) rita, andrew};
        Object[] myArr = new Object[]{dasha, pasha, rita, andrew, hausmaster};
        // Животное человек2 = new Человек;
        // Человек человек1 = new Человек;
        Teacher [] doctorates = new Teacher[] {};

    }

    private static void lessonStart() {
        /*inheritance.Student sasha = new inheritance.Student();
        sasha.study();
        sasha.eats();
        inheritance.Teacher tch = new inheritance.Teacher();*/
        Student glasha = new Student("Глаша", "Васечкина", "2021_021");
        System.out.println(glasha);
        System.out.println("------------------");
        Person ps = new Person();
        System.out.println(ps);
        System.out.println("------------------");
        System.out.println("учитель");
        Teacher tc = new Teacher();
        System.out.println(tc.toString());
    }
}