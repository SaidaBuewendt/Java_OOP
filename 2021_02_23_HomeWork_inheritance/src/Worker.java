public class Worker extends Person {
    private String section;
    private String uniform;

    public Worker(String firstName, String secondName, String uniID, int age, String section, String uniform) {
        super(firstName, secondName, uniID, age);
        this.section = section;
        this.uniform = uniform;
    }

    @Override
    public String toString() {
        return "Рабочий{" +
                "Прикреплен к территории='" + section + '\'' +
                ", Униформа='" + uniform + '\'' +
                '}';
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