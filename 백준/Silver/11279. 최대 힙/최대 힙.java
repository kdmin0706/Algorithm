import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < x; i++) {
           int num = Integer.parseInt(br.readLine());

           if (num == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
           } else {
               pq.offer(num);
           }
        }
        System.out.println();
    }
}
