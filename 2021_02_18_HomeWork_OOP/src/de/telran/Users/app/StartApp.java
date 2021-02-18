package de.telran.Users.app;

import de.telran.Users.dao.Group;
import de.telran.Users.data.User;

public class StartApp {
    public static void main(String[] args) {
        Group group1 = new Group(10);
        User user001 = new User("Peter", "Smith", "peter@peter.com", 33, "programmer", true);
        User user002 = new User("Mary", "Miller", "mary@mary.com", 20, "student", false);
        User user003 = new User("Jane", "White", "jane@jane.com", 35, "manager", true);
        User user004 = new User("John", "Gold", "john@john.com", 40, "director", true);
        User user005 = new User("Agatha", "Christy", "agatha@agatha.com", 85, "writer", false);
        group1.addUser(user001);
        group1.addUser(user002);
        group1.addUser(user003);
        group1.addUser(user004);
        group1.addUser(user005);
        group1.deleteUser(user001);
        group1.deleteUser(user002);
    }

}
