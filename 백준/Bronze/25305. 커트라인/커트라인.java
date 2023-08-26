import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> link = new LinkedList<>();

        int person = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < person; i++) {
            link.add(Integer.parseInt(st.nextToken()));
        }

        link.sort(Comparator.reverseOrder());

        int count = 0;
        int result = 0;
        while(!link.isEmpty()){
            if(count == cut){
                break;
            }

            result = link.poll();
            count++;
        }

        System.out.println(result);
    }
}
