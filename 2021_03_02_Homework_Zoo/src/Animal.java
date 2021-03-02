abstract class Animal {
    String type;
    String name;
    int age;

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    abstract void moves();

    abstract void eats();

    abstract void sounds();
}
