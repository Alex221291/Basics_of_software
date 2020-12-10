import java.util.Scanner;

//2. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a;
        double b;
        double h;
        double value;
        do {
            System.out.println(" Enter the interval a b (a>b) :");
            a = console.nextInt();
            b = console.nextInt();
            value = a;
            System.out.println(" Enter step h (h>0):");
            h = console.nextInt();
            if ((a <= b) && (h > 0)) {
                do {
                    if (value <= 2) {
                        System.out.println("y(" + value + ") = " + -value);
                    }
                    else {
                        System.out.println("y(" + value + ") = " + value);
                    }
                    value += h;
                } while(value <= b);
            }
        }while(value == a);
        }
    }
