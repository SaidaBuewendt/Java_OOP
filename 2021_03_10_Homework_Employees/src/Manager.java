public class Manager extends Employee {
    int grade;

    public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
        super(name, id, age, company, baseSalary);
        if (grade>=1&&grade<=4)
            this.grade = grade;
        else System.out.println("Wrong grade");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>=1&&grade<=4)
        this.grade = grade;
        else System.out.println("Wrong grade");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", id=" + id +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
