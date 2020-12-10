import java.util.Scanner;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter symbol : ");
        char ch = console.next().charAt(0);
        System.out.println("symbol = " + ch + " | value =  " + (int) ch);

    }
}
