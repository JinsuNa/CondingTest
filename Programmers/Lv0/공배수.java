class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        return answer = number % n == 0 && number % m == 0 ? 1 : 0;
    }
}

// 삼항연산자와 and를 사용하면 코드 한줄이면 끝난다.
