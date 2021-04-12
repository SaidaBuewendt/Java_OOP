package model;

public class Animal {
    protected String name;
    private double age;
    private double weight;
    private boolean gender;

    public Animal() {}

    public Animal(String name, double age, double weight, boolean gender) {
        if (name.isEmpty()) {
            this.name = "Default name";
        } else {
            this.name = name;
        }
        setAge(age);
        setWeight(weight);
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // !true = false
        // !false = true
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String printInfo() {
        String strGender = gender ? "" : "";
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Gender: " + gender;
    }

    public void voice(){
        System.out.println("Default voice");
    }

    public void benefit(){
        System.out.println("I'm prototype of all animals");
    }

}
