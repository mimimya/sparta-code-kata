class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder("수");
        for(int i = 0; i < n-1; i++) {
            sb.append(i%2==0 ? "박" : "수");
        }
        return sb.toString();
    }
}