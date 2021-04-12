public class Triangle extends Figure {
    double triangleHeight;

    public Triangle(double length, double triangleHeight) {
        super(length);
        this.triangleHeight = triangleHeight;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    @Override
    public double calcSquare() {
        return 0.5 * getLength() * getTriangleHeight();
    }

    @Override
    public double calcPerimeter() {
        return 3 * getLength();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", triangleHeight=" + getTriangleHeight() +
                '}';
    }
}
