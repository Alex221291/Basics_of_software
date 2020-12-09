import java.util.Scanner;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter A B :");
        double A = console.nextDouble();
        double B = console.nextDouble();
        System.out.println(" Enter x y z :");
        double x = console.nextDouble();
        double y = console.nextDouble();
        double z = console.nextDouble();
        if (((x <= A) && (y <= B))|| ((x <= B) && (y <= A))|| ((x <= A) && (z <= B))|| ((x <= B) && (z <= A))|| ((y <= A) && (z <= B))|| ((y <= B) && (z <= A))) {
            System.out.println("the brick will pass through the hole");
        }
        else {
            System.out.println("the brick won't pass through the hole");
        }
        }
    }
