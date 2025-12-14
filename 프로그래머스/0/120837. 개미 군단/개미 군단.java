class Solution {
    public int solution(int hp) {
        // 개미군단은 사냥감에 체력에 딱 맞는 병력을 데리고 나가려고함.
        // 장군개미: 5
        // 병정개미: 3
        // 일개미: 1
        // 사냥감에 체력(hp)에 딱 맞게 최소한의 병력을 구성하려면, 몇 마리의 개미가 필요한지 return
        
        // 장군개미가 얼마나 필요한지
        int general = hp / 5;
        hp = hp - general * 5;
        
        // 병정개미가 얼마나 필요한지
        int soldier = hp / 3;
        hp = hp - soldier * 3;
        
        // 일개미가 얼마나 필요한지
        int worker = hp / 1;
        hp = hp - worker * 1;
        return general + soldier + worker;
    }
}