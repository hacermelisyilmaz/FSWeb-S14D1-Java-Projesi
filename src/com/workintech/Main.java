package com.workintech;

import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** CYLINDER ***");
        Circle circle = new Circle(10);
        System.out.println("com.workintech.cylinder.Circle radius: " + circle.getRadius());
        System.out.println("com.workintech.cylinder.Circle area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(20, 5);
        System.out.println("com.workintech.cylinder.Cylinder radius: " + cylinder.getRadius());
        System.out.println("com.workintech.cylinder.Cylinder height: " + cylinder.getHeight());
        System.out.println("com.workintech.cylinder.Cylinder circle area: " + cylinder.getArea());
        System.out.println("com.workintech.cylinder.Cylinder volume: " + cylinder.getVolume());
    }
}