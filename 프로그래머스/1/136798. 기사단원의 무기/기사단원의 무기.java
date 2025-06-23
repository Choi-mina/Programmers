class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for(int i = 1; i <= number; i++) {  // 약수의 개수 구하기
            for(int j = 1; j <= (int) Math.sqrt(i); j++) {
                if(i % j == 0) {
                    arr[i-1]++;
                    if(i / j != j) arr[i-1]++;
                }
            }
        }
        for(int i : arr) {
            if(i > limit)
                answer += power;
            else
                answer += i;
        }
        return answer;
    }
}