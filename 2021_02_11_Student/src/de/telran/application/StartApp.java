package de.telran.application;

import de.telran.data.Student;

public class StartApp {
    public static void main(String[] args) {
        Student vasya = new Student();
        Student sergey = new Student();
        Student varvara = new Student();
        Student avdotya = new Student("Авдотья", "Никитина", 18);
        System.out.println(avdotya.studentID);
        System.out.println(vasya.studentID);
        System.out.println(sergey.studentID);
        System.out.println(varvara.studentID);
        System.out.println(vasya.toDisplay());
        System.out.println(avdotya.toDisplay());
        Student[] groupTUBerlin = new Student[]{vasya, sergey, varvara, avdotya};
        //System.out.println(group[3].age);
        studentsPrint(groupTUBerlin);
    }

    public static void studentsPrint(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].toDisplay());
        }
    }
}
