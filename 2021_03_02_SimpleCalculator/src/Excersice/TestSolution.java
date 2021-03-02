package Excersice;

public class TestSolution {
    public static void main(String[] args) {
        Solution sol1 = new Solution();

        sol1.firstHalf("WooHoo");
        if (sol1.firstHalf("WooHoo").equals("Woo")) {
            System.out.println("Всё ок!");
        } else {
            System.out.println("Всё снова поломалось");
        }

        if (!sol1.firstHalf("WooHoo").equals("Andrej")) {
            System.out.println("Всё ок");
        } else {
            System.out.println("Всё поломалось");
        }
        sol1.nonStart("Hello", "There");
    }
}