class Solution {
    private int[] count = new int[10]; // 0~9
    public int solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            count[num]++;
        }
        
        int answer = 0;
        
        for(int num = 0; num < 10; num++){
            int cnt = count[num];
            if (cnt == 0) answer += num;
        }
        
        return answer;
    }
}