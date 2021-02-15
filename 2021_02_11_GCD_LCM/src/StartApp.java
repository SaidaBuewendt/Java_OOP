public class StartApp {
    public static void main(String[] args) {
        System.out.println(Math.euclideanAlgorithmWhile(25, 15));
        System.out.println(Math.euclideanAlgorithmWhile(37, 36));//1
        System.out.println(Math.euclideanAlgorithmWhile(12, 48));//12
        System.out.println("____________");
        System.out.println(Math.euclideanAlgorithmDoWhile(25, 15));
        System.out.println(Math.euclideanAlgorithmDoWhile(37, 36));//1
        System.out.println(Math.euclideanAlgorithmDoWhile(12, 48));//12
        System.out.println("____________");
        System.out.println(Math.gcdAlgorithmModern(25, 15));
        System.out.println(Math.gcdAlgorithmModern(37, 36));
        System.out.println(Math.gcdAlgorithmModern(12, 48));
        System.out.println("____________");
        System.out.println(Math.gcdRecursionAlgorithm(25, 15));
        System.out.println(Math.gcdRecursionAlgorithm(37, 36));
        System.out.println(Math.gcdRecursionAlgorithm(12, 48));
    }


}
