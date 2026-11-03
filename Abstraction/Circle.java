
public class Circle extends Shape{
    
    double radius;

    Circle(double raduis){
        this.radius = raduis;
    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}