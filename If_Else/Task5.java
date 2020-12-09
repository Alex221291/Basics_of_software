import java.util.Scanner;

//5. Вычислить значение функции:

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter x :");
        double x = console.nextDouble();
        double Fx;
        if (x <= 3) {
            Fx = x * x - 3 * x + 9;
        }
        else {
            Fx = 1 / (x * x * x + 6);
        }
        System.out.println("F(" + x + ") = " + Fx);
        }
    }
