class Solution {
    public int solution(int n) {
        int answer = 0;
         if (n % 2 != 0) {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }else{
            for (int i = 2; i <= n; i+=2) {
                answer += (i * i);
            }
        }
        return answer;
    }
}

// 삼항연산자를 쓰게되면 n의 홀짝 판별이 중복으로 되기 때문에 여기에는 삼항연산자는 부적절하다.

class Solution {
    public int solution(int n) {
        int answer = 0;

            for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }
}
