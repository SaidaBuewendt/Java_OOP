public class Lion extends Animal{
    public Lion(String type, String name, int age) {
        super(type, name, age);
    }
    void moves() {
        this.lays();
    }

    void lays(){
        System.out.println("Лев лежит на солнце");
    }

    @Override
    void eats() {
        System.out.println("Лев ест мясо");
    }

    @Override
    void sounds() {
        System.out.println("Лев рычит");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
