class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for(String b : babbling) {
            for(String s : str) {
                b = b.replace(s, "-");
            }
            b = b.replace("-", "");
            if(b.equals(""))
                answer++;
        }
        return answer;
    }
}