class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += " ";
                flag = true;
                num = 0;
            } else {
                if(flag) {
                    answer += Character.toUpperCase(s.charAt(i));
                    flag = false;
                    num++;
                } else {
                    if(num % 2 == 1)
                        answer += Character.toLowerCase(s.charAt(i));
                    else
                        answer += Character.toUpperCase(s.charAt(i));
                    num++;
                }
            }
        }
        return answer;
    }
}