package inheritance;

public class Teacher extends Person {
    private double salary;
    private int roomNumber;
    private String academicDegree;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, String uniID, double salary, int roomNumber, String academicDegree) {
        super(firstName, secondName, uniID);
        this.salary = salary;
        this.roomNumber = roomNumber;
        this.academicDegree = academicDegree;
    }

    public Teacher(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        setSalary(500_000_000);
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
        return "inheritance.Teacher{" +
                "salary=" + salary +
                '}'
                + super.toString();
    }

    public String toDisplay(){
        return super.toString() + "для ведроидов";
    }
}