import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int user = stages.length;
        Map<Integer, Double> failure = new HashMap<>();
          //   실패율 계산
        for(int i = 1; i <= N; i++) {
            int count = 0;
            for(int s : stages) {
                if(i == s)
                    count++;
            }
            double fail;
            if(count == 0 || user == 0) 
                fail = 0;
            else
                fail = (double) count / user;
            
            failure.put(i, fail);
            user -= count;
        }
        // 값으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(failure.keySet());
        keySet.sort((o1, o2) -> failure.get(o2).compareTo(failure.get(o1)));

        int index = 0;
        for (int key : keySet) {
            answer[index] = key;
            index++;
        }
        
        return answer;
    }
}