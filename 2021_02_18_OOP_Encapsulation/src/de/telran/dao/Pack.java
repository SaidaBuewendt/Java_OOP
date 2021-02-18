package de.telran.dao;

import de.telran.data.Cat;

public class Pack { //Класс и Тип данных
    private Cat[] cats;
    private int size;

    public Pack(int capacity) { //Констуктор
        cats = new Cat[capacity]; //Новый тип даннных - кошки (контейнер
        size = 0; //индекс массива
    }

    public boolean addCat(Cat cat) {
        if (size < cats.length) {
            cats[size] = cat;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCat() {
        for (int i = 0; i < size; i++) {
            if (cats[i].equals(cats)) {
                cats[i] = cats[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

}
