public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.getRadius() + "Area: " + c1.getArea());

        Circle c2 = new Circle(2.0);

        System.out.println("Circle radius " + c2.getRadius() + "Area " + c2.getArea());
    }
}