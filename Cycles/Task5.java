import java.util.Scanner;

//5. Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter e : ");
        double e = console.nextDouble();
        double aN = 1 / 2. + 1 / 3.;
        double sum = 0;
        double n = 1;
        while (aN >= e) {
            aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            sum += aN;
            n++;
        }
        System.out.println("sumN = " + sum);

    }
}
