public class EmployeeAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("James Brown", 123456, 35, "Siemens", 10000, 3);
        Manager manager2 = new Manager("Susan Miller", 456789, 38, "Siemens", 20000, 1);
        Manager manager3 = new Manager("Kate Merkel", 354654, 37, "Siemens", 17000, 2);
        SalesMan salesMan1 = new SalesMan("Robert Wolf", 789123, 25, "Zalando", 30000, 500000, 20);
        SalesMan salesMan2 = new SalesMan("Kate Roberts", 147852, 23, "Zalando", 28000, 350000, 15);
        SalesMan salesMan3 = new SalesMan("Bella Right", 354455, 28, "Zalando", 27000, 200000, 10);
        WageEmployee wageEmployee1 = new WageEmployee("Kevin Schmidt", 258963, 20, "Wolt", 12000, 120, 10);
        WageEmployee wageEmployee2 = new WageEmployee("Joe Fischer", 147852, 22, "Wolt", 11000, 100, 9);
        WageEmployee wageEmployee3 = new WageEmployee("Andrew Hirsch", 147852, 22, "Wolt", 11000, 110, 11);

        Employee[] emps = new Employee[]{manager1, manager2, manager3, salesMan1, salesMan2, salesMan3, wageEmployee1, wageEmployee2, wageEmployee3};
        printAllEmployees(emps);
        System.out.println("______________________________");
        System.out.println("Total salary of all employees: " + getSumSalaryAllEmployees(emps));
        System.out.println("______________________________");
        printEmpsWithSalaryMoreThan(emps, 25000);
        System.out.println("______________________________");
        System.out.println("Total sales made by salesmen: " +getСompanyRevenue(emps));

    }

    private static double getСompanyRevenue(Employee[] emps) {
        double result = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof SalesMan) {
                result += ((SalesMan) emps[i]).totalSales;
            }
        }
        return result;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].calcSalary() >= salary) {
                System.out.println("Employee " + emps[i].getName() + " has salary more than " + salary);
            }
        }

    }


    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double result = 0;
        for (int i = 0; i < emps.length; i++) {
            result += emps[i].calcSalary();

        }
        return result;
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee element : emps) {
            System.out.println(element.toString());
        }
    }


}
