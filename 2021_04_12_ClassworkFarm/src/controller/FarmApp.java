package controller;

import farm.model.*;


public class FarmApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Prototype",1,1,true);
        System.out.println(animal.printInfo());
        animal.voice();
        animal.benefit();
        Cat cat = new Cat("Pushok",3.5,9.5,true);
        System.out.println(cat.printInfo());
        cat.voice();
        cat.benefit();
        Dog dog = new Dog("Sharik",6,25.7,true,true);
        System.out.println(dog.printInfo());
        dog.voice();
        dog.benefit();
        ExpoDog expoDog = new ExpoDog("",0.5,3.3, true,true);
        ServiceDog serviceDog = new ServiceDog("Muhtar",9.5,33.3, true,true);
        System.out.println(expoDog.printInfo());
        expoDog.benefit();
        System.out.println(serviceDog.printInfo());
        serviceDog.benefit();
        Cow cow = new Cow("Burenka",6,550,false,true);
        cow.benefit();
        cow.voice();
        System.out.println(cow.printInfo());
        Horse horse = new Horse("Zarya",7,550,true,false);
        horse.voice();
        horse.benefit();
        System.out.println(horse.printInfo());
        Animal[]animals = new Animal[5];
        animals[0]=cat;
        animals[1]=serviceDog;
        animals[2]=expoDog;
        animals[3]=cow;
        animals[4]=horse;

//        Cow maybeACow = (Cow)animals[3];
//        System.out.println(maybeACow.hasHorns());
//
//        maybeACow = (Cow)animals[0];
//        System.out.println(maybeACow.hasHorns());

        for (int i = 0;i<animals.length;i++){
            animals[i].voice();
            animals[i].benefit();
            System.out.println(animals[i].printInfo());
        }

    }
}
