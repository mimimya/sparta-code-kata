class Solution {
    public int solution(int num1, int num2) {
        // 나누기 전에 형 변환을 해서 실수 나눗셈이 되게
        return (int) ((double) num1/num2 * 1000);
    }
}