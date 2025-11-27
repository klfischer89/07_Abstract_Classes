package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0);

        List<SHape> listOfShapes = new ArrayList<>();
        listOfShapes.add(triangle);

        output("------ Flächen ------"); 
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());
       
        output("------  Differenzen ------");
        output("Diff.: " + areaDiff(rectangle, triangle));
        output("Diff.: " + areaDiff(rectangle, circle));

    }

    private static double areaDiff(SHape first, SHape second) {
        return first.area() - second.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

