import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        
        long answer = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            answer = answer * 10 + (arr[i] - '0');
        }
        return answer;
    }
}