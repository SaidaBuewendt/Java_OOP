public abstract class Figure {
    double length;

    public Figure(double length) {
        this.length = length;
    }

    public Figure() {

    }

    public double getLength() {
        return length;
    }


    public abstract double calcSquare();

    public abstract double calcPerimeter();
}