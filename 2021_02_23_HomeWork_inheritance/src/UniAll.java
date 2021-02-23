import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UniAll {
    public Person[] people;
    public int size;

    public UniAll(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    public boolean addPeople(Person human) {
        if (size < people.length) {
            people[size] = human;
            size++;
            return true;
        }
        return false;
    }


    public boolean deletePeople(Person human) {
        for (int i = 0; i < size; i++) {
            if (people[i].equals(human)) {
                people[i] = people[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {
        int check = 1;
        while (check > 0) {
            check = 0;
            for (int i = 0; i < size - 1; i++) {
                if (people[i].getAge() > people[i + 1].getAge()) {
                    Person temp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                    check++;
                }
            }
        }
        print();

    }

    public void print() {
        System.out.println("Сортировка по возрасту:");
        for (int i = 0; i < size; i++) {
            System.out.println("ФИО: " + people[i].getFirstName() +" "+  people[i].getSecondName() +". Возраст: " + people[i].getAge()+ ". " + people[i].toString());
        }
    }

}

