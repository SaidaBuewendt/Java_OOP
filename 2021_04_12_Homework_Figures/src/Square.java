public class Square extends Figure{

    public Square(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return getLength()*getLength();
    }

    @Override
    public double calcPerimeter() {
        return 4*getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
