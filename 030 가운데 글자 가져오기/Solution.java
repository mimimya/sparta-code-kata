class Solution {
    public String solution(String s) {
        // 홀수일 때: /2 후 +1 = 가운데
        // 짝수일 때: 4 -> 2,3번째 => /2 후 다음 수도
            //검증: 2 -> 2/2 = 0 (0,1번째)
        int base = s.length()/2 -1; // 인덱스 -1, 캐스팅 과정에서 자동 버림
        
        if(s.length() %2 == 0) 
            return ""+ s.charAt(base) + s.charAt(base+1);
        else 
            return ""+s.charAt(base+1);
    }
}