import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int numberTypedByUser = scanner.nextInt();
        BigInteger sum = new BigInteger("1");

        for (int i = 1; i <= numberTypedByUser; i++) {
             sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(sum);
    }
}
