class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
                
            int num = s.charAt(i) + n;
            if((60 <= s.charAt(i) && s.charAt(i) <= 90) && num > 90)
                answer += (char) (num - 26);
            else if((97 <= s.charAt(i) && s.charAt(i) <= 122) && num > 122) 
                answer += (char) (num - 26);
            else 
                answer += (char) (num);
        }
        return answer;
    }
}