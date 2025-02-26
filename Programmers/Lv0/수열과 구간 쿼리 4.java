class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
for(int i = 0; i<queries.length; i++){
    int s = queries[i][0];
    int e = queries[i][1];
    int k = queries[i][2];
    
    for(int j = s; j<=e; j++){
        if(j%k==0){
            answer[j]+=1;
        }
    }
}
        return answer;
    }
}

// 주의해야할 점은 arr[j]의 배수가 아닌 index[j]의 배수를 비교를 하는거기 때문에 유의해야 한다.
