public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article("Достопримечательности Берлина", "Текст статьи");
        Article art2 = new Article("Достопримечательности Потсдама", "Тест статьи");
        System.out.println(art1.title);
        System.out.println(art2.announce);
        //Создали конструктор с параметрами

        Article art3 = new Article(1, "Самая интересная статья в мире", "Я памятник себе воздвиг нерукотворный");
        System.out.println(art3.title);
    }
}
