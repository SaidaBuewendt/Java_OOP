public class xyzMiddle {
    public static void main(String[] args) {
        //Given a string, does “xyz” appear in the middle of the string?
        //To define middle, we’ll say that the number of chars to the left and right of the “xyz” must differ by at most one. This problem is harder than it looks.
        System.out.println(xyzMiddle("AAxyzBB")); //true
        System.out.println(xyzMiddle("AxyzBB"));//true
        System.out.println(xyzMiddle("AxyzBBB"));//false

    }

    private static boolean xyzMiddle(String input) {

        return false;
    }
}

