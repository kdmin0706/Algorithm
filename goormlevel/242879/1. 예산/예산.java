import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken()); 
		int sum = Integer.parseInt(st.nextToken()); 
		int result = 0;
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());

			result += num * cnt;
		}
		
		System.out.println(result > sum ? "No" : sum - result);
	}
}