import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //상의 N벌과 하의 N벌
        int n = scanner.nextInt();

        int sum = n * (n - 1);
        System.out.println(sum);

    }
}
