package de.telran.application;

import de.telran.dao.Group;
import de.telran.data.Student;

public class MyStart {
    public static void main(String[] args) {
        Group group17 = new Group(5);
        Student sasha = new Student("Sasha", "Ivanov", 30);
        group17.addStudent(sasha);
        System.out.println(group17.size);
        Student dasha= new Student("Dasha", "Chizhikova", 25);
        group17.addStudent(dasha);
        System.out.println(group17.size);
        Student glasha = new Student("Glasha", "Vasileva", 18);
        System.out.println(group17.addStudent(glasha));
        System.out.println(group17.size);
        Student masha = new Student("Masha", "Kovaleva", 40);
        System.out.println("Adding new student: " + group17.addStudent(masha));
        //удаление
        System.out.println("Deleting student: "+ group17.deleteStudentFromGroup(sasha));
        System.out.println(group17.size);

    }

}
