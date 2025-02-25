class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;

            for(int x = s; x <=e; x++){
                if(arr[x] > k && arr[x] <min){
                    min = arr[x];
                }
            }

            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;

        }

        return answer;
    }
}
