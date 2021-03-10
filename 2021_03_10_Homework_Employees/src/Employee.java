public class Employee extends Person {
    String company;
    double baseSalary;

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        if (company != null && !company.trim().isEmpty())
            this.company = company;
        else this.company = "No company";
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else this.baseSalary = -1;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
}


