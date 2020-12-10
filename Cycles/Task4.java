import java.math.BigInteger;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        BigInteger pr = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            pr = pr.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("1^2 * 2^2 * 3^2 * .. * 199^2 * 200^2 = " + pr);

    }
}
