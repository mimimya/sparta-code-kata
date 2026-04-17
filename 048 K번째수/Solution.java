import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 결과를 담을 배열 (command 수 만큼 크기 지정)
        int[] answer = new int[commands.length];

        for(int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            // 1. i번째부터 j번째까지 자르기 
            int[] slice = Arrays.copyOfRange(array, i - 1, j);

            // 2. 정렬하기
            Arrays.sort(slice);

            // 3. k번째 수 추출하여 결과 배열에 담기
            answer[c] = slice[k - 1];
        }

        return answer;
    }
}