import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            list.add(i);
        }
        List<Integer> answer = list.stream()
                .filter(num -> String.valueOf(num).chars().allMatch(c -> c == '0' || c == '5'))
                .collect(Collectors.toList());

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

// 너무 더러워 gpt 한테 가독성이 좋은 코드로 변경하였다 해당 코드는 아래에... stream에 대해 더 공부해야겠다.

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = IntStream.rangeClosed(l, r) // l부터 r까지 숫자 생성
                .filter(num -> String.valueOf(num)
                        .chars()
                        .allMatch(c -> c == '0' || c == '5')) // 0과 5로만 이루어진 숫자 필터링
                .boxed() // int -> Integer 변환
                .collect(Collectors.toList()); // 리스트로 변환

        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}
