import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		long result = 0;

		for (int i = 0; i < Integer.parseInt(input); i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			long count = Long.parseLong(st.nextToken());

			if (s.equals("in")) {
					result += count;
			} else {
					result -= count;
			}

			if(result < 0) {
				System.out.println("fail");
				return;
			}
		}

		System.out.println(result >= 0 ? "success" : "fail");
	}
}