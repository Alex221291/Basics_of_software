import java.util.Scanner;
//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b c :");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double z = ((a -3) * b / 2) + c;
        System.out.println("z1 = " + z1);
    }
}
