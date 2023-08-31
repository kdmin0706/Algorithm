import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //재료의 갯수 N
        int N = Integer.parseInt(br.readLine());
        //갑옷을 만드는데 필요한 M
        int M = Integer.parseInt(br.readLine());

        //고유 번호
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //투포인터 사용하기 위한 정렬
        Arrays.sort(arr);

        //투 포인터 이동 원칙
        //arr[start] + arr[end] > n : end--;
        //arr[start] + arr[end] < n : start++;
        //arr[start] + arr[end] == n : start++,end--; count++;

        int count = 0;
        int start = 0;
        int end = N - 1;

        while (start < end) {
            if (arr[start] + arr[end] < M) {
                start++;
            } else if (arr[start] + arr[end] > M) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);
    }
}
