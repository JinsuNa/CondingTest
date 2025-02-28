

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num+1];
        for(int i=0; i<answer.length; i++){
        answer[i] = start_num++;
        }
        return answer;
    }
}

//  쉽다. 근데 다른 방법을 한번 찾아보자

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start+1];
        for(int i =0; i<= end - start; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}


// 내꺼랑 별 차이는 없긴하다.
