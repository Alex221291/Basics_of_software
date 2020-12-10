import java.util.Scanner;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean bool = true;
        do {
            System.out.println("Enter interval m n (m<=n) : ");
            double m = console.nextDouble();
            double n = console.nextDouble();
            if (m <= n) {
                if (m > 0) {
                    for (int i = (int) Math.ceil(m); i <= (int) n; i++) {
                        System.out.print("dividers " + i + " : ");
                        for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                System.out.print(j + " ");
                            }
                        }
                        System.out.println();
                    }
                    bool = false;
                } else {
                    for (int i = 1; i <= (int) n; i++) {
                        System.out.print("dividers " + i + " : ");
                        for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                System.out.print(j + " ");
                            }
                        }
                        System.out.println();
                    }
                    bool = false;
                }
            }

        } while(bool);
    }
}
