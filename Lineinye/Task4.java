import java.util.Scanner;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals a :");
        double a = console.nextDouble();
        double z = (a * 1000) % 1000 +((int) a)/1000.0;
        System.out.println(z);
    }
}
