public class EmployeesAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("James Brown", 123456, 35, "Siemens", 40000, 3);
        Manager manager2 = new Manager("Susan Miller", 456789, 38, "BVG", 50000, 1);
        SalesMan salesMan1 = new SalesMan("Robert Wolf", 789123, 25, "Zalando", 30000, 50, 20);
        SalesMan salesMan2 = new SalesMan("Kate Roberts", 147852, 23, "Hello Fresh", 28000, 35, 15);
        WageEmployee wageEmployee1 = new WageEmployee("Kevin Schmidt", 258963, 20, "Lieferando", 12000, 8, 10);
        WageEmployee wageEmployee2 = new WageEmployee("Joe Fischer", 147852, 22, "Wolt", 11000, 6, 9);

        Employee[] emps = new Employee[]{manager1, manager2, salesMan1, salesMan2, wageEmployee1, wageEmployee2};
        printAllEmployees(emps);
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee element : emps) {
            System.out.println(element.toString());
        }
    }
}
