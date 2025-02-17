import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;


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
