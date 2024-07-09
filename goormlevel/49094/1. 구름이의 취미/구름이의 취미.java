import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long num = Long.parseLong(input);
		long sum = (num * (num + 1) / 2) % 1_000_000_007;
		long result = (sum * sum) % 1_000_000_007;
		
		System.out.println(result);
	}
	
}