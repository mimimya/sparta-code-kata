class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i=i+2){ //2 4 6 8 10 12
            sum+=i;
        }
        return sum;
    }
}