class Solution {
    public int solution(int a, int b) {
        Integer ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        Integer ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        System.out.println(ab);
        System.out.println(ba);
        
        return (ab > ba) ? ab : ba;
    }
}