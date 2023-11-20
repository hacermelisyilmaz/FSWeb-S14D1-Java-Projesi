public class Main {
    public static void main(String[] args) {
        System.out.println("*** CYLINDER ***");
        Circle circle = new Circle(10);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(20, 5);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder circle area: " + cylinder.getArea());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
    }
}