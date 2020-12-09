import java.util.Scanner;

//2. Найти max{min(a, b), min(c, d)}.

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b c d :");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double d = console.nextDouble();
        double minAB;
        double minCD;
        double max;
        if (a <= b) {
            minAB = a;
        }
        else {
            minAB = b;
        }
        if (c <= d) {
            minCD = c;
        }
        else {
            minCD = d;
        }
        if (minAB >= minCD) {
            max = minAB;
        }
        else {
            max = minCD;
        }
            System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")} = " + max);
        }
    }
