public class Elephant extends Animal{
    public Elephant(String type, String name, int age) {
        super(type, name, age);
    }
    void moves() {
        this.stays();
    }

    void stays(){
        System.out.println("Слон задумчиво стоит");
    }

    @Override
    void eats() {
        System.out.println("Слон ест траву");
    }

    @Override
    void sounds() {
        System.out.println("Слон трубит");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
