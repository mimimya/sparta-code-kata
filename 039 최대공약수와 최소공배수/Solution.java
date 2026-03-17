class Solution {
    public int[] solution(int n, int m) {
        int gcd = greatestCommonDivisor(n, m);
        int lcm = leastCommonMultiple(n, m);

        int[] answer = {gcd, lcm};
        return answer;
    }

    private int greatestCommonDivisor(int a, int b) { // 최대공약수 (유클리드 호제법)
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int leastCommonMultiple(int a, int b) { // 최소공배수
        return (a * b) / greatestCommonDivisor(a, b);
    }
}