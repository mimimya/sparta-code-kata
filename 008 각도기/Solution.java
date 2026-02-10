class Solution {
    public int solution(int angle) {
        switch (angle){
        case 90: return 2;
        case 180: return 4;
        }
        if(angle < 90) return 1;
        else return 3;
    }
}