import java.util.Scanner;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter points А(х1,у1) В(х2,у2) С(х3,у3) :");
        double x1 = console.nextDouble();
        double y1 = console.nextDouble();
        double x2 = console.nextDouble();
        double y2 = console.nextDouble();
        double x3 = console.nextDouble();
        double y3 = console.nextDouble();
        if ((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1) == 0) {
            System.out.println("the points lie on a straight line");
        }
        else {
            System.out.println("points don't lie on the same straight line");
        }
        }
    }
