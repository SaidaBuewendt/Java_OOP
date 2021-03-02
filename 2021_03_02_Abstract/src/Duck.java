public class Duck extends Pet {

    //implemented  - абстрактные методы
    //override -  super.methods

    void moves() {
        this.swims();
    }

    void swims() {
        System.out.println("Duck swims");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public void eats() {
        super.eats();
        System.out.println("Двухразовое питание");}

    @Override
    void sleeps() {

    }
}
