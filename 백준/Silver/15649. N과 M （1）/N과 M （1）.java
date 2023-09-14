import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        perm(arr, visited, 0, n, m);

        System.out.println(sb);
    }

    private static void perm(int[] arr, boolean[] visited, int depth, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append(System.lineSeparator());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                perm(arr, visited, depth + 1, n, m);
                visited[i] = false;
            }
        }
    }
}
