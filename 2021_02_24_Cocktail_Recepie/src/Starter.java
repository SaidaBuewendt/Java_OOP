public class Starter {
    public static void main(String[] args) {
        // cocktailIntro();
        Ingredient vodka = new Ingredient("Водка", 100, 40);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);
        Cocktail disko = new Cocktail("Диско", energiser, vodka);

        Almanach best100CocktailsInTheWorld = new Almanach(100);
        best100CocktailsInTheWorld.addCocktail(disko);
    }

    private static void cocktailIntro() {
        Ingredient vodka = new Ingredient("Водка", 100, 40);
        Ingredient tomateJuice = new Ingredient("Томатный сок", 100, 0);
        Ingredient cola = new Ingredient("Кола", 100, 0);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);
        Cocktail bloodyMary = new Cocktail("Кровавая Мери", vodka, tomateJuice);
        Cocktail disko = new Cocktail("Диско", energiser, vodka);
        Cocktail berlinNull = new Cocktail("Нулёвочка", cola, energiser);
        System.out.println(disko);

        System.out.println("----------------");

        System.out.println(berlinNull);
    }
}