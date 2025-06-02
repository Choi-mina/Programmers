class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;    // 분모
        int numer = numer1 * denom2 + numer2 * denom1;
        // 최대공약수를 구해 기약분수로 만들기
        int gcdValue = gcd(denom, numer);
        
        answer[0] = numer / gcdValue;
        answer[1] = denom / gcdValue;
        return answer;
    }
    public int gcd(int a, int b) {
        while(b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}