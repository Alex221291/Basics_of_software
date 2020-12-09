import java.util.Scanner;

//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
// то будет ли он прямоугольным.

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter corners a b :");
        double a = console.nextDouble();
        double b = console.nextDouble();
        if ((a > 0) && (b > 0)) {
            if (a + b < 180) {
                System.out.println("Such a triangle exists");
                if ((a == 90) || (b == 90) || (a + b == 90)) {
                    System.out.println("rectangular");
                } else {
                    System.out.println("nonrectangular");
                }
            } else {

                System.out.println("There is no such triangle");
            }

        }
        else {
            System.out.println("There is no such triangle");
        }
    }
}
