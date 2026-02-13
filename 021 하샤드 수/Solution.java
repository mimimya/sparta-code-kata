class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(int xx = x; xx>0; xx/=10){
            sum += xx%10;
        }
        if(x%sum == 0) return true;
        else return false;
    }
}