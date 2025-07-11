class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1 = 0;
        int c2 = 0;
        for(String g : goal) {
           if(c1 < cards1.length && cards1[c1].equals(g)) {
                c1++;
                continue;
           } else if(c2 < cards2.length && cards2[c2].equals(g)) {
               c2++;
               continue;
           } else {
               answer = "No";
               break;
           }
        }
        return answer;
    }
}