import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n!=1){
            if(n%2 == 0){
                n/=2;
                answer.add(n);
            }else if(n%2 != 0){
                n= 3*n+1;
                answer.add(n);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

// 그렇게 어렵지 않은 문제였으며, 리스트에서 return을 반환할 때 저 stream을 사용하는걸 찾니라 시간을 많이 소모하였다.
