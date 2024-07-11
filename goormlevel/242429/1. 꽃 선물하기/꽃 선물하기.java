import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();		
		int num = Integer.parseInt(input);

		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < b) {
				System.out.println("Sunflower");
			} else if(a == b) {
				System.out.println("Tulip");				
			} else {
				System.out.println("Rose");	
			}
		}
		
	}
}