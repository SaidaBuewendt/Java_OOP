package de.telran.Users.data;

public class User {
    public String firstname;
    public String lastname;
    public String email;
    public int age;
    public String occupation;
    public boolean registered;


    public User(String firstname, String lastname, String email, int age, String occupation, boolean registered) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.email=email;
        this.age = age;
        this.occupation = occupation;
        this.registered = registered;
    }

    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setAge(int age) {
        this.age = age;
    }

    void getOccupation(String occupation) {
        this.occupation = occupation;
    }

    void isRegistered(boolean registered) {
        this.registered = registered;
    }
}
