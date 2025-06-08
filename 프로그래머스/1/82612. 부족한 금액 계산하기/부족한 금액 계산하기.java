class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0; // 놀이기구 이용 금액
        
        for(int i = 1; i <= count; i++) {
            total += price * i;
        }
        
        if(total > money)
            answer = total - money; 

        return answer;
    }
}