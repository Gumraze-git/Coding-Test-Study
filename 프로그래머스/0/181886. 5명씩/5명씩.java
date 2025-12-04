class Solution {
    public String[] solution(String[] names) {
        // 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있음.
        // 앞에서부터 5명씩 묶은 그룹의 첫 번째 사람의 이름을 묶은 list를 return
        // names의 길이를 5로 나눈 후 몫이 길이, 나머지가 있으면 + 1
        // 배열 길이 생성
        String[] answer = new String[(names.length + 4) / 5];
        int index = 0;
        
        // 5단위로 이름 넣기
        for (int i = 0; i < names.length; i+=5) {
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}