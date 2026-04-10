import java.util.Map;
class Solution {
    public int solution(String s) {
        Map<String, Integer> map =  Map.of(
            "zero", 0,
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9
        );
        
        // 순서대로 합쳐가면서 숫자일 땐 바로 합치고,
        // 문자일땐 map의 키가 만들어지는 지 확인, 만들어지면 숫자로 변경해 합침
        StringBuilder temp = new StringBuilder(); // 문자
        StringBuilder answer = new StringBuilder(); // 숫자
        for(char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
                answer.append(c);
            } else {
                temp.append(c);
                if (map.containsKey(temp.toString())) {
                    answer.append(map.get(temp.toString()));
                    temp.setLength(0); // 초기화
                }
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
}