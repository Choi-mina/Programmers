class Solution {
    public int solution(int n) {
        int answer = 0;
        String thrd = Integer.toString(n, 3);
        String s = "";
        for(int i = thrd.length()-1; i >= 0; i--) {
            s += thrd.charAt(i);
        }
        answer = Integer.valueOf(s, 3);
        return answer;
    }
}