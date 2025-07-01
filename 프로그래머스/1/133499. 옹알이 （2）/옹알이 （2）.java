import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] mu = {"aya", "ye", "woo", "ma"};
        String[] not = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String b : babbling) {
            for(int i = 0; i < mu.length; i++) {
                if(!b.contains(not[i])) {
                    b = b.replace(mu[i], " ");
                }
            }
            if(b.isBlank())
                answer++;
        }
        return answer;
    }
}