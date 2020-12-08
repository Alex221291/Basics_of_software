import java.util.Scanner;
//3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals x y :");
        double x = console.nextDouble();
        double y = console.nextDouble();
        double z = (Math.sin(x)+Math.cos(y))*Math.tan(x*y)/(Math.cos(x)-Math.sin(y));
        System.out.println("z = " + z);
    }
}
