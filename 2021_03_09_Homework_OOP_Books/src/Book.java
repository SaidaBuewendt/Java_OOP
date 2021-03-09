public class Book {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;


    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.countPages = countPages;
        this.pricePerPage = pricePerPage;
    }

    public Book() {

    }


    public void setIsbn(long isbn) {
        if (isbn > 1 && isbn < 9999999)
            this.isbn = isbn;
        else
            System.out.println("Wrong ISBN");
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty())
            this.author = author;
        else System.out.println("Author is empty");
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty())
            this.title = title;
        else
            System.out.println("Title is empty");
    }

    public void setCountPages(int countPages) {
        if (countPages > 0 && countPages < 5000)
            this.countPages = countPages;
        else System.out.println("Wrong number of pages");
    }

    public int getCountPages() {
        return countPages;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0)
            this.pricePerPage = pricePerPage;
        else System.out.println("Wrong price");
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}

