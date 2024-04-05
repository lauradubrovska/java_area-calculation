// 231RDB049 Laura Dubrovska

import java.util.Scanner;

abstract class Figura {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Figura {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadiet taisnstūru skaitu: ");
        int count = sc.nextInt();

        Figura[] figuras = new Figura[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Ievadiet taisnstūra platumu: ");
            double width = sc.nextDouble();
            System.out.print("Ievadiet taisnstūra garumu: ");
            double height = sc.nextDouble();
            figuras[i] = new Rectangle(width, height);
        }

        for (Figura figura : figuras) {
            double area = figura.getArea();
            double perimeter = figura.getPerimeter();
            System.out.printf("%.2f %.2f%n", area, perimeter);
        }

        sc.close();
    }
}
