//3. Найти сумму квадратов первых ста чисел.

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i * i;
        }
        System.out.println("1^2 + 2^2 + 3^2 + .. + 99^2 + 100^2 = " + sum);

    }
}
