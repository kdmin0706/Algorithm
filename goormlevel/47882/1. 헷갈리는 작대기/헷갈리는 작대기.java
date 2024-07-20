import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;

        for (Character c : input.toCharArray()) {
            if (c == '1') {
                i1++;
            } else if (c == 'I') {
                i2++;
            } else if (c == 'l') {
                i3++;
            } else if (c == '|') {
                i4++;
            }
        }

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
	}
}