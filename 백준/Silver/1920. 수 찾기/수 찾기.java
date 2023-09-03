import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열은 반드시 정렬되어있어야한다

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int find = Integer.parseInt(st.nextToken());

            if (binarySearch(arr, find) >= 0) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;              //첫 번째 인덱스
        int end = arr.length - 1;   //마지막 인덱스

        while (start <= end) {
            int mid = start + (end - start) / 2;    //중심 위치

            if (key < arr[mid]) {  //key가 중간 위치 값보다 작은 경우
                end = mid - 1;
            } else if (key > arr[mid]) { //key가 중간 위치 값보다 큰 경우
                start = mid + 1;
            } else {    //key가 중간 위치 값보다 같은 경우
                return mid;
            }
        }

        return -1;      //찾는 값이 없는 경우
    }
}
