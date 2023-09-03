import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //문제에서 수의 개수와 합을 구하는 횟수가 최대 100_000
        long[] S = new long[N + 1]; //편의를 위해서 [N + 1] 진행 => 1번 인덱스부터 시작
        st = new StringTokenizer(br.readLine());

        //누적 합 : 0 ~ N - 1 인덱스까지 N의 크기를 갖는 배열
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); //누적 합
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[start - 1]);    //기본적인 누적합 공식
        }

    }
}
