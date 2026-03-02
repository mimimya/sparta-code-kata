class Solution {
    public int solution(int left, int right) {
        // left -> right 탐색하며 약수 개수를 세고 홀/짝에 따라 계산해 리턴한다.
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int cnt = 0; // 약수의 개수
            for(int j = 1; j <= i; j++){if(i%j==0) cnt++;}
            
            if(cnt % 2 == 0) {answer += i;}
            else answer-=i;
        }
        
        return answer;
    }
}