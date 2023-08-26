import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int arrsize = 0;
        if(my_str.length() % n == 0){
            arrsize = my_str.length() / n;
        } else {
            arrsize = my_str.length() / n + 1;
        }

        String[] answer = new String[arrsize];

        System.out.println(Arrays.toString(answer));

        LinkedList<Character> list = new LinkedList<>();
        for(char c : my_str.toCharArray()){
            list.add(c);
        }
        System.out.println(list);

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int idx = 0;
        while(!list.isEmpty()){
            char c = list.poll();

            sb.append(c);
//            answer[idx] += Character.toString(c);

            count++;

            if(count == n){
                sb.append(",");
                idx++;
                count = 0;
            }
        }
        System.out.println(sb);
        String s = sb.toString();
        answer = s.split(",");
        
        return answer;
    }
}