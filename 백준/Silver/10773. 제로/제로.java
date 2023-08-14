import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }else {
                stack.add(num);
            }
        }

        int answer = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            answer += (int)stack.pop();
        }

        System.out.println(answer);
    }
}
