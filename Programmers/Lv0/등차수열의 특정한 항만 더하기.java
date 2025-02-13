class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arr = new int[included.length];
//         등차수열까지 만드는거 완료.
        for(int i = 0; i<included.length; i++){
           if(i==0){
               arr[0] = a;
           } else {
               arr[i] = arr[i-1] + d;
               }
                     if(included[i]){
                   answer+=arr[i];
           }
        }
   
return answer;
    }
}
