public abstract class Employee extends Person {
    String company;
    double baseSalary;

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        this.company = company;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", company='" + company + '\'' +
                ", base salary=" + baseSalary +
                ", age=" + age +
                '}';
    }

    public abstract double calcSalary();
}


