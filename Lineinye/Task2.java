import java.util.Scanner;
//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a b c :");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a , 3) + Math.pow(b , -2);
        System.out.println("z = " + z);
    }
}
