import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashMap<Integer, Integer> pocket = new HashMap<>();
        for(int n : nums) {
            pocket.put(n, pocket.getOrDefault(n, 0)+1);
        }
        if(pocket.size() < answer) {
            answer = pocket.size();
        }
        return answer;
    }
}