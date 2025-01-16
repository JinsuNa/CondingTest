import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < delete_list.length; i++) {

            arrList.remove(Integer.valueOf(delete_list[i]));
        }
         return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}

// List<Integer> ... stream을 사용하는것 보다는 아래와 같이 빈 깡통인 리스트를 만들어 for루프로 add를 넣는게 나는 더 효과적으로 보인다.

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i  : arr) {
            al.add(i);
        }

        for (int i : delete_list) {
            al.remove(Integer.valueOf(i));
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
}
