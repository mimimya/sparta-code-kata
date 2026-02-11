class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int x : arr)
            answer+=x; // 묵시적 형 변환
        return answer/arr.length;
    }
}