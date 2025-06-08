class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int n = left; n <= right; n++) {
            int count = 0;
            for(int i = 1; i <= n; i++) {
                if(n % i == 0)  // 약수인 경우
                    count++;
            }
            if(count % 2 == 0)  // 약수의 개수가 짝수인 경우
                answer += n;
            else    // 약수의 개수가 홀수인 경우
                answer -= n;
        }
        return answer;
    }
}