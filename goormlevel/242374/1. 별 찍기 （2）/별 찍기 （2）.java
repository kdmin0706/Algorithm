import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
//		System.out.println("Hello Goorm! Your input is " + input);

		int num = Integer.parseInt(input);
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++){
				System.out.print("*");				
			}
			System.out.println();				
		}
		
	}
}