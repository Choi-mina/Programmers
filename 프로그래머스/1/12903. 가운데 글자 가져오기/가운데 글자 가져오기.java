class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1) {   // 글자 길이가 홀수인 경우
            answer += s.charAt(s.length() / 2);
        } else {
            answer += s.charAt(s.length() / 2 - 1);
            answer += s.charAt(s.length() / 2);
        }
        return answer;
    }
}