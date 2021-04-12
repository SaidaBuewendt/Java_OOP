public class Circle extends Figure {
    public Circle(double length) {
        super(length);
    }

    public Circle() {
        super();
    }

    @Override
    public double calcSquare() {
        return Math.PI * getLength() * getLength();
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * getLength();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "length=" + length +
                '}';
    }
}
