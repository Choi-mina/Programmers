import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0) {
            arr.add((int) (n % 10));
            n /= 10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.size(); i++) {
            answer += Math.pow(10, arr.size()-i-1) * arr.get(i);
        }
        return answer;
    }
}