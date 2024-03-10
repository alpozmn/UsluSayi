import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        double base = scanner.nextDouble();

        System.out.print("Üs değerini girin: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    // Recursive metot ile üs alma işlemi
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / (base * power(base, -exponent - 1));
        }
    }
}
