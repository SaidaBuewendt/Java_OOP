import sun.java2d.loops.DrawGlyphListAA;

public class StartApplication {
    public static void main(String[] args) {

        Student pasha = new Student("Паша", "Алексеев", "43534", "Физический факультет", 20, 3.5, 3, 123456);
        Person dasha = new Student("Даша", "Семёнофф", "5345243", "Химический факультет", 19, 4.0, 2, 456789);
        Object rita = new Student("Даша", "Семёнофф", "5345243", "Химический факультет", 19, 4.0, 2, 456789);

        Teacher borisov = new Teacher("Борис Борисович", "Борисов", "1998_0112", 50, "Фактультет Математики", "borisov@borisov.ru", 3000, 512, "Доктор наук");
        Person ivanov = new Teacher("Иван Иванович", "Иванов", "1998_0111", 45, "Фактультет Кибернетики", "ivanov@ivanov.ru", 2500, 112, "Кандидат наук");
        //Object petrov = new Teacher("Петр Петрович", "Петров", "2000_255", 2700, 210, "Кандидат наук");

        Worker garden = new Worker("Сергей", "Ромашкин", "2019_555", 35, "Сад", "зеленая");
        Person building = new Worker("Роман", "Метелкин", "2020_777", 40, "Главный корпус", "серая");
        Person labor = new Worker("Светлана", "Колбочкина", "2020_333", 29, "Лаборатория", "синяя");
        //Object laboratory = new Worker("Елена", "Стеклова", "2018_333", "Лаборатория", "синяя");

        UniAll univer = new UniAll(10);
        univer.addPeople(pasha);
        univer.addPeople(dasha);
        univer.addPeople((Student) rita);
        univer.addPeople(borisov);
        univer.addPeople(ivanov);
        //univer.addPeople(petrov);
        univer.addPeople(garden);
        univer.addPeople(building);
        univer.addPeople(labor);
        univer.bubbleSort();
        univer.deletePeople(pasha);
        univer.deletePeople(borisov);
        univer.deletePeople(garden);
        univer.bubbleSort();


    }
}

