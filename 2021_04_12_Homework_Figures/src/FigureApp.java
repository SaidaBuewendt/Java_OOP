public class FigureApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(5.7);

        Square square1 = new Square(2);
        Square square2 = new Square(3.5);
        Square square3 = new Square(5.7);

        Triangle triangle1 = new Triangle(2, 5);
        Triangle triangle2 = new Triangle(3.5,2);
        Triangle triangle3 = new Triangle(5.7, 10);

        System.out.println(circle1.toString() +"\nCircle square: " + circle1.calcSquare() + "\nCircle circumference: " +circle1.calcPerimeter());
        System.out.println(circle1.toString() +"\nCircle square: " + circle2.calcSquare() + "\nCircle circumference: " +circle2.calcPerimeter());
        System.out.println(circle1.toString() +"\nCircle square: " + circle3.calcSquare() + "\nCircle circumference: " +circle3.calcPerimeter());
        System.out.println("*************************");

        System.out.println(square1.toString() +"\nSquare square: " + square1.calcSquare() + "\nSquare perimeter: " +square1.calcPerimeter());
        System.out.println(square2.toString() +"\nSquare square: " + square2.calcSquare() + "\nSquare perimeter: " +square2.calcPerimeter());
        System.out.println(square3.toString() +"\nSquare square: " + square3.calcSquare() + "\nSquare perimeter: " +square3.calcPerimeter());
        System.out.println("*************************");

        System.out.println(triangle1.toString() +"\nTriangle square: " + triangle1.calcSquare() + "\nTriangle perimeter: " +triangle1.calcPerimeter());
        System.out.println(triangle2.toString() +"\nTriangle square: " + triangle2.calcSquare() + "\nTriangle perimeter: " +triangle2.calcPerimeter());
        System.out.println(triangle3.toString() +"\nTriangle square: " + triangle3.calcSquare() + "\nTriangle perimeter: " +triangle3.calcPerimeter());

    }

}
