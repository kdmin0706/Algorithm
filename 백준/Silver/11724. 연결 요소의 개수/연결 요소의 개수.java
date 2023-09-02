import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    static List<Integer>[] A;
    public static void main(String[] args) throws Exception{
        /*
            시간 제한 3초 : 1초당 1억번
            노드의 최대 개수가 1000이므로 시간 복잡도 N^2 이하의 알고리즘을 사용 가능
            연결 요소는 에지로 연결된 노드의 집합이다
            한 번의 DFs가 끝날 때까지 탐색한 모든 노드의 집합을 하나의 연결 요소로 판단 가능
            1 -> 2 -> 5 -> 1    3 -> 4 -> 6
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());       //노드 수
        int m = Integer.parseInt(st.nextToken());       //에지 수

        visited = new boolean[n + 1];   //0번 인덱스 미사용
        A = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            //양방향 그래프이기 때문에 어느 방향이든 사용 가능하게 더해준다.
            A[s].add(e);
            A[e].add(s);
        }

        int cnt = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

}
