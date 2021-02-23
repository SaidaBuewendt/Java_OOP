public class Teacher extends Person {
    private double salary;
    private int roomNumber;
    private String academicDegree;
    private String email;

    public Teacher(String firstName, String secondName, String uniID, int age, String faculty, String email, double salary, int roomNumber, String academicDegree) {
        super(firstName, secondName, uniID, age);
        this.email = email;
        this.salary = salary;
        this.roomNumber = roomNumber;
        this.academicDegree = academicDegree;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
    }

    void teach() {
        System.out.println("Я преподаю");
    }

    @Override
    public String toString() {
        return "Преподаватель{" +
                "Зарплата=" + salary +
                ", Номер кабинета=" + roomNumber +
                ", Ученая степень='" + academicDegree + '\'' +
                ", E-mail='" + email + '\'' +
                '}';
    }

    public String toDisplay() {
        return super.toString() + "для ведроидов";
    }
}