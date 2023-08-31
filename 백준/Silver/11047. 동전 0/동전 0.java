import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //동전의 종류
        int K = Integer.parseInt(st.nextToken()); //동전의 합

        int[] arr = new int[N]; //N개 줄에 오름차순으로 주어진다.
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //K를 만들기 위한 필요한 동전의 최소 개수
        int count = 0;
        for (int i = N - 1; i >= 0 ; i--) {
            if (K >= arr[i]) {
                // K / arr[i]를 통해서 몇 번 세어졌는지 개수를 센다
                count += (K / arr[i]);
                //나머지 값을 K에 넣어서 누적을 진행한다.
                K = (K % arr[i]);
            }
        }

        System.out.println(count);
    }
}
