import java.util.*;
class Solution {

    public int[] solution(String s) {

        int[] alphabetIdx = new int[123]; // 현재 탐색에서 가장 가까운 등장 인덱스
        Arrays.fill(alphabetIdx, -1); // -1로 초기화
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);

        
        for(int i = 0; i<s.length(); i++){
            char alpha = s.charAt(i);
            
            if (alphabetIdx[alpha] != -1) {
                answer[i] = i - alphabetIdx[alpha];
            }
            alphabetIdx[alpha] = i;
            
        }
            
        return answer;
    }
}