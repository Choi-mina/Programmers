import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == s1[i % s1.length]) {
                correct[0]++;
            }
            if(answers[i] == s2[i % s2.length]) {
                correct[1]++;
            }
            if(answers[i] == s3[i % s3.length]) {
                correct[2]++;
            }
        }
        
        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));
        
        for(int i = 0; i < correct.length; i++) {
            if(correct[i] == max)
                answer.add(i+1);
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}