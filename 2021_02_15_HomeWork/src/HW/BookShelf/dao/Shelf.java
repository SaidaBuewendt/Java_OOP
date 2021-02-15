package HW.BookShelf.dao;

import HW.BookShelf.data.Book;

public class Shelf {
    public Book[] books;
    public int size;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

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
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].numberOfPages > books[i + 1].numberOfPages) {
                    int temp = books[i].numberOfPages;
                    books[i].numberOfPages = books[i + 1].numberOfPages;
                    books[i + 1].numberOfPages = temp;
                    check++;
                }

            }
        }
    }

    public void print() {
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name + " [" + books[i].numberOfPages + "]\n");
        }
    }


}
