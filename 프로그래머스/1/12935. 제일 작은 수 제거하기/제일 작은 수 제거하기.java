class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        
        // 최소값 찾기
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        int index = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(min != arr[i]) {
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}