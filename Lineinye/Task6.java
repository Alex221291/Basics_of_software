import java.util.Scanner;

6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Enter equals x y :");
        double x = console.nextDouble();
        double y = console.nextDouble();
        System.out.println(((y >= 0) && (y <= 4) && (x >= -2) && (x <= 2)) || ((y <= 0) && (y >= -3) && (x >= -4) && (x <= 4)));
    }
}
