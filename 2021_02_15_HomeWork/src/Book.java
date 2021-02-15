public class Book {
    String name;
    String ISBN;
    String author;
    int year;
    int numberOfPages;
    String binding;
    String genre;
    double rating;
    double price;

    public final static String ANSI_RESET = "\u001B[0m";
    public final static String ANSI_BLUE = "\u001B[34m";
    public final static String ANSI_PURPLE = "\u001B[35m";


    public Book(String name, String author, double rating) {
        this.name = name;
        this.author = author;
        this.rating = rating;
        System.out.println("Рекомендуем прочитать книгу с рейтингом " + ANSI_BLUE + rating + ANSI_RESET + ": " + "\n" + "<<" + name + ">>." + " Автор: " + author);
    }

    public Book(String name, String author, String ISBN, int year, String genre) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
        this.genre = genre;
        System.out.println(ANSI_PURPLE + "Информация для библиотекаря." + ANSI_RESET+"Читателю нужна книга: " +  "<<" + name + ">>." + " Автор: " + author + ". Находится в разделе: " + genre + ". ISBN: " + ISBN + ". " + "Год выпуска: " + year);

    }

}

class BookInfo {
    public static void main(String[] args) {


        Book book1 = new Book("Война и мир", "Лев Толстой", 9.78);
        book1.name = "Война и мир";
        book1.author = "Толстой Л.Н.";
        book1.year = 2013;
        book1.numberOfPages = 1504;
        book1.binding = "Твердый";
        book1.genre = "Роман";
        book1.rating = 9.78;
        book1.price = 900;


        Book book2 = new Book("Убить пересмешника", "Харпер Ли", 8.92);
        book2.name = "Убить пересмешника";
        book2.ISBN = "978-5-17-090411-2";
        book2.author = "Харпер Ли";
        book2.year = 2018;
        book2.numberOfPages = 416;
        book2.binding = "Мягкий";
        book2.genre = "Роман";
        book2.rating = 8.92;
        book2.price = 315;


        Book book3 = new Book("Шантарам", "Робертс Грегори Дэвид", 8.55);
        book3.name = "Шантарам";
        book3.ISBN = "978-5-389-01095-6";
        book3.author = "Робертс Грегори Дэвид";
        book3.year = 2015;
        book3.numberOfPages = 864;
        book3.binding = "Твердый";
        book3.genre = "Роман";
        book3.rating = 8.55;
        book3.price = 1200;


        Book book4 = new Book("Азбука", "Дмитриева В.Г.", "978-5-17-117512-2", 2019, "Обучающая литература");
        book4.name = "Азбука";
        book4.ISBN = "978-5-17-117512-2";
        book4.author = "Дмитриева В.Г.";
        book4.year = 2019;
        book4.numberOfPages = 64;
        book4.binding = "Мягкий";
        book4.genre = "Обучающая литература";
        book4.rating = 9.0;
        book4.price = 101;


        Book book5 = new Book("Книга о вкусной и здоровой пище", "Погожева А.В.", "978-5-699-88867-2", 2016, "Кулинария");
        book5.name = "Книга о вкусной и здоровой пище";
        book5.ISBN = "978-5-699-88867-2";
        book5.author = "Погожева А.В.";
        book5.year = 2016;
        book5.numberOfPages = 320;
        book5.binding = "Твердый";
        book5.genre = "Кулинария";
        book5.rating = 6.67;
        book5.price = 518;

    }
}