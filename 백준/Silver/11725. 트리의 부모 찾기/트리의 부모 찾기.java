import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //트리 구조 표현 리스트
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        boolean[] visited = new boolean[N + 1];
        int[] parentNode = new int[N + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()){
            int v = queue.remove();
            for(int i : tree.get(v)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    parentNode[i] = v;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(parentNode[i] + " ");
        }

    }
}
