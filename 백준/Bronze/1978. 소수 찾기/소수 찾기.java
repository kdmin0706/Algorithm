import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            for (int j = 2; j <= num; j++) {
                if (j == num) {
                    count++;
                } else if (num % j == 0) {
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
