class Solution {
    public String solution(String polynomial) {
        // 다항식을 계산하여라
        int x = 0;
        int ele = 0;
        
        String[] splitedString = polynomial.split(" \\+ ");
        for (String s : splitedString) {
            if (s.endsWith("x")) {
                if (s.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(s.substring(0, s.length() - 1));    
                }
            } else {
                ele += Integer.parseInt(s);
            }
        }
        
        String answer = "";
        
        if (x == 0) {
            answer = String.valueOf(ele);
        } else if (ele == 0) {
            answer = (x == 1) ? "x" : x + "x";
        } else {
            answer = (x == 1) ? "x + " + ele : x + "x + " + ele;
        }

        
        return answer;
    }
}