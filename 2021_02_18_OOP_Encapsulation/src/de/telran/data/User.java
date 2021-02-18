package de.telran.data;

public class User {
    private String name;
    private String nick;
    private String email;
    private double BMI;
    private double height;
    private double weight;


    User(String name, String nick, String email, double height, double weight) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.height = height;
        this.weight = weight;
        setBMI();
    }

    private void setBMI() { //Юзер не может использовать данный сеттер
        //ЛОГИКА
        double h=height/100;
        BMI = weight / (h * h);

    }

    public double getBMI() {
        return BMI;
    }
}

class TestUser {
    public static void main(String[] args) {
        User myLovelyUser = new User("Василий", "Hausmaster", "вася@пупкин.ру", 200, 100);
        System.out.println(myLovelyUser.getBMI());
    }
}