import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String S = br.readLine();

            //문자열의 각 자리의 값을 확인할때는 char형태 진행
            Stack<Character> stack = new Stack<Character>();

            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                }else {
                    //비어있는지를 먼저 본다.
                    if(stack.isEmpty()) {
                        stack.push(S.charAt(j));
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
