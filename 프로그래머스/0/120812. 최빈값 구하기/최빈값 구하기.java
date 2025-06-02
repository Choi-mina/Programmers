import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] l = new int[array[array.length-1]+1];
        for(int i = 0; i < array.length; i++) {
            l[array[i]]++;
        }
        
        int max = -1;
        for(int i = 0; i < l.length; i++) {
           if(l[i] > max) {
               max = l[i];
               answer = i;
           } else if(l[i] == max) {
               answer = -1;
           }
        }
        return answer;
    }
}