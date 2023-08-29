import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");

        Arrays.sort(s, Comparator.reverseOrder());
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
