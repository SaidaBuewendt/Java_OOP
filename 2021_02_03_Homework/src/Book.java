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

    public void displayInfo() {
        System.out.println("Название книги: " + name);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Год издания: " + year);
        System.out.println("Страниц: " + numberOfPages);
        System.out.println("Переплет: " + binding);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("_____________");
    }


}

class BookInfo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Азбука";
        book1.ISBN = "978-5-17-117512-2";
        book1.author = "Дмитриева В.Г.";
        book1.year = 2019;
        book1.numberOfPages = 64;
        book1.binding = "Мягкий";
        book1.genre = "Обучающая литература";
        book1.rating = 9.0;
        book1.price = 101;
        book1.displayInfo();

        Book book2 = new Book();
        book2.name = "Война и мир";
        book2.ISBN = "978-5-389-06256-6";
        book2.author = "Толстой Л.Н.";
        book2.year = 2013;
        book2.numberOfPages = 1504;
        book2.binding = "Твердый";
        book2.genre = "Роман";
        book2.rating = 9.78;
        book2.price = 900;
        book2.displayInfo();

        Book book3 = new Book();
        book3.name = "Книга о вкусной и здоровой пище";
        book3.ISBN = "978-5-699-88867-2";
        book3.author = "Погожева А.В.";
        book3.year = 2016;
        book3.numberOfPages = 320;
        book3.binding = "Твердый";
        book3.genre = "Кулинария";
        book3.rating = 6.67;
        book3.price = 518;
        book3.displayInfo();

        Book book4 = new Book();
        book4.name = "Убить пересмешника";
        book4.ISBN = "978-5-17-090411-2";
        book4.author = "Харпер Ли";
        book4.year = 2018;
        book4.numberOfPages = 416;
        book4.binding = "Мягкий";
        book4.genre = "Роман";
        book4.rating = 8.92;
        book4.price = 315;
        book4.displayInfo();

        Book book5 = new Book();
        book5.name = "Шантарам";
        book5.ISBN = "978-5-389-01095-6";
        book5.author = "Робертс Грегори Дэвид";
        book5.year = 2015;
        book5.numberOfPages = 864;
        book5.binding = "Твердый";
        book5.genre = "Роман";
        book5.rating = 8.55;
        book5.price = 1200;
        book5.displayInfo();

    }
}