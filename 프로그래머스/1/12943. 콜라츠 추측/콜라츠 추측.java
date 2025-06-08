class Solution {
    public long solution(long num) {
        long answer = 0;
        while(num != 1) {
            if(num % 2 == 0) {  // 짝수인 경우
                num /= 2;
            } else {    //  홀수인 경우
                num = num * 3 + 1;
            }
            answer++;
            
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}