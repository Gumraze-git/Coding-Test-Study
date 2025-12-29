class Solution {
    boolean solution(String s) {
        // count가 짝수이면 true
        String lower = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'p') {
                pcount++;
            }
            if (lower.charAt(i) == 'y') {
                ycount++;
            }
        }

        return pcount == ycount;
    }
}