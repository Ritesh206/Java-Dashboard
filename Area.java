import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Box bb = new Box();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        bb.area(r);

        System.out.print("Enter length of rectangle: ");
        int a = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        bb.area(a, b);
    }
}

class Circle {
    public void area(double r) {
        double ca = 3.14 * r * r;
        System.out.println("Circle Area = " + ca);
    }
}

class Box extends Circle {
    public void area(int a, int b) {
        int rec = a * b;
        System.out.println("Area of Rectangle = " + rec);
    }
}