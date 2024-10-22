package Q1;

public class Triangle extends Shape{
    @Override
    public float printArea() {
        return a*b/2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 2;
        triangle.b = 3;
        System.out.println(triangle.printArea());
    }
}
