import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(i >= k) {
                if(arr.get(arr.size()-1) < score[i]) {
                    arr.remove(arr.size()-1);
                } else {
                    answer[i] = arr.get(arr.size()-1);
                    continue;
                }
            }
            arr.add(score[i]);
            Collections.sort(arr, Collections.reverseOrder());  // 내림차순 정렬
            answer[i] = arr.get(arr.size()-1);
        }
        return answer;
    }
}