import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            array.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
