public class Rectangle {
    int x, y;
    int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        new Rectangle(0, 0, width, height);
    }

    public Rectangle(int width, int height) {
/*      x=0;
        y=0;
        this.width = width;
        this.height = height;*/
        //new Rectangle (0,0,width,height);
        this(0, 0, width, height);
    }
}


class RectangleTest {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(100, 100, 10, 10);
        Rectangle secondRectangle = new Rectangle(50,50, 20,20);

    }
}