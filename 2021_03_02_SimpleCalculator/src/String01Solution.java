public class String01Solution {
    public String helloName(String name) {
        return "Hello, " + name + "!";
    }

/*    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
    }*/
}

class TestString01 {
    public static void main(String[] args) {
        String01Solution myFirstObject = new String01Solution();
        System.out.println(myFirstObject.helloName("Andrew"));
        String01Solution jurgen = new String01Solution();
        System.out.println(jurgen.helloName("Jurgen"));
    }
}