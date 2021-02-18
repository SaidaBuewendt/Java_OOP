package de.telran.data;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private boolean pass;

    //public - виден везде
    //protrcted - виден внутри package и сабклассам


    Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void move() {
        System.out.println("Я двигаюсь!");
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setAge(int age) { //использовала такое же имя, это ок
        this.age = age;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setPass(boolean pass) {
        this.pass = pass;
    }

    public boolean isPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}


class TestCat {
    public static void main(String[] args) {
        Cat catchen = new Cat("Барсик", 1, "Персидский");
        catchen.move();
        catchen.setName("Ася");
        catchen.setAge(5);
        catchen.setBreed("Сибирская");
        System.out.println(catchen.isPass());
        System.out.println(catchen.getName());
    }
}