import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int answer = 0;

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] s1 = s.split(" ");

         for (int i = 0; i < s1.length; i++) {
            if(!s1[i].equals("")){
                answer++;
            }
        }

        System.out.println(answer);
        scanner.close();

    }

}
