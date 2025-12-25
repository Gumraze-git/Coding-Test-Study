class Solution {
    public String solution(String bin1, String bin2) {
        // 두 이진수의 합
        StringBuilder sb = new StringBuilder();
        
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) sum += bin1.charAt(i--) - '0';
            if (j >= 0) sum += bin2.charAt(j--) - '0';
            
            sb.append(sum % 2);
            carry = sum / 2;
        }
        
        return sb.reverse().toString();
    }
}