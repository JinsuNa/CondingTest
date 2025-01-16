class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
         for (int x : num_list) {
            while (x == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

// 좀 더 간결한 코드

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
          for (int x : num_list) {
            if (x==n) answer = 1;
        }
        return answer;
    }
}
