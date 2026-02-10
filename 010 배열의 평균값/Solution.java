class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int x : numbers){
            sum += x;
        }
        return (double)sum / numbers.length;
    }
}