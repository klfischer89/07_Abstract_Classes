package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0);

        output("------ Flächen ------"); 
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());
       
        output("------  Differenzen ------");
        output("Diff.:" + areaDiff(rectangle, triangle));

    }

    private static double areaDiff(SHape first, SHape second) {
        return first.area() - second.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

