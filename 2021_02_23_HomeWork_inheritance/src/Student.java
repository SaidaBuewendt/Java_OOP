public class Student extends Person {
    private double rating;
    private int course;
    private int gradebookID;
    private String faculty;

    public Student(String firstName, String secondName, String uniID, String faculty, int age, double rating, int course, int gradebookID) {
        super(firstName, secondName, uniID, age);
        this.rating = rating;
        this.course = course;
        this.gradebookID = gradebookID;
        this.faculty = faculty;
    }


    @Override
    public String toString() {
        return "Студент{" +
                "Рейтинг=" + rating +
                ", Курс=" + course +
                ", Номер зачетки=" + gradebookID +
                ", Факультет='" + faculty + '\'' +
                '}';
    }



    @Override
    void eats() {
        super.eats();
        System.out.println("Ужин в 18:00");
    }

    void study() {
        //бизнес логика
        System.out.println("Я учусь!");
    }

    void paysForSemester() {
        System.out.println("За семестр оплачено");
    }


}