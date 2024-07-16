import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i=input;i>0;i--) {
			System.out.print("*");
			for(int j=i;j<input;j++) {
				System.out.print("*");			
			}
			System.out.println("");
		}
	}
}