class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String ineqSum = ineq + eq;
           if (ineqSum.equals("<=")) {
            answer = n <= m ? 1 : 0;
        } else if (ineqSum.equals(">=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineqSum.equals(">!")) {
            answer = n > m ? 1 : 0;
        } else if (ineqSum.equals("<!")) {
            answer = n < m ? 1 : 0;
        }
        return answer;
    }
}

//처음엔 어떻게해야 했지만 .equals를 사용하여 삼항연산자로 answer의 값을 0,1의 값을 return해주면 된다.
