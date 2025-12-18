class Solution {
    public long solution(String numbers) {
        // 영어로 표기되어있는 숫자를 수로 바꾸려고 함.
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"      
        };
        
        for (int i = 0; i < words.length; i++) {
            numbers = numbers.replace(words[i], String.valueOf(i));
        }
            
        return Long.parseLong(numbers);
    }
}