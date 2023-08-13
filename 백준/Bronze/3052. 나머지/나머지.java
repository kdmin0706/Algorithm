import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * [풀이 완료]
 * 백준 3052번 : 나머지
 * https://www.acmicpc.net/problem/3052
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());

            arr[i] = A % 42;
        }

        //배열 이용
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean istrue = false;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    istrue = true;
                    break;
                }
            }
            if(istrue == false)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
