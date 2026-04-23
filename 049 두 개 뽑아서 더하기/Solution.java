import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();// 중복 없이
        int len = numbers.length;
        
        for(int i = 0; i < len-1; i ++) {
            for(int j = i+1; j < len; j++) {
                set.add(numbers[i] + numbers[j]); // 두 개 조합     
            }        
        }
        
        // 오름차순 정렬
        int[] answer = set.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
        
        return answer;
    }
}