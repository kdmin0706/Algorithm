import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String next = st.nextToken();
            if("+".equals(next)){
                num += Integer.parseInt(br.readLine());
            } else if("-".equals(next)){
                num -= Integer.parseInt(br.readLine());
            } else if("*".equals(next)){
                num *= Integer.parseInt(br.readLine());
            } else if("/".equals(next)){
                num /= Integer.parseInt(br.readLine());
            } else if("=".equals(next)){
                break;
            }

        }
        System.out.println(num);
    }
}
