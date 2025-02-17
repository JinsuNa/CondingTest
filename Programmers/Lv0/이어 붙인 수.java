import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

//어려움
class Solution {
    public int solution(int[] num_list) {
        
       ArrayList<Integer> even = new ArrayList<>(); 
       ArrayList<Integer> odd = new ArrayList<>(); 
       
//         num_list 각 홀수, 짝수 배열에 넣는 작업 시작
         for(int i = 0; i<num_list.length; i++){
             if(num_list[i]%2==0){
                 even.add(num_list[i]);
             }else{
                 odd.add(num_list[i]);
             }
         }
//         num_list 각 홀수, 짝수 배열에 넣는 작업 끝    
        
//         even, odd 배열에 있는걸 합친 문자열로 변환 후 다시 숫자로 변환 작업 시작
        int evenNum = convertListToInt(even);
        int oddNum = convertListToInt(odd);
//         even, odd 배열에 있는걸 합친 문자열로 변환 후 다시 숫자로 변환 작업 끝
        
        return evenNum+oddNum;
    }
//     StringBuilder 변환 함수 추가 시작
    public int convertListToInt(ArrayList<Integer> list){
        StringBuilder sb = new StringBuilder();
        for(int num:list){
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }
//     StringBuilder 변환 함수 추가 끝
    
}




// 위 코드는 너무 가독성이 떨어져 다른 방식으로 접근하였다.(Integer.parseInt() 로 변경하는 방식)
    class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i : num_list){
            if(i%2==0) even+= i;
                else odd+=i;
        }
        answer = Integer.parseInt(even)+Integer.parseInt(odd);
        return answer;
    }
}
