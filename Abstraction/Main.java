
public class Main{

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5,6);
        Rectangle rectangle = new Rectangle(10,5);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}