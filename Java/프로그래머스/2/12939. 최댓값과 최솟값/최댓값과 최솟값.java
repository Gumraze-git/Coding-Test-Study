import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        List<Integer> result = new ArrayList<>();
        String[] splitedArray = s.split(" ");
    
        for (int i = 0; i < splitedArray.length; i++) {
            int temp = Integer.parseInt(splitedArray[i]);
            result.add(temp);
        }
        
        List<Integer> sorted = result.stream()
            .sorted()
            .collect(Collectors.toList());
            
        int min = sorted.get(0);
        int max = sorted.get(sorted.size() - 1);
        
        String answer = min + " " + max;
        return answer;
    }
}