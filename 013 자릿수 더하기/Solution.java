public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(; n>0; n/=10) //다른 변수 초기화 없이 n 사용
            answer+=n%10;
        return answer;
    }
}