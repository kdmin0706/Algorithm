import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        //캐시 크기가 0
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            //존재한다면 기존 내용 삭제하고 리스트 추가
            if (list.contains(city)) {
                list.remove(city);
                list.add(city);
                answer += 1;
            } else {
                //캐시가 꽉차있다면 맨 앞의 도시 삭제
                if (list.size() == cacheSize) {
                    list.remove(0);
                }
                
                list.add(city);    //리스트에 값 추가
                answer += 5;
            }
        }
        
        return answer;
    }
}