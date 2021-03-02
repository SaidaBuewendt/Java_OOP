public class TestAnimal {
    public static void main(String[] args) {
        Elephant dumbo = new Elephant("Слон", "Дамбо", 10);
        System.out.println(dumbo);
        dumbo.moves();
        dumbo.eats();
        dumbo.sounds();
        System.out.println("__________");

        Lion simba = new Lion("Лев", "Симба", 3);
        System.out.println(simba);
        simba.moves();
        simba.eats();
        simba.sounds();
        System.out.println("__________");

        Dragon draco = new Dragon("Дракон", "Змей Горыныч", 500);
        System.out.println(draco);
        draco.moves();
        draco.eats();
        draco.sounds();
        System.out.println("__________");


    }
}
