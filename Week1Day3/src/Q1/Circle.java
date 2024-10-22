package Q1;

public class Circle extends Shape{
    @Override
    public float printArea() {
        return (float) (Math.PI * Math.pow(this.a, 2));
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.a = 2;
        System.out.println(circle.printArea());
    }
}
