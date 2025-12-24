class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // 입력한 아이디와 패스워드가 담긴 배열 id_pw
        // 회원들의 정보가 담긴 배열 db
        // 로그인 성공, 실패에 따른 message를 return
        int idExist = 0;
        
        // 일치하는 id가 있는지부터 확인
        for (int i = 0; i < db.length; i++) {
            System.out.println(db[i][0]);
            if (db[i][0].equals(id_pw[0])) {
                // id가 존재하면, pw확인
                if (id_pw[1].equals(db[i][1])) {
                    // 로그인
                    return "login";
                } else {
                    // id가 존재하나 pw가 틀리면
                    return "wrong pw";
                }
            } else {
                // id가 존재하지 않으면
                idExist++;
            }
        }
        
        if (idExist == db.length) {
            return "fail";
        }
        return null;
    }
}