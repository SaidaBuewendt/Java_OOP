package inheritance;

public class Worker extends Person {
    private String section;
    private String uniform;

    public Worker(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);

    }

    @Override
    void eats() {
        System.out.println("Еду надо ещё заслужить!");
    }

    void works() {
        System.out.println("Я работаю");
    }

    void walks() {
        System.out.println("Я иду");
    }
}