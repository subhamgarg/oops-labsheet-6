// Question 3: Shape and Rectangle (Overriding)
class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Question_03 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 4.0);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}
