package de.telran.Books.app;

import de.telran.Books.dao.Shelf;
import de.telran.Books.data.Book;

public class StartApplication {
    public static void main(String[] args) {
        Shelf shelf1 = new Shelf(10);

        Book WarAndPeace = new Book("Война и мир", "Л.Н. Толстой", 1000, "Твердый", 2013);
        Book Cooking = new Book("Книга о вкусной и здоровой пище", "Погожева А.В.", 70, "Мягкий", 2016);
        Book Shantaram = new Book("Шантарам", "Робертс Грегори Дэвид", 800, "Твердый", 2015);
        Book KillMockingBird = new Book("Убить пересмешника", "Харпер Ли", 350, "Мягкий", 2018);
        Book Azbuka = new Book("Азбука", "Дмитриева", 33, "Твердый", 2019);

        System.out.println(WarAndPeace.toDisplay());
        System.out.println(Azbuka.toDisplay());
        System.out.println(Shantaram.toDisplay());
        System.out.println(KillMockingBird.toDisplay());
        System.out.println(Cooking.toDisplay());
        System.out.println("Начальное количество книг на полке:" + shelf1.size);
        shelf1.addBook(WarAndPeace);
        shelf1.addBook(Shantaram);
        shelf1.addBook(KillMockingBird);
        shelf1.addBook(Azbuka);
        shelf1.addBook(Cooking);
        System.out.println("Количество книг на полке после добавления:" + shelf1.size);
        System.out.println();
        shelf1.deleteBook(Azbuka);
        shelf1.deleteBook(Cooking);
        System.out.println("Количество книг на полке после удаления:" + shelf1.size);
        System.out.println();
        shelf1.bubbleSort();
        System.out.println();
        shelf1.cocktailSort();

    }
}
