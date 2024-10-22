package Q1;

public class Rectangle extends Shape{
    @Override
    public float printArea() {
        return a*b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.a = 2;
        rectangle.b = 5;
        System.out.println(rectangle.printArea());
    }
}
