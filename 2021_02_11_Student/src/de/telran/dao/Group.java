package de.telran.dao;

import de.telran.data.Student;

public class Group {
    public Student[] students;
    public int size;

    public Group(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public boolean addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        }

        return false;
    }

    public boolean deleteStudentFromGroup(Student person) {
        //equals
        for (int i = 0; i < size; i++) {
            if (students[i].equals(person)) {
            // необходимо:
                //удалть Итый элемент
                //перетащть последний элемент на место удаленного
                //уменьшить размер
                //действия с последним:
                //1
                //students[i] = null;
                students[i] = students[size-1];
                //students[size-1] = null; на выбор, будет работать и так и так, тк это после SIZE
                size--;
                return true;
            }
        }

        return false;
    }

}
