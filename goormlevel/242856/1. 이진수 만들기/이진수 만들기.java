import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
//		System.out.println("Hello Goorm! Your input is " + input);
		
		System.out.println(Integer.toString(input, 2));
		
	}
}