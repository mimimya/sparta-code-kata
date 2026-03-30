class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                continue;
            }

            // 기준점 - 대문자 : A, 소문자 : a;
            char base = (c <= 'Z') ? 'A' : 'a';
            
            char shifted = (char) ((c - base + n) % 26 + base);
            
            sb.append(shifted);
        }
        return sb.toString();
    }
}