package model;

public class Horse extends Cattle{
    public Horse(){
    }
    public Horse(String name, double age, double weight, boolean gender, boolean horns){
        super(name, age, weight, gender, horns);
    }
    @Override
    public void voice(){
        System.out.println("Igo-go");
    }
    @Override
    public void benefit(){
        System.out.println("I can ride throw the farm");
    }
}
