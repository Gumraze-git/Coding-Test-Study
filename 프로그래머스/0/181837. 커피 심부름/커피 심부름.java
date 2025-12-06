class Solution {
    public int solution(String[] order) {
        // 음료는 차가운 것과 뜨거운 것이 있음.
        // 아메리카노: 4500원
        // 카페 라떼: 5000원
        // 1. 메뉴만 적은 팀원의 것은 차가운 것으로 통일
        // 2. 아무거나는 차가운 아메리카노
        // 3. order는 다음 원소들이 존재함.
        int answer = 0;
        
        // 아메리카노와 카페라떼인지 아무거나인지 확인
        for (String s : order) {
            if (s.contains("americano") || s.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        return answer;
    }
}