class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp >= 0 && hp <= 1000) {
            int jangoon = (int) (hp / 5);
            int byungjung = 0;
            int ill = 0;
            
            hp = hp - jangoon * 5;
            byungjung = (int) (hp / 3);

            hp = hp - byungjung * 3;
            ill = hp;
            
            answer = jangoon + byungjung + ill;
        }
        return answer;
    }
}