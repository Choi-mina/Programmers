class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dotw = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int date = 0;
        for(int i = 0; i < a-1; i++)
            date += mon[i];
        date += (b-1);
        answer = dotw[date % 7];
        
        return answer;
    }
}