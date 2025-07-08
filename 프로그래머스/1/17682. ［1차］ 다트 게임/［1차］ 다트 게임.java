class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] result = new int[3];
        String str = "";
        int score = 0;
        int j = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            switch(dartResult.charAt(i)) {
                case 'S' :
                    score = Integer.parseInt(str);
                    result[j++] = (int) Math.pow(score, 1);
                    str = "";
                    break;
                case 'D' :
                    score = Integer.parseInt(str);
                    result[j++] = (int) Math.pow(score, 2);
                    str = "";
                    break;
                case 'T' :
                    score = Integer.parseInt(str);
                    result[j++] = (int) Math.pow(score, 3);
                    str = "";
                    break;
                case '*' :
                    result[j-1] *= 2;
                    if(j - 2 >= 0)
                        result[j-2] *= 2;
                    break;
                case '#' :
                    result[j-1] *= -1;
                    break;
                default: 
                    str += String.valueOf(dartResult.charAt(i));
                    score = Integer.parseInt(str);
                    break;
            }
        }
        return answer = result[0] + result[1] + result[2];
    }
}