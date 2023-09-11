import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;
        int max = Collections.max(map.values());

        for (char key : map.keySet()) {
            int value = map.get(key);

            if (value == max) {
                count++;
                s = String.valueOf(key);
            }
        }
        
        System.out.println(count > 1 ? "?" : s.toUpperCase());
    }
}
