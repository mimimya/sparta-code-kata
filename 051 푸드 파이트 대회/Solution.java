class Solution {
    public String solution(int[] food) {
        int totalLength = 1; 
        for (int i = 1; i < food.length; i++) {
            totalLength += (food[i] / 2) * 2;
        }

        char[] result = new char[totalLength];
        
        // 양 끝 인덱스 
        int left = 0;
        int right = totalLength - 1;
        
        // 중앙에 물 배치
        result[totalLength / 2] = '0';

        // 양방향으로 음식 채우기
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            char foodChar = (char) (i + '0');
            
            for (int j = 0; j < count; j++) {
                result[left++] = foodChar;
                result[right--] = foodChar;
            }
        }

        return new String(result);
    }
}