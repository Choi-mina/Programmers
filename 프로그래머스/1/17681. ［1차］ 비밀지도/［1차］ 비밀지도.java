import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a1;
        String a2;
        
        for(int i = 0; i < arr1.length; i++) {
            String str = "";
            a1 = Integer.toString(arr1[i], 2);
            a2 = Integer.toString(arr2[i], 2);
            a1 = "0".repeat(n - a1.length()) + a1;
            a2 = "0".repeat(n - a2.length()) + a2;
            for(int j = 0; j < a2.length(); j++) {
                if(a1.charAt(j) == '1' || a2.charAt(j) == '1')
                    str += "#";
                else
                    str += " ";
            }
            answer[i] = str;
        }
        return answer;
    }
}