import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(st.hasMoreTokens()){
            int i = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(i)){
                hashMap.replace(i, hashMap.get(i) + 1);
            }
            else{
                hashMap.put(i, 1);
            }
        }

        System.out.println(hashMap.getOrDefault(V, 0));         
     }
}