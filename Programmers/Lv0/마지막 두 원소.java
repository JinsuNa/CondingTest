class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int finalNum = num_list[num_list.length - 1];
        
        int previousNum = num_list[num_list.length - 2];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
            
            if (finalNum > previousNum) {
                
                answer[num_list.length] = finalNum - previousNum;
            } else{
                
                answer[num_list.length] = finalNum * 2;
            }
        }
        return answer;
    }
}

// else 에 처음에  두 숫자가 같을때를 대비하여 else if 로 조건을 추가하였지만 틀린답으로 나와 else로 변경하였다. 그렇게 어렵지 않은 문제다.
