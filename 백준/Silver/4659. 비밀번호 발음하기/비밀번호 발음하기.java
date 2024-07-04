import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String value = br.readLine();
            if ("end".equals(value)) {
                break;
            }

            int count = 0;
            char prev = '.';
            boolean isTrue = false;

            for (int i = 0; i < value.length(); i++) {
                char now = value.charAt(i);

                // 모음 체크
                if (checkVowel(now)) {
                    isTrue = true;
                }

                if (checkVowel(now) != checkVowel(prev)) {
                    count = 1;
                } else {
                    count++;
                }

                if (count > 2 || now == prev && now != 'e' && now != 'o') {
                    isTrue = false;
                    break;
                }

                prev = now;
            }

            if (isTrue) {
                sb.append('<').append(value).append("> is acceptable.\n");
            } else {
                sb.append('<').append(value).append("> is not acceptable.\n");
            }
        }
        System.out.println(sb);
    }

    private static boolean checkVowel(char now) {
        return now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u';
    }

}
