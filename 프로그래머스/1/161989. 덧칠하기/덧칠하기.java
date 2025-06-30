class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int distance = 0;
        for(int i = 0; i < section.length; i++) {
            if(distance >= section[i])
                continue;
            distance = section[i] + m -1;
            answer++;
        }
        return answer;
    }
}