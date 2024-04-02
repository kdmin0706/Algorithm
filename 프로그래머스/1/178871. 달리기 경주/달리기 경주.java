import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<String, Integer> mapPlayer = new HashMap<>();
        Map<Integer, String> mapSwap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            mapPlayer.put(players[i], i);
            mapSwap.put(i, players[i]);
        }

        for (String calling : callings) {
            int cur = mapPlayer.get(calling);
            String play = mapSwap.get(cur);

            String frontPlayer = mapSwap.get(cur - 1);

            mapPlayer.put(play, cur - 1);
            mapPlayer.put(frontPlayer, cur);

            mapSwap.put(cur - 1, play);
            mapSwap.put(cur, frontPlayer);
        }

        for (int i = 0; i < players.length; i++) {
            answer[i] = mapSwap.get(i);
        }

        return answer;
    }
}