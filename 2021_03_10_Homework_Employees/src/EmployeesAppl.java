public class EmployeesAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("James Brown", 123456, 35, "Siemens", 15000, 3);
        Manager manager2 = new Manager("Susan Miller", 456789, 38, "Siemens", 15000, 1);
        Manager manager3 = new Manager("Kate Merkel", 354654, 37, "Siemens", 15000, 2);
        SalesMan salesMan1 = new SalesMan("Robert Wolf", 789123, 25, "Zalando", 30000, 50, 20);
        SalesMan salesMan2 = new SalesMan("Kate Roberts", 147852, 23, "Zalando", 28000, 35, 15);
        SalesMan salesMan3 = new SalesMan("Bella Right", 354455, 28, "Zalando", 27000, 20, 10);
        WageEmployee wageEmployee1 = new WageEmployee("Kevin Schmidt", 258963, 20, "Wolt", 12000, 8, 10);
        WageEmployee wageEmployee2 = new WageEmployee("Joe Fischer", 147852, 22, "Wolt", 11000, 6, 9);
        WageEmployee wageEmployee3 = new WageEmployee("Andrew Hirsch", 147852, 22, "Wolt", 11000, 6, 9);

        Employee[] emps = new Employee[]{manager1, manager2, manager3, salesMan1, salesMan2, salesMan3, wageEmployee1, wageEmployee2, wageEmployee3};
        printAllEmployees(emps);
        
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee element : emps) {
            System.out.println(element.toString());

        }
    }


}
