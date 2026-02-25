class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 0 ||
          arr.length == 1 && arr[0] == 10
          ) return new int[] {-1};

          
        int min = arr[0];
        int minIdx = 0;
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(min > num) {
                min = num;
                minIdx = i;
            }
        }

        // 가장 작은 수 제거하기
        int[] answer = new int[arr.length-1];
        int answerIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != minIdx) {
                answer[answerIdx] = arr[i];
                answerIdx++;
            }
        }
         return answer;
    }
}