import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //새로운 배열 생성
        int[][] arr = new int[N][M];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int addCnt = Integer.parseInt(br.readLine());
        while (addCnt-- > 0) {
            st = new StringTokenizer(br.readLine());
            //1 ≤ i ≤ x ≤ N
            //1 ≤ j ≤ y ≤ M
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum = 0;
            // i - 1 부터 x까지
            // j - 1 부터 y까지
            for (int k = i - 1; k < x; k++) {
                for (int l = j - 1; l < y; l++) {
                    sum += arr[k][l];
                }
            }
            System.out.println(sum);
        }

    }
}
