import java.util.Arrays;

class Solution {
    public int solution(int n, String control) {
//         control 문자열을 하나씩 쪼개 배열로 바꾼다음 문자를 한개씩 비교하여 점수를 추가한다.
        char[] arr = control.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'w':
                    n += 1;
                    break;

                case 's':
                    n -= 1;
                    break;

                case 'd':
                    n += 10;
                    break;

                case 'a':
                    n -= 10;
                    break;

                default:
                    continue;
            }
        }

        return n;
    }
}
