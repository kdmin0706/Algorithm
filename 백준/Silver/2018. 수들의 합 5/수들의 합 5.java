import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //배열에 값 넣기
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        //투포인터를 이용한 연속된 수의 합 계산
        int start = 0, end = 0, count = 0, sum = 0;
        while (true) {
            if (sum >= n) {
                sum -= arr[start++];
            } else if (end == n) {
                break;
            } else {
                sum += arr[end++];
            }

            if (sum == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
