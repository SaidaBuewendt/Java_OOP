public class SalesMan extends Employee {
    double totalSales;
    int bonus;

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, id, age, company, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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
}
