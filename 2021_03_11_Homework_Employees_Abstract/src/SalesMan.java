public class SalesMan extends Employee {
    double totalSales;
    int bonus;

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, id, age, company, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;

    }

    public int getBonus() {
        return bonus;
    }


    @Override
    public String toString() {
        return "SalesMan{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", id=" + id +
                ", baseSalary=" + baseSalary +
                ", age=" + age +
                ", totalSales=" + totalSales +
                ", bonus=" + bonus + "%" +
                '}';
    }

    @Override
    public double calcSalary() {
        return getBaseSalary() / 100 * getBonus() + getBaseSalary();
    }
}
