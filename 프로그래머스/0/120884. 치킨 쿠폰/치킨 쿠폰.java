class Solution {
    public int solution(int chicken) {
        // 치킨 한 마리 주문당 쿠폰 한 장 발급
        // 쿠폰 10장을 모으면 치킨을 한 마리 서비스
        // 서비스 치킨에도 쿠폰 발급
        // 최대 서비스 치킨의 수
        int coupons = chicken;
        int service = 0;
        
        while (coupons >= 10) {
            // 이번에 받을 서비스 치킨 수
            int free = coupons / 10;
            service += free;
            coupons = (coupons % 10) + free; // 남은 쿠폰 + 서비스 치킨으로 새로 받은 쿠폰
        }
        
        return service;
    }
}