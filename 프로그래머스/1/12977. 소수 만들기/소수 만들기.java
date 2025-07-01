class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];   // 세 수의 합
                    int count = 0;
                    for(int a = 2; a <= sum; a++) { //  소수인지 확인
                        if(sum % a == 0) {
                            count++;
                            if(count >= 2) break;
                        }
                    }
                    if(count == 1) answer++;    // 소수인경우
                }
            }
        }
        return answer;
    }
}