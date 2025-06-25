import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());
        for(int i = 0; i <= scores.length - m; i += m) {
            int min = scores[i];
            for(int j = i; j < i+m; j++) {
                if(min > scores[j])
                    min = scores[j];
            }
            answer += min * m;
        }
        return answer;
    }
}