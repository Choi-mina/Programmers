import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = budget;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(cnt - d[i] < 0)
                break;
            cnt = cnt - d[i];
            answer++;
        }
        return answer;
    }
}