class Solution {
    public long solution(long n) {
        for(long x= 0; x*x<=n; x++){ // 시간초과 유의
            if(x*x == n) {
                x++;
                return x*x;
            }
        }
        return -1;
    }
}