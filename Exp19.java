package practicals;
import java.util.*;


class Shape {
 
 public double area() {
     return 0; 
 }

 public double perimeter() {
     return 0;  
 }
}


class Circle extends Shape {
 
 private double radius;

 //constructor
 public Circle(double radius) {
     this.radius = radius;
 }



 public double area() {
     return Math.PI * radius * radius;
 }

 
 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}


class Rectangle extends Shape {
 
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 
 public double area() {
     return length * width;
 }


 public double perimeter() {
     return 2 * (length + width);
 }
}


class Triangle extends Shape {
 // Fields
 private double side1;
 private double side2;
 private double side3;

 // Constructor
 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }


 public double area() {
     // Heron's formula for the area of a triangle
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }


 public double perimeter() {
     return side1 + side2 + side3;
 }
}

//Main class for testing
public class Exp19 {
 public static void main(String[] args) {
     // Create objects of each class
     Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     Triangle triangle = new Triangle(3.0, 4.0, 5.0);

     // Calculate and display area and perimeter for each shape
     System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
     System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
     System.out.println("Triangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
 }
}

