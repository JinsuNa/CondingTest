class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int sum = 0;
        for(int i = 0; i<num_list.length; i++){
            a = a * num_list[i];
            sum += num_list[i];
        }
        int b = sum*sum;
        
        return a<b?1:0;
    }
}
