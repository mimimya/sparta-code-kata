class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = threeToTen(reversedThree(n));
        return answer;
    }
    // 앞뒤 반전 3진법
    private String reversedThree(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            sb.append(n%3);
            n/=3;
        }
        return sb.toString();
    }
    // 10진법으로 표현
    private int threeToTen(String n) {
        int answer = 0;
        for(int i = 0; i < n.length(); i++) {
            answer = answer * 3 + (n.charAt(i) - '0');
        }
        return answer;
    }
}