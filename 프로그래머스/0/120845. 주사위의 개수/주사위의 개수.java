class Solution {
    public int solution(int[] box, int n) {
        // 상자의 크기 -> box
        // 주사위 모서리의 길이 n
        // 상자에 들어갈 수 있는 주사위의 최대 개수
        // 주사위는 상자와 평행하게 넣음?
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}