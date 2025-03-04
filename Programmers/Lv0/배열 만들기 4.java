import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        int i =0;
        List<Integer> stk =new ArrayList<>();
        while(i!=arr.length){
                 if(stk.isEmpty()){
               stk.add(arr[i]);
                i+=1;
            }else if(!stk.isEmpty()&&stk.get(stk.size()-1)<arr[i]){
               stk.add(arr[i]);
                i+=1;
            }else if(!stk.isEmpty()&&stk.get(stk.size()-1)>=arr[i]){
                stk.remove(stk.size()-1);
            }
        }
      
       System.out.println(i);
        return stk.stream().mapToInt(x -> x).toArray();
    }
}

//처음에 문제를 이해하는데 시간이 쫌 걸림
//근데 생각해보니 그냥 List와 ArrayList를 사용하면 쉽게 풀 수 있는 문제다.
