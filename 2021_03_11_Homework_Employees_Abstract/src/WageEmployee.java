public class WageEmployee extends Employee{
    int hours;
    double wage;

    public WageEmployee(String name, long id, int age, String company, double baseSalary, int hours, double wage) {
        super(name, id, age, company, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", id=" + id +
                ", baseSalary=" + baseSalary +
                ", age=" + age +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public double calcSalary() {
        return getHours()*getWage();
    }
}
