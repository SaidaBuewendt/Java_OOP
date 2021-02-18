package de.telran.Users.dao;

import de.telran.Users.data.User;

public class Group {
    public User[] users;
    public int size;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public Group(int capacity) {
        users = new User[capacity];
        size = 0;
    }


    public boolean addUser(User user) {
        if (size < users.length) {
            users[size] = user;
            size++;
            System.out.println(ANSI_GREEN + "Пользователь " + ANSI_RESET + user.firstname + " " + user.lastname + ANSI_GREEN + " добавлен" + ANSI_RESET);
            return true;
        }
        return false;
    }

    public boolean deleteUser(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(user)) {
                users[i] = users[size - 1];
                size--;
                System.out.println(ANSI_RED + "Пользователь " + ANSI_RESET + user.firstname +" "+ user.lastname + ANSI_RED + " удален" + ANSI_RESET);
                return true;
            }
        }
        return false;
    }

}
