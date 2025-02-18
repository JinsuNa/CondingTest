class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[arr.length];
        int num = 0;
        answer = arr;
        
        for(int i =0; i<queries.length; i++){
            num = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = num;
        }

        return answer;
    }
}

// 배열을 업데이트를 하는 과정이라 생각하기에 머리아팠지만 업데이트를 하기 전 숫자를 num에 저장하여 배열을 변경하고 num의 값을 대입하면 업데이트가 완료된다.
