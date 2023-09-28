import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();

        System.out.println(factorial(N));
    }

    private static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
