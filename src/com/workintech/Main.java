package com.workintech;

import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

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

        System.out.println("*** POOL ***");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(10, 20, 5);
        System.out.println("Cuboid width: " + cuboid.getWidth());
        System.out.println("Cuboid length: " + cuboid.getLength());
        System.out.println("Cuboid height: " + cuboid.getHeight());
        System.out.println("Cuboid rectangle area: " + cuboid.getArea());
        System.out.println("Cuboid volume: " + cuboid.getVolume());
    }
}