public class Swan {
    String type;
    String color;
    String name;
    int age;
    boolean wild;
    int distance;

    public void fly(int km) {
        System.out.println("Лебедь улетел на " + km + " километров");
        distance += km;
    }

    public void displayInfo() {
        System.out.println("Вид лебедя: " + type);
        System.out.println("Цвет лебедя: " + color);
        System.out.println("Среда обитания: " + (wild ? "Дикий" : "Домашний"));
        System.out.println("Имя лебедя: " + name);
        System.out.println("Возраст лебедя: " + age);
        System.out.println("_____________");
    }
}


class SwanInfo {
    public static void main(String[] args) {
        Swan swan1 = new Swan();
        swan1.type = "Cygnus columbianus";
        swan1.color = "Серый";
        swan1.name = "Дикарь";
        swan1.age = 2;
        swan1.wild = true;
        swan1.fly(20);
        swan1.displayInfo();

        Swan swan2 = new Swan();
        swan2.type = "Cygnus buccinator";
        swan2.color = "Черный";
        swan2.name = "Трубач";
        swan2.age = 3;
        swan2.wild = false;
        swan2.fly(10);
        swan2.displayInfo();

        Swan swan3 = new Swan();
        swan3.type = "Cygnus olor";
        swan3.color = "Белый";
        swan3.name = "Шипун";
        swan3.age = 5;
        swan3.wild = true;
        swan3.fly(30);
        swan3.displayInfo();
    }


}
