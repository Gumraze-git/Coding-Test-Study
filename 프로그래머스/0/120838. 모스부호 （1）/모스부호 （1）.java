import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 1. 모스부호 매핑
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        // 2. 모스부호 분리
        String[] codes = letter.split(" ");

        // 3. 해독
        StringBuilder result = new StringBuilder();
        for (String code : codes) {
            result.append(morse.get(code));
        }

        // 4. 결과 반환
        return result.toString();
    }
}
