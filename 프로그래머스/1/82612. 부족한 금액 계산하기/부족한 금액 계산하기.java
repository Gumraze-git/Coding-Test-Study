class Solution {
    public long solution(int price, int money, int count) {
        // 놀이기구를 N번째 이용하면 원래 이용료에 N배를 받음.
        // 놀이기구를 count 만큼 타면, 현재 가지고 있는 금액에서 얼마가 모자라는지 return
        // 등차수열의 합을 이용한 풀이
        long total = (long) count * (price + (price * count)) / 2;
        return total > money ? total - money : 0;

    }
}