import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String input = st.nextToken();
            if ("enter".equals(input)) {
                set.add(key);
            } else if("leave".equals(input)) {
                set.remove(key);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
