class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] num = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            if(!num[i]) {
                answer++;
                for(int j = i; j <= n; j = j+i)
                    num[j] = true;
            }
        }
        return answer;
    }
}