class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int idValue = -1;           //아이디 배열 인덱스 값
        boolean isTrue = false;     //패스워드 체크
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                idValue = i;
                break;
            }
        }

        if (idValue != -1) {
            for (int i = 0; i < db[i].length; i++) {
                if (id_pw[1].equals(db[idValue][i])) {
                    isTrue = true;
                    break;
                }
            }
        } else {
            return "fail";
        }


        return isTrue ? "login" : "wrong pw";
    }
}