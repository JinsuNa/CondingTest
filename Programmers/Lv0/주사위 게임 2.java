class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        int[] numbers = {a,b,c};
        int addSquaredNum = 0;
        int addCubeNum = 0;
        
        for(int i =0; i<numbers.length; i++){
            int squared = numbers[i]*numbers[i];
            int cubed = squared * numbers[i];
            addSquaredNum+=squared;
            addCubeNum+=cubed;
    
        }
        
        if(a==b && b==c){
             answer = sum * addCubeNum * addSquaredNum;
        } else if( a == b || b == c || a == c){
             answer = sum * addSquaredNum;
        }else if( a!= b && b!= c && a!= c){
            answer = sum;
        }
        
        return answer;
    }
}

// 조건 중 주사위가 둘만 맞고 하나는 틀린 경우를 찾는데 시간이 많이 잡혔다 그래서 생각을 바꾼데 먼저 if문을 검사할 때 3개가 다맞는 조건을 맨처음에 하고

// 두번 째는 주사위가 두개만 맞고 하나가 틀릴경우 마지막에는 전부 틀릴경우를 넣어 오류를 방지했다.
