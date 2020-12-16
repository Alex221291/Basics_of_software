import java.util.Scanner;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number a: ");
        char[] a = console.nextLine().toCharArray();
        System.out.println("Enter number b: ");
        char[] b = console.nextLine().toCharArray();
        //заменяем повторные цифры в числах на '-'
        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i+1; j <= a.length - 1; j++) {
                if ((a[i] == a[j]) || (a[j] == ',')) {
                    a[j] = '-';
                }
            }
        }
        for (int i = 0; i <= b.length - 2; i++) {
            for (int j = i+1; j <= b.length - 1; j++) {
                if ((b[i] == b[j]) || (b[j] == ',')) {
                    b[j] = '-';
                }
            }
        }
        //------------------------------------------
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= b.length - 1 ; j++) {
                if ((a[i] == b[j]) && (a[i] != '-')) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
