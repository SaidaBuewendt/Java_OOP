package model;

public class Dog extends Animal {
    private boolean isAGoodDog;

    public Dog() {
    }

    public Dog(String name, double age, double weight, boolean gender, boolean isAGoodDog) {
        super(name, age, weight, gender);
        this.isAGoodDog = isAGoodDog;
    }

    public boolean isAGoodDog() {
        return this.isAGoodDog;
    }
    public void setIsAGoodDog(boolean isAGoodDog){
        this.isAGoodDog = isAGoodDog;
    }

    @Override
    public void voice(){
        System.out.println("Woof woof");
    }
    @Override
    public void benefit(){
        System.out.println("I defend the farm");
    }
    @Override
    public String printInfo(){
        return super.printInfo()+", is a good dog: "+isAGoodDog;
    }

}