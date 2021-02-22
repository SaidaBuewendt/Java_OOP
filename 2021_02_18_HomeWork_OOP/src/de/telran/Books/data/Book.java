package de.telran.Books.data;

public class Book {
    private String name;
    private String ISBN;
    private String author;
    private int year;
    private int numberOfPages;
    private String binding;
    private String genre;
    private double rating;
    private double price;
    private String review;
    private boolean used;

    static int count = 1;
    public int bookID;

    public final static String ANSI_RESET = "\u001B[0m";
    public final static String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public Book(String name, String author, int numberOfPages, String binding, int year) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.binding = binding;
        this.year = year;
        bookID = count;
        count++;
    }

    public String toDisplay() {
        return ANSI_PURPLE + "Экземпляр книги на полке: " + ANSI_RESET + "\n" +
                ANSI_BLUE + "Название: " + ANSI_RESET + name + "\n" +
                ANSI_BLUE + "Автор: " + ANSI_RESET + author + "\n" +
                ANSI_BLUE + "Количество страниц: " + ANSI_RESET + numberOfPages + "\n" +
                ANSI_BLUE + "Переплет: " + ANSI_RESET + binding + "\n" +
                ANSI_BLUE + "Порядковый номер на полке: " + ANSI_RESET + bookID + "\n___________";
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    void setBinding(String binding) {
        this.binding = binding;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }


    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public boolean isUsed() {
        return used;
    }


}

class BookInfo {
    public static void main(String[] args) {


        Book book1 = new Book("Война и мир", "Лев Толстой", 1000, "Твердый", 2013);
/*        book1.name = "Война и мир";
        book1.author = "Толстой Л.Н.";
        book1.year = 2013;
        book1.numberOfPages = 1504;
        book1.binding = "Твердый";
        book1.genre = "Роман";
        book1.rating = 9.78;
        book1.price = 900;*/


        Book book2 = new Book("Убить пересмешника", "Харпер Ли", 350, "Мягкий", 2018);
/*        book2.name = "Убить пересмешника";
        book2.ISBN = "978-5-17-090411-2";
        book2.author = "Харпер Ли";
        book2.year = 2018;
        book2.numberOfPages = 416;
        book2.binding = "Мягкий";
        book2.genre = "Роман";
        book2.rating = 8.92;
        book2.price = 315;*/


        Book book3 = new Book("Шантарам", "Робертс Грегори Дэвид", 800, "Твердый", 2015);
/*        book3.name = "Шантарам";
        book3.ISBN = "978-5-389-01095-6";
        book3.author = "Робертс Грегори Дэвид";
        book3.year = 2015;
        book3.numberOfPages = 864;
        book3.binding = "Твердый";
        book3.genre = "Роман";
        book3.rating = 8.55;
        book3.price = 1200;*/


        Book book4 = new Book("Азбука", "Дмитриева В.Г.", 33, "Твердый", 2019);
/*        book4.name = "Азбука";
        book4.ISBN = "978-5-17-117512-2";
        book4.author = "Дмитриева В.Г.";
        book4.year = 2019;
        book4.numberOfPages = 64;
        book4.binding = "Мягкий";
        book4.genre = "Обучающая литература";
        book4.rating = 9.0;
        book4.price = 101;*/


        Book book5 = new Book("Книга о вкусной и здоровой пище", "Погожева А.В.", 70, "Мягкий", 2016);
/*        book5.name = "Книга о вкусной и здоровой пище";
        book5.ISBN = "978-5-699-88867-2";
        book5.author = "Погожева А.В.";
        book5.year = 2016;
        book5.numberOfPages = 320;
        book5.binding = "Твердый";
        book5.genre = "Кулинария";
        book5.rating = 6.67;
        book5.price = 518;
*/
    }
}
