import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		double num = W * (1 + (double)R / 30);
		System.out.println((int)num);
		
	}
}