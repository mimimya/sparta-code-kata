class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int index = 0;
        for(String s : seoul){
            if(s.equals("Kim")){ answer += index; break; }
            index++;
        }
        return answer + "에 있다";
    }
}