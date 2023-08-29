import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //행렬의 크기 N,M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        //행렬 A에 원소 M개가 주어진다.
        int[][] arr1 = new int[N][M];
        //N개 줄에 행렬 B의 원소 M개가 주어진다.
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬의 원소는 1 < A <= B < 100
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
