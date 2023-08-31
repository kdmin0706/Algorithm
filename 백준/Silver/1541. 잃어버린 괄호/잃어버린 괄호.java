import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //가장 최소값을 만들기 위해서 가능한 큰 수를 뺴야한다.
        //'-' 인 숫자가 크면 클 수록 전체 수식의 결과는 최소가 된다.
        //'-' 연산이 시작되고 '+' 연산이 나올때까지 값을 괄호를 쳐준다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = s.split("-");
        int answer = 0;

        for (int i = 0; i < sArr.length; i++) {
            int temp = mySum(sArr[i]); //1. 더하기 연산 먼저 진행

            //2. 가장 앞에 있는 값에서 더하기 연산으로 나온 값을 모두 뺀다.
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }

        System.out.println(answer);


    }

    private static int mySum(String s) {
        int result = 0;
        String[] sArr = s.split("[+]");
        for (int i = 0; i < sArr.length; i++) {
            result += Integer.parseInt(sArr[i]);
        }
        return result;
    }
}
