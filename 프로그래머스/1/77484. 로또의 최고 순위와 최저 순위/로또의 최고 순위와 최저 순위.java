class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int bingo = 0;
        for(int lotto : lottos) {
            if(lotto == 0) {    // 알 수 없는 번호 카운트
                zero++;
                continue;
            }
            for(int win : win_nums) {
                if(lotto == win) {
                    bingo++;
                }
            }
        }
        
        System.out.println(bingo + " " + (bingo+zero));
        
        // 최저순위
        if(bingo == 6)
            answer[1] = 1;
        else if(bingo == 5)
            answer[1] = 2;
        else if(bingo == 4)
            answer[1] = 3;
        else if(bingo == 3)
            answer[1] = 4;
        else if(bingo == 2)
            answer[1] = 5;
        else
            answer[1] = 6;
        
        // 최고순위
        if(bingo + zero == 6)
            answer[0] = 1;
        else if(bingo + zero == 5)
            answer[0] = 2;
        else if(bingo + zero == 4)
            answer[0] = 3;
        else if(bingo + zero == 3)
            answer[0] = 4;
        else if(bingo + zero == 2)
            answer[0] = 5;
        else
            answer[0] = 6;
        
        return answer;
    }
}