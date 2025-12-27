class Solution {
    public int solution(int[] common) {
        // common은 등비 또는 등차 수열임
        // 마지막 원소 다음으로 올 숫자를 return 하여라
        
        // 등차수열인지 등비수열인지 구분
        int answer = 0;
        int n = common.length;
        
        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];
        
        if (d1 == d2) {
            // 등차 수열
            return common[n - 1] + d1;
        } else {
            // 등비 수열
            int r = common[1] / common[0];
            return common[n - 1] * r;
        }
    }
}