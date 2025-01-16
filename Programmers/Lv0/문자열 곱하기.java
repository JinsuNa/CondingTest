class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
                for (int i = 0; i < k; i++) {
            answer += my_string;

        }
        return answer;
    }
}


// repeat을 사용하는 방법이 더 가독성이 좋은 코드이다.

        String result = my_string.repeat(3);
        System.out.println(result);

// 두 줄이면 끝난다.
