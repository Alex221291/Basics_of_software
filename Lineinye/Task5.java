import java.util.Scanner;
//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals t :");
        int t = console.nextInt();
        int h = t/3600;
        int m = (t - h*3600)/60;
        int s = t - h*3600 - m*60;
        System.out.println(h + "h - " + m + "m - " + s + "s");
    }
}
