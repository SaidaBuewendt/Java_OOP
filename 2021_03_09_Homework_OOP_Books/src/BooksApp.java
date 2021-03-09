
public class BooksApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Война и мир");
        book1.setAuthor("Л.Н. Толстой");
        book1.setCountPages(1120);
        book1.setIsbn(1234567);
        book1.setPricePerPage(0.97);

        Book book2 = new Book();
        book2.setTitle("Шантарам");
        book2.setAuthor("Р.Г. Дэвид");
        book2.setCountPages(552);
        book2.setIsbn(7891234);
        book2.setPricePerPage(0.63);

        Book book3 = new Book();
        book3.setTitle("Убить пересмешника");
        book3.setAuthor("Х. Ли");
        book3.setCountPages(415);
        book3.setIsbn(1454465);
        book3.setPricePerPage(0.69);

        Book book4 = new Book();
        book4.setTitle("Тонкое искусство пофигизма.");
        book4.setAuthor("М. Мэнсон");
        book4.setCountPages(192);
        book4.setIsbn(6555215);
        book4.setPricePerPage(2.16);

        Book book5 = new Book();
        book5.setTitle("Королевство");
        book5.setAuthor("Ю. Несбё");
        book5.setCountPages(576);
        book5.setIsbn(3698521);
        book5.setPricePerPage(0.92);

        Book book6 = new Book();
        book6.setTitle("Краткая история времени");
        book6.setAuthor("С. Хокинг");
        book6.setCountPages(272);
        book6.setIsbn(9876541);
        book6.setPricePerPage(2.36);

        Book[] books = new Book[]{book1, book2, book3, book4, book5, book6};

        printBooks(books);
        getTotalPrice(books);
    }

    private static double getTotalPrice(Book[] books) {
        double result=0;
        for (int i = 0; i < books.length; i++) {
           double oneBookPrice=books[i].getPricePerPage()*books[i].getCountPages();
           result+=oneBookPrice;
        }
        double priceRound = (double) Math.round(result*100)/100;
        System.out.println("Стоимость всех книг в массиве: " + priceRound + " руб.");
        return priceRound;
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }


}
