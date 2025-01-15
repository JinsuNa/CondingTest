class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        if(num%n == 0){
            answer =1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}

// answer을 sum으로 나눌 때 나머지가 0이면 return을 1하고 나머지 경우에는 0을 return 하면 된다.
