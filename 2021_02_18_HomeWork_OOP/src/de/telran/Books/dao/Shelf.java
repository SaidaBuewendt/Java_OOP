package de.telran.Books.dao;

import de.telran.Books.data.Book;

public class Shelf {
    public Book[] books; //array
    public int size;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PINK = "\u001B[35m";

    public Shelf(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            System.out.println(ANSI_GREEN + "Книга добавлена" + ANSI_RESET);
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book item) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(item)) {
                books[i] = books[size - 1];
                size--;
                System.out.println(ANSI_RED + "Книга удалена" + ANSI_RESET);
                return true;

            }
        }
        return false;
    }


    public void bubbleSort() {
        int check = 1;
        while (check > 0) {
            check = 0;
            for (int i = 0; i < size - 1; i++) {
                if (books[i].numberOfPages > books[i + 1].numberOfPages) {
                    Book temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                    check++;
                }
            }
        }
        printWithPages();
    }

    public void printWithPages() {
        System.out.println(ANSI_PINK + "Пузырьковая сортировка по количеству страниц: " + ANSI_RESET);
        for (int i = 0; i < size; i++) {
            System.out.print(books[i].name + " [" + books[i].numberOfPages + "]\n");
        }
    }


    public void cocktailSort() {
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (books[i].getYear() > books[i + 1].getYear()) {
                    int temp = books[i].getYear();
                    books[i].setYear(books[i + 1].getYear());
                    books[i + 1].setYear(temp);
                    swap = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (books[i].getYear() < books[i - 1].getYear()) {
                    int temp = books[i - 1].getYear();
                    books[i - 1].setYear(books[i].getYear());
                    books[i].setYear(temp);
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
        printWithYear();
    }

    public void printWithYear() {
        System.out.println(ANSI_PINK + "Коктейльная сортировка по Дате издания:" + ANSI_RESET);
        for (int i = 0; i < size; i++) {
            System.out.print(books[i].name + " [" + books[i].year + "]\n");
        }
    }
}
