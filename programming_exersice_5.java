package Java_Programs_Assignment;

class Shape {
    String shapeName;

    Shape() {
    }

    String getName() {
        return this.shapeName;
    }
}

interface Area {
    public double getArea();
}

interface Volume {
    public double getVolume();
}

class Circle extends Shape implements Area {
    double radius;

    Circle() {
        // implicit constructor
    }

    Circle(double radius, String name) {
        this.radius = radius;
        this.shapeName = name;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class Square extends Shape implements Area {
    double side;

    Square() {
        // implicit constructor
    }

    Square(double side, String name) {
        this.side = side;
        this.shapeName = name;
    }

    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        return area;
    }
}

class Cylinder extends Circle implements Volume {

    double height;

    Cylinder(double h, double r, String n) {
        this.height = h;
        this.radius = r;
        this.shapeName = n;
    }

    @Override
    public double getVolume() {
        double vol = Math.PI * Math.pow(radius, 2) * this.height;
        return vol;
    }
}

class Sphere extends Circle implements Volume {

    Sphere(double r, String n) {
        this.radius = r;
        this.shapeName = n;
    }

    @Override
    public double getVolume() {
        double vol = (4 / 3) * Math.PI * Math.pow(radius, 3);
        return vol;
    }
}

class Cube extends Square implements Volume {

    Cube(double side, String name) {
        this.side = side;
        this.shapeName = name;
    }

    @Override
    public double getVolume() {
        double vol = Math.pow(side, 3);
        return vol;
    }
}

class Glome extends Sphere {

    Glome(double r, String n) {
        super(r, n);
    }

    public double getVolume() {
        double vol = 2 * Math.pow(Math.PI, 2) * Math.pow(2 * radius, 3);
        return vol;
    }
}

public class programming_exersice_5 {
    public static void main(String[] args) {

        Circle circle = new Circle(8.0, "Circle");
        System.out.println("Name of the shape: " + circle.getName());
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());
        System.out.println();

        Square square = new Square(9.0, "Square");
        System.out.println("Name of the shape: " + square.getName());
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
        System.out.println();

        Cylinder cylinder = new Cylinder(10.0, 6.0, "Cylinder");
        System.out.println("Name of the shape: " + cylinder.getName());
        System.out.println("Volume of " + cylinder.getName() + ": " + cylinder.getVolume());
        System.out.println();

        Sphere sphere = new Sphere(4.0, "Sphere");
        System.out.println("Name of the shape: " + sphere.getName());
        System.out.println("Volume of " + sphere.getName() + ": " + sphere.getVolume());
        System.out.println();

        Cube cube = new Cube(7.0, "Cube");
        System.out.println("Name of the shape: " + cube.getName());
        System.out.println("Volume of " + cube.getName() + ": " + cube.getVolume());
        System.out.println();

        Glome glome = new Glome(7.0, "Glome");
        System.out.println("Name of the shape: " + glome.getName());
        System.out.println("Volume of " + glome.getName() + ": " + glome.getVolume());
        System.out.println();

    }
}
