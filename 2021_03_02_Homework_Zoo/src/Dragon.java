public class Dragon extends Animal {
    String color;

    public Dragon(String type, String name, int age) {
        super(type, name, age);
        color = "Чёрный";
    }

    void moves() {
        this.flies();
    }

    void flies() {
        System.out.println(color + " Дракон улетел в закат");
    }

    @Override
    void eats() {
        System.out.println(color +" Дракон ест единорогов");
    }

    @Override
    void sounds() {
        System.out.println(color +" Дракон извергает пламя");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
