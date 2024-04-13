class Solution {
    public String solution(String new_id) {
        
        //1. 대문자 => 소문자
        String answer = new_id.toLowerCase();
        
        //2. 소문자, 숫자, 빼기, 밑줄, 마침표 제외 제거
        answer = answer.replaceAll("[^a-z0-9_.-]","");

        //3. '..' 이상 => '.'
        answer = answer.replaceAll("\\.{2,}",".");
        
        //4. '.' 처음 or 끝 위치 제거
        answer = answer.replaceAll("^\\.|\\.$","");
        
        //5. 빈 문자열 => "a"
        //6. 16자 이상 => 15자까지만 대입
        if (answer.length()==0) {
            answer = "a";
        } else if (answer.length()>15) {
            answer = answer.substring(0,15);
        }
        
        //6. '.' 가 끝에 위치한다면 제거
        answer = answer.replaceAll("\\.$","");

        //7. 2자 이하 => 3자가 되도록 반복
        if (answer.length()<=2) {
            String last = answer.substring(answer.length()-1);
            while (answer.length()<=2) {
                answer += last;
            }
        }

        return answer;
    }
}