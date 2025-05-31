import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        for(int[] s : sizes) {
            wMax = Math.max(wMax, Math.max(s[0], s[1]));
            hMax = Math.max(hMax, Math.min(s[0], s[1]));
        }
        return wMax * hMax;
    }
}