import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int fibCount = 0;
    static int fibonacciCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);
        System.out.print(fibCount + " " + fibonacciCount);

    }

    private static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            fibonacciCount++;
        }

        return dp[n];
    }

    private static int fib(int n) {
        if (n <= 2) {
            fibCount++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
